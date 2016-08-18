package com.example.jimwo.longinpage;

import java.io.Serializable;

/**
 * Created by jimwo on 2016-08-04.
 */
public class Data implements Serializable {
    String name;
    int a;

    public Data(String a, int i) {
    }

    void Data(String b, int c){
        this.name = b;
        this.a = c;

    }
    public String toString(){
        return String.format("Hello World");
    }
}
