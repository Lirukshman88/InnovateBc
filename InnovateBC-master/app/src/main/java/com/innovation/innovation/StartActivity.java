package com.innovation.innovation;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, btnSignUp, btnSignIn;
    LoginDataBaseAdapter loginDataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        if(SaveSharedPreference.getUserName(StartActivity.this).length() != 0)
        {
            startActivity(new Intent(StartActivity.this, FlipContent.class));
        }

        button = (Button) findViewById(R.id.button);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);

        button.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);

        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                CharSequence text = "This is a toast";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(StartActivity.this, text, Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnSignUp:
                startActivity(new Intent(StartActivity.this, SignUpActivity.class));
                break;

            case R.id.btnSignIn:

                final Dialog dialog = new Dialog(StartActivity.this);
                dialog.setContentView(R.layout.activity_sign_in);
                dialog.setTitle("Login");

                // get the Refferences of views
                final EditText editTextUserName = (EditText) dialog.findViewById(R.id.editTextUserNameToLogin);
                final EditText editTextPassword = (EditText) dialog.findViewById(R.id.editTextPasswordToLogin);

                Button btnSignIn = (Button) dialog.findViewById(R.id.buttonSignIn);

                // Set On ClickListener
                btnSignIn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        // get The User name and Password
                        String userName = editTextUserName.getText().toString();
                        SaveSharedPreference.setUserName(StartActivity.this, userName);


                        String password = editTextPassword.getText().toString();

                        // fetch the Password form database for respective user name
                        String storedPassword = loginDataBaseAdapter.getSinlgeEntry(userName);

                        // check if the Stored password matches with  Password entered by user
                        if (password.equals(storedPassword)) {
                            Toast.makeText(StartActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(StartActivity.this, FlipContent.class);
                            i.putExtra("username", userName);
                            startActivity(i);
                            //startActivity(new Intent(MainActivity.this, HomeActivity.class));
                            dialog.dismiss();
                        } else {
                            Toast.makeText(StartActivity.this, "User Name or Password is Incorrect", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                dialog.show();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }

}
