package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    static double amount;
    static Item invoiceCafe;
    static double salesTax;
    static double grandTotal;
    static double salesTax1;
    static String userState;
    static double salesTax2;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();

        String userResponse = "y";


        do {
            System.out.println("Enter the item that you ordered");
            String userItem = sc.next();
            System.out.println("Enter the price for each item");
            double userPrice = sc.nextDouble();
            System.out.println("Enter the quantity for the item you ordered");
            int userQuantity = sc.nextInt();
            System.out.println("is it taxable ? Enter true or false");
            boolean userTaxable = sc.nextBoolean();
            System.out.println("Enter the state you live in. Is it MD, DC,VA,Other");
            userState = sc.next();

            itemList.add(new Item(userItem, userPrice, userQuantity, userTaxable, userState));


            System.out.println("Would you like to add another item?");
            userResponse = sc.next();


        } while (!userResponse.equalsIgnoreCase("n"));


        System.out.println("Item Name" + "\t" + "Quantity" + "\t" + "Price" + "\t" + "Cost" + "\t" + " Taxable");
        System.out.println("==========================================================");


        for (Item cafe : itemList) {
            invoiceCafe = cafe;
            System.out.println(cafe.getName() + "\t" + "\t" + "\t" + cafe.getQuantity() + "\t" + "\t" + "\t" + cafe.getPrice() + "\t" + "\t" + "\t" + cafe.cost() + "\t" + "\t" + "\t" + cafe.isTaxable()+ "\t" +"\t"+ cafe.getState());
            if (cafe.getState().equalsIgnoreCase("MD") && invoiceCafe.isTaxable()) {
                salesTax = 0.06;
                salesTax1 = invoiceCafe.cost() * salesTax;
                salesTax2 = salesTax2 + salesTax1;
            }
            if (cafe.getState().equalsIgnoreCase("DC") && invoiceCafe.isTaxable()) {
                salesTax = 0.053;
                salesTax1 = invoiceCafe.cost() * salesTax;
                salesTax2 = salesTax2 + salesTax1;
            }
            if (cafe.getState().equalsIgnoreCase("VA") && invoiceCafe.isTaxable()) {
                salesTax = 0.0575;
                salesTax1 = invoiceCafe.cost() * salesTax;
                salesTax2 = salesTax2 + salesTax1;
            }
            if (cafe.getState().equalsIgnoreCase("OTHER") && invoiceCafe.isTaxable()) {
                salesTax = 0.05;
                salesTax1 = invoiceCafe.cost() * salesTax;
                salesTax2 = salesTax2 + salesTax1;
            }
            if (!invoiceCafe.isTaxable()) {
                salesTax2 = salesTax2;

            }
            amount = cafe.cost() + amount;


                grandTotal = amount;
            grandTotal = salesTax2 + amount;

        }
        System.out.println("Subtotal : $" + amount);
//        System.out.println("TaxRate : " + (salesTax * 100) + "%");
        System.out.print(" Sales Tax : $ ");
        System.out.printf("%.2f",salesTax2);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");
        System.out.print("Grand Total : " );
        System.out.printf("%.2f", grandTotal);


        }
    }













