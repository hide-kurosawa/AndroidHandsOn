package com.example.handson.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> message = new MutableLiveData<>("This is Main.");
    public MutableLiveData<String> getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message.setValue(message);
    }
}