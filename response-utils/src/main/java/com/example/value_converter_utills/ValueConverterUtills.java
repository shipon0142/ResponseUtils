package com.example.value_converter_utills;

import android.widget.EditText;

public class ValueConverterUtills {
    public static String TextValueOf(EditText fieldName,String defaultValue) {
        String value = fieldName.getText().toString();
        if(value.equals(""))value=defaultValue;
        return value;
    }
}
