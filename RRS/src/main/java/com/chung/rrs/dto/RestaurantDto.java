package com.chung.rrs.dto;



import java.io.IOException;
import java.util.*;

import com.chung.rrs.io.FileIO;

import fomat.Format;

public class RestaurantDto implements Comparable<RestaurantDto>{
    public static String[] temp;
    String name;
    String phone;
    String signature_Menu;
    int menu_Price;
    int rating;

    static Scanner scanner = new Scanner(System.in);

    /**
     *레스토랑 객체
     * @param name String  식당명
     * @param phone String 전화번호
     * @param signature_Menu    String 시그니처메뉴
     * @param menu_Price    int 메뉴 가격
     * @param rating    int 평점
     */
    public RestaurantDto(String name, String phone, String signature_Menu, int menu_Price, int rating){
        this.name = name;
        this.phone = phone;
        this.signature_Menu=signature_Menu;
        this.menu_Price = menu_Price;
        this.rating = rating;
    }



    public int getMenu_Price() {
        return menu_Price;
    }

    public long getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSignature_Menu() {
        return signature_Menu;
    }



    public String getString() {
        StringBuilder str = new StringBuilder(getName() + "\t/" + getPhone() + "\t/" + getSignature_Menu() + "\t\t/" + getMenu_Price() + "\t/");
        for (int i = 0; i < getRating(); i++) str.append("*");
        return str.toString();
    }

    @Override
    public int compareTo(RestaurantDto restaurant) {
        if (restaurant.getRating() > rating) {
            return 1;
        } else if (restaurant.getRating() < rating) {
            return -1;
        }
        return 0;
    }
}
