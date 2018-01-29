package com.example.macmine.horizontalscrollviewnheadernlist.model;

import java.io.Serializable;

/**
 * Created by macmine on 03/11/17.
 */

public class UserData implements Serializable{

    String name,age, mobile, weight, heigh , mclass , collage;


    public String getMclass() {
        return "12th";
    }

    public void setMclass(String mclass) {
        this.mclass = mclass;
    }

    public String getCollage() {
        return "University";
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getName() {

        return "Ajay";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return "24";
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile() {
        return "9999999999";
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeight() {
        return "70";
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeigh() {
        return "6.0";
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }
}
