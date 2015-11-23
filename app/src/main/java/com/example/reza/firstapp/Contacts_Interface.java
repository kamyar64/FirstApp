package com.example.reza.firstapp;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by pouya on 7/20/15.
 */
public interface Contacts_Interface {
    @GET("/contacts/")
    void getService(
            Callback<ContactsObj> callback);
}
