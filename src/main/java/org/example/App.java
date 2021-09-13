package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int price1, price2, price3, quant1, quant2, quant3;
        double tax, subTotal, total;
        Scanner sc = new Scanner(System.in);

        //Keep in mind, tax rate is 5.5%

        //take in user input
        System.out.println("Enter the price of item 1:");
        price1 = sc.nextInt();
        System.out.println("Enter the quantity of item 1:");
        quant1 = sc.nextInt();

        System.out.println("Enter the price of item 2:");
        price2 = sc.nextInt();
        System.out.println("Enter the quantity of item 2:");
        quant2 = sc.nextInt();

        System.out.println("Enter the price of item 3:");
        price3 = sc.nextInt();
        System.out.println("Enter the quantity of item 3:");
        quant3 = sc.nextInt();

        //calculate and round the equations
        subTotal = (price1 * quant1) + (price2 * quant2) + (price3 * quant3);
        subTotal = Math.round(subTotal*100.0)/100.0;
        tax = subTotal * 0.055;
        tax = Math.round(tax*100.0)/100.0;
        total = tax + subTotal;
        total = Math.round(total*100.0)/100.0;

        //print out findings
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

        sc.close();
    }
}