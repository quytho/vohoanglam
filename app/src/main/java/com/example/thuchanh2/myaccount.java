package com.example.thuchanh2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class myaccount extends AppCompatActivity {
    private ListView lvContact;
    private TabLayout tablayout;
    private ViewPager viewPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);
        Button btn = (Button) findViewById(R.id.btn_logout);
        lvContact = (ListView) findViewById(R.id.lv_profile);
        ArrayList<Contact> arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.common_google_signin_btn_icon_light_focused, "The Coffee House Rewards");
        Contact contact2 = new Contact(R.drawable.common_google_signin_btn_icon_light, "Thông Tin Tài Khoản");
        Contact contact3 = new Contact(R.drawable.common_google_signin_btn_icon_light, "Nhạc đang phát");
        Contact contact4 = new Contact(R.drawable.common_google_signin_btn_icon_light_focused, "Lịch sử");
        Contact contact5 = new Contact(R.drawable.common_google_signin_btn_icon_light_focused, "Giúp đỡ");
        Contact contact6 = new Contact(R.drawable.common_google_signin_btn_icon_light_focused, "Cài đặt");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);

        Adapter customAdapter = new Adapter(this, R.layout.row_item, arrayList);
        lvContact.setAdapter(customAdapter);
    }


}




