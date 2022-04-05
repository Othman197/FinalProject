package com.example.myapplication;

import java.io.Serializable;

public class Hadeeth implements Serializable {
   private String hadeethtext;
   private String descrebinon;

    public Hadeeth(String hadeethtext, String descrebinon) {
        this.hadeethtext = hadeethtext;
        this.descrebinon = descrebinon;
    }

    public String getHadeethtext() {
        return hadeethtext;
    }

    public void setHadeethtext(String hadeethtext) {
        this.hadeethtext = hadeethtext;
    }

    public String getDescrebinon() {
        return descrebinon;
    }

    public void setDescrebinon(String descrebinon) {
        this.descrebinon = descrebinon;
    }
}
