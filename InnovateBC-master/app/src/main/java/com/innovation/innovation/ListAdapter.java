package com.innovation.innovation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liruk on 2016-12-02.
 */

public class ListAdapter extends BaseAdapter {

    private int page = 0;

    public interface Callback {
        public void onPageRequested(int page);
    }

    static public class Item {

        long id = 0;

        long mId;

        public Item() {
            mId = id;
        }

        long getId() {
            return mId;
        }
    }

    private LayoutInflater inflater;
    private List<Item> items = new ArrayList<Item>();


    public ListAdapter(Context context, int value) {
        inflater = LayoutInflater.from(context);
        page = value;
        for (int i = 0; i < 1; i++) {
            items.add(new Item());
        }
    }

    public void setPosition(int value) { page = value; }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        //Changes the text
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.content_project_flip, parent, false);

            //holder.productID = (TextView) convertView.findViewById(R.id.productID);
            //holder.productTypeBox = (TextView) convertView.findViewById(R.id.productType);
            //holder.productPurposeBox = (TextView) convertView.findViewById(R.id.productPurpose);
            //holder.productLocationBox = (TextView) convertView.findViewById(R.id.productLocation);
            holder.productBox = (TextView) convertView.findViewById(R.id.product);
            holder.descriptionBox = (TextView) convertView.findViewById(R.id.productDescription);
            holder.productSchoolsBox = (TextView) convertView.findViewById(R.id.productSchools);
            holder.productContactsBox = (TextView) convertView.findViewById(R.id.productContacts);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        //Uses database handler to find the product located at a certain id number
        DBHandler dbHandler = new DBHandler(parent.getContext(), null, null, 1);
        Product product = dbHandler.findProduct(String.valueOf(page + 1));


        //TODO set a text with the id as well
        //holder.productID.setText(String.valueOf(product.getID()));
        //holder.productTypeBox.setText(String.valueOf(product.getProductType()));
        //holder.productPurposeBox.setText(String.valueOf(product.getProductPurpose()));
        //holder.productLocationBox.setText(String.valueOf(product.getProductLocation()));
        holder.productBox.setText(String.valueOf(product.getProduct()));
        holder.descriptionBox.setText(String.valueOf(product.getDescription()));
        holder.productSchoolsBox.setText(String.valueOf(product.getProductSchools()));
        holder.productContactsBox.setText(String.valueOf(product.getProductContacts()));

        return convertView;


    }


    static class ViewHolder {
        TextView productID;
        TextView productTypeBox;
        TextView productPurposeBox;
        TextView productLocationBox;
        TextView productBox;
        TextView descriptionBox;
        TextView productSchoolsBox;
        TextView productContactsBox;
    }


    public void addItems(int amount) {
        for(int i = 0 ; i<amount ; i++){
            //items.add(new ListAdapter.Item());
        }
        notifyDataSetChanged();
    }

}



