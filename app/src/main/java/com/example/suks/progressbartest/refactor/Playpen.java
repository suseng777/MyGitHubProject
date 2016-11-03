package com.example.suks.progressbartest.refactor;

import android.os.Bundle;
import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by suks on 2016/11/2.
 */
public class Playpen {
    public static final String SU = "su";
    public static final String WANG = "WANG";
    private  Date date = new Date();
    private Bundle bundle;
    public static final String STRING1 = "test 1";
    public static final String STRING2 = "test 2";
    public static final String STRING3 = "test 3";


    public Playpen() {
        if (bundle == null) {
            this.bundle = new Bundle();
        }
    }

    public Playpen(Bundle bundle) {
        this.bundle = bundle;
    }

    private String methodHello(){
        String greet = "hello";
        return getString(greet);
    }

    @NonNull
    private String getString(String greet) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i<10;i++) {
            stringBuilder.append(greet + i);
        }
        return stringBuilder.toString();
    }

    private String methodAndroid(){
        String greet = "android";
        return getString(greet);
    }


    public Object greeTings(String messages) {
        return greeTings(messages, 0);
    }

    public Object greeTings(String messages, int count) {
        return  "Hello"+ messages;
    }

    public String saySomething(){
        String something =  "Something";
        String something1 = something;
        return something1;
    }

    private  void addName(String name) {
        bundle.putString(SU, STRING1);
        bundle.putString(WANG, STRING2);
    }

    private Date getDate() {
        return date;
    }

}

