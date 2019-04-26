package com.example.lenovo.assignmentsec.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.lenovo.assignmentsec.BR;
import com.example.lenovo.assignmentsec.model.User;

//import com.example.lenovo.myassignment.BR;
//import com.example.lenovo.myassignment.model.User;

public class ViewModal extends BaseObservable {
    private User user;


    private String errorMessage = "Email or Password not valid";

    @Bindable
    public String toastMessage = null;


    @Bindable
    public String getHintEmail() {
        return user.getHintEmail();
    }

    @Bindable
    public String getHintPassword() {
        return user.getHintPasword();
    }
    public String getToastMessage() {
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public ViewModal(String emailhint, String emailpassword) {
        user = new User(emailhint,emailpassword);
    }

    public void afterEmailTextChanged(CharSequence s) {
        user.setEmail(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        user.setPassword(s.toString());
    }

    public void onLoginClicked() {
        if (user.isInputDataValid())
            setToastMessage(user.getEmail()+" login successfully");
        else
            setToastMessage(errorMessage);
    }

    public void setHintEmail(String hint) {
        user.setHintEmail(hint);
        notifyPropertyChanged(BR.hintEmail);
    }
    public void setHintPassword(String hint) {
        user.setHintPasword(hint);
        notifyPropertyChanged(BR.hintPassword);
    }

}