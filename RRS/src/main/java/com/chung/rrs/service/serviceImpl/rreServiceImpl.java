package com.chung.rrs.service.serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.chung.rrs.dto.RestaurantDto;
import com.chung.rrs.io.FileIO;
import com.chung.rrs.service.rrsService;

import fomat.Format;

public class rreServiceImpl implements rrsService{
	static Scanner scanner = new Scanner(System.in);
	
    public static void add() throws IOException {
        System.out.println("restaurant_name/phone/signature_Menu/menu_Price/rating");
        String restaurant_info = scanner.nextLine();
        String[] temp = restaurant_info.split("/");
        if(check_Format(temp)){
            System.out.println("Please attention restaurant Format");
            add();
        }else {

            String name = Format.name(temp[0]);
            String phone = Format.phone(temp[1]);
            String signature_Menu = Format.menu(temp[2]);
            int menu_Price = Format.price(temp[3]);
            int rating = Format.rating(temp[4]);
            RestaurantDto restaurant = new RestaurantDto(name, phone, signature_Menu, menu_Price, rating);
            //id 구현해서 하나 추가할때마다 카운트 증가하게 하고싶은데 텍스트파일을 매번 읽을 수 도 없구 어카지;;;
            FileIO.insert_Restaurant(restaurant);
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }

    private static boolean check_Format(String[] temp) {
        RestaurantDto.temp = temp;
        if(temp[0].isBlank()){
            System.out.println("Name doesn't exist");
            return true;
        }
        if(temp[1].isBlank()){
            System.out.println("PhoneNumber doesn't exist");
            return true;
        }
        for (int i = 0; i < temp[1].length(); i++) {
            char c = temp[1].charAt(i);
            if(c=='-')continue;
            if( c<'0' ||c>'9'){
                System.out.println("PhoneNumber insert only numbers");
                return true;
            }
        }
        if(temp[2].isBlank()){
            System.out.println("Signature Menu doesn't exist");
            return true;
        }
        if(temp[3].isBlank()){
            System.out.println("Price doesn't exist");
            return true;
        }

        for (int i = 0; i < temp[3].length(); i++) {
            char c= temp[3].charAt(i);

            if( c<'0' ||c>'9'){
                System.out.println("Price insert only numbers");
                return true;
            }
        }
        if(temp[4].isBlank()){
            System.out.println("Rating doesn't exist");
            return true;
        }
        for (int i = 0; i < temp[3].length(); i++) {
            char c= temp[3].charAt(i);

            if( c<'0' ||c>'9'){
                System.out.println("Price insert only numbers");
                return true;
            }
        }
        return false;
    }


    public static void delete() throws IOException {
        System.out.println("Insert Restaurant Name");
        String name = scanner.next();
        if(check_Format(new String[]{name, "0", "signature_Menu", "0", "0"})){
            delete();
        }

        if(FileIO.delete_Restaurant(name)){
            System.out.println("Delete complete");
        }else {
            System.out.println("Can't find Restaurant Name");
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }

    public static void search() throws IOException {
        System.out.println("Insert Restaurant Name");
        String name = scanner.next();
        if(check_Format(new String[]{name, "0", "signature_Menu", "0", "0"})){
            search();
        }
        RestaurantDto restaurant = FileIO.search_Restaurant(name);
        if(restaurant != null){
            System.out.println(
                    restaurant.getString()
            );
        }else {
            System.out.println("Can't find Restaurant Name");
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }

    public static void modify() throws IOException {
        System.out.println("Insert Modify Restaurant Info");
        System.out.println("restaurant_name/phone/signature_Menu/menu_Price/rating");
        String restaurant_info = scanner.nextLine();
        String[] temp = restaurant_info.split("/");
        if(check_Format(temp)){
            System.out.println("Please attention restaurant Format");
            modify();
        }

        String name = Format.name(temp[0]);
        String phone = Format.phone(temp[1]);
        String signature_Menu = Format.menu(temp[2]);
        int menu_Price = Format.price(temp[3]);
        int rating = Format.rating(temp[4]);
        RestaurantDto restaurant = new RestaurantDto(name,phone,signature_Menu,menu_Price,rating);
        //id 구현해서 하나 추가할때마다 카운트 증가하게 하고싶은데 텍스트파일을 매번 읽을 수 도 없구 어카지;;;
        if(FileIO.update_Restaurant(restaurant)){
            System.out.println("Modify Success");
        }
        else{
            System.out.println("Can't find Restaurant Name");
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }

    public static void all_data() throws IOException {
        ArrayList<RestaurantDto> data = FileIO.read_Restaurant();

        Collections.sort(data);
        System.out.println("Name\tPhoneNumber\tSignature_menu\tPrice\tRating");
        for (RestaurantDto datum : data) {
            System.out.println(datum.getString());
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }
    
    public static void pick_Me_One() throws IOException {
        RestaurantDto restaurant = FileIO.random_Restaurant();
        if(restaurant != null){
            System.out.println(
                    restaurant.getString()
            );
        }else {
            System.out.println("Can't find Restaurant Name");
        }
        System.out.println("Enter 'X' Go Menu");
        String _temp = scanner.next();
    }
}
