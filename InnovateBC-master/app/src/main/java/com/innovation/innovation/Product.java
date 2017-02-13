package com.innovation.innovation;

import static android.R.attr.type;

/**
 * Created by KallenTu on 9/11/2016.
 */

/*
com.innovation.innovation.Product class contains private data members for the internal storage of data columns from database entries and a set of methods to get and set those values.
 */

public class Product {
    //Holds product id, product and description
    private int _id;
    private String _product;
    private String _description;
    private String _type;
    private String _purpose;
    private String _location;
    private String _schools;
    private String _contacts;

    //com.innovation.innovation.Product default constructor
    public Product() {}

    //com.innovation.innovation.Product constructor with parameters to set
    public Product(int id, String product, String description, String type, String purpose, String location, String schools, String contacts) {
        this._id = id;
        this._product = product;
        this._description = description;
        this._type = type;
        this._purpose = purpose;
        this._location = location;
        this._schools = schools;
        this._contacts = contacts;
    }

    //com.innovation.innovation.Product constructor without id
    public Product(String product, String description, String type, String purpose, String location, String schools, String contacts) {
        this._product = product;
        this._description = description;
        this._type = type;
        this._purpose = purpose;
        this._location = location;
        this._schools = schools;
        this._contacts = contacts;
    }

    //Updates id
    public void setID(int id) {
        this._id = id;
    }

    //Returns id
    public int getID() {
        return this._id;
    }

    //Sets product
    public void setProduct(String product) {
        this._product = product;
    }

    //Returns product
    public String getProduct() {
        return this._product;
    }

    //Updates description
    public void setDescription(String description) {
        this._description = description;
    }

    //Returns description
    public String getDescription() {
        return this._description;
    }

    //Updates product type
    public void setProductType(String type) {
        this._type = type;
    }

    //Returns product type
    public String getProductType() {
        return this._type;
    }

    //Updates product purpose
    public void setProductPurpose(String purpose) {
        this._purpose = purpose;
    }

    //Returns product purpose
    public String getProductPurpose() {
        return this._purpose;
    }

    //Updates product location
    public void setProductLocation(String location) {
        this._location = location;
    }

    //Returns product location
    public String getProductLocation() {
        return this._location;
    }

    //Updates product schools
    public void setProductSchools(String schools) {
        this._schools = schools;
    }

    //Returns product schools
    public String getProductSchools() {
        return this._schools;
    }

    //Updates product contacts
    public void setProductContacts(String contacts) {
        this._contacts = contacts;
    }

    //Returns product schools
    public String getProductContacts() {
        return this._contacts;
    }
}