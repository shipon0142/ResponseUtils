package com.example.value_converter_utils;

import android.widget.EditText;

public class ValueConverterUtils {
    public static String TextValueOf(EditText fieldName,String defaultValue) {
        String value = fieldName.getText().toString();
        if(value.equals(""))value=defaultValue;
        return value;
    }
}
