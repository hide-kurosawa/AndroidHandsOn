package com.example.handson.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> message = new MutableLiveData<>("Hello from ViewModel.");
    public MutableLiveData<String> getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message.setValue(message);
    }
}