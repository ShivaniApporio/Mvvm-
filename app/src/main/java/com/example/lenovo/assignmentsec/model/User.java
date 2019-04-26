package com.example.lenovo.assignmentsec.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {
    private String Email;
    private String Password;
    private  String HintEmail;
    private  String HintPasword;

    public User(String hint_email, String hint_password) {

        HintEmail=hint_email;
        HintPasword=hint_password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 5;
    }

    public String getHintEmail() {
        return HintEmail;
    }

    public void setHintEmail(String hintEmail) {
        HintEmail = hintEmail;
    }

    public String getHintPasword() {
        return HintPasword;
    }

    public void setHintPasword(String hintPasword) {
        HintPasword = hintPasword;
    }
}
