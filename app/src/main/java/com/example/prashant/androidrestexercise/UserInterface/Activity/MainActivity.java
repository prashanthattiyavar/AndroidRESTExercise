package com.example.prashant.androidrestexercise.UserInterface.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.prashant.androidrestexercise.Logic.DataObject;
import com.example.prashant.androidrestexercise.R;
import com.example.prashant.androidrestexercise.UserInterface.Fragment.ListFragment;

public class MainActivity extends AppCompatActivity implements ListFragment.OnRowSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment(ListFragment.newInstance());
    }

    private void initFragment(Fragment detailFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.mainFrame, detailFragment);
        transaction.commit();
    }

    @Override
    public void onArticleSelected(DataObject mData) {

    }
}
