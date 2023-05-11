package com.example.handson.ui.next;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NextViewModel extends ViewModel {
    private MutableLiveData<String> message = new MutableLiveData<>("This is Next.");
    public MutableLiveData<String> getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message.setValue(message);
    }
}