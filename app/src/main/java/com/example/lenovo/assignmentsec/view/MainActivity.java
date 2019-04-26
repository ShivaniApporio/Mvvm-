package com.example.lenovo.assignmentsec.view;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.assignmentsec.R;
import com.example.lenovo.assignmentsec.viewmodel.ViewModal;
import com.example.lenovo.assignmentsec.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new ViewModal("Enter Email-Id","Enter password"));

    }

    @BindingAdapter({"toastMessage"})
    public static void onButtonClick(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }



}
