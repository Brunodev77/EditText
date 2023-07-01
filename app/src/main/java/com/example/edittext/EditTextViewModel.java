package com.example.edittext;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditTextViewModel extends ViewModel {
    private MutableLiveData<String> textView;
    private MutableLiveData<String> editText;

    public EditTextViewModel() {
        textView = new MutableLiveData<>("Digite um texto");
        editText = new MutableLiveData<>("");
    }

    public MutableLiveData<String> getTextView() {
        return textView;
    }

    public MutableLiveData<String> getEditText() {
        return editText;
    }

    public void colocarTexto(String texto){
        textView.setValue(texto);
        editText.setValue("");
    }
}
