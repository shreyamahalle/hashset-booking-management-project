package com.using.hashset.service;
import com.using.hashset.model.Customer;

import java.util.HashSet;
import java.util.Scanner;
public class CustomerService {


    private HashSet<Customer> customers = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Customer customer){

        System.out.println(customer);
    }

    public Customer createCustomer () {
        Customer customer = new Customer();
        System.out.println("Please enter id:");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter name:");
        String name = sc.nextLine();

        System.out.println("Please enter city:");
        String city = sc.nextLine();

        System.out.println("Please enter mobile number:");
        int mobileNo = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter age:");
        int age = Integer.parseInt(sc.nextLine());

        customer.setId(id);
        customer.setAge(age);
        customer.setCity(city);
        customer.setName(name);
        customer.setMobileNo(mobileNo);
        customers.add(customer);
        return customer;
    }
    public void displayCustomers(){
        for(Customer customer : customers){
            System.out.println("Customer Info: " + customer);
        }
    }
    }
