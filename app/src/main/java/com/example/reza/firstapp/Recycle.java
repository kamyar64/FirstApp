package com.example.reza.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import com.example.reza.firstapp.RVAdapter;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Recycle extends AppCompatActivity {
    private ArrayList<Result> contacts;
    private RecyclerView newsRC;


    private RecyclerView.Adapter mAdapter;
    private  LinearLayoutManager llm;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        newsRC = (RecyclerView)findViewById(R.id.rv);
        newsRC.setHasFixedSize(true);
        llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        newsRC.setLayoutManager(llm);
        contacts = new ArrayList<>();
        mAdapter = new RVAdapter(contacts);
        newsRC.setAdapter(mAdapter);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://146.185.172.42:80")
                .build();
        Contacts_Interface contactService = restAdapter.create(Contacts_Interface.class);
        contactService.getService(new Callback<ContactsObj>() {
            @Override
            public void success(ContactsObj contactsObj, Response response) {
                for (int i = 0; i < contactsObj.getResults().length; i++) {
                    Result resObj = new Result();
                    resObj.setAddress(contactsObj.getResults()[i].getAddress());
                    resObj.setCell_no(contactsObj.getResults()[i].getCell_no());
                    resObj.setCreated_date(contactsObj.getResults()[i].getCreated_date());
                    resObj.setFull_name(contactsObj.getResults()[i].getFull_name());
                    contacts.add(resObj);
                }
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });




    }

}