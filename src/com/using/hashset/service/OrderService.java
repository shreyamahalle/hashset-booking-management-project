package com.using.hashset.service;
import com.using.hashset.model.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class OrderService {

    private HashSet<Order> orders = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Order o){

        System.out.println(o);
    }
    public Order createOrder(){
            Order o = new Order();
            System.out.println("Please enter id");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter type");
            String type = sc.nextLine();

            System.out.println("Please enter note");
            String note = sc.nextLine();

            System.out.println("Please enter paymentMethod");
            String paymentMethod = sc.nextLine();


            o.setId(id);
            o.setPaymentMethod(paymentMethod);
            o.setNote(note);
            o.setType(type);
            orders.add(o);
            return o;
        }
    public void displayCustomers(){
        for(Order o : orders){
            System.out.println("Customer Info: " + o);
        }
    }
}