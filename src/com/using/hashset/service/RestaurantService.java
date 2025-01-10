package com.using.hashset.service;

import com.using.hashset.model.Restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RestaurantService {
    private HashSet<Restaurant> restaurants = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Restaurant r){

        System.out.println(r);
    }
    public Restaurant createRestaurant(){

            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter area");
            String area = sc.nextLine();

            Restaurant r = new Restaurant();

            r.setRegisterNo(registerNo);
            r.setName(name);
            r.setCity(city);
            r.setArea(area);
            restaurants.add(r);
            return r;
        }
    public void displayRestaurant(){
        for(Restaurant r : restaurants){
            System.out.println("Customer Info: " + r);
        }
    }
}