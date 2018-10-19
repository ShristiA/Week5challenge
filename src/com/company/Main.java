package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    static double amount ;
    static Item invoiceCafe;
    static double salesTax;
    static double grandTotal;
    static double salesTax1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();

        String userResponse = "y";

        ArrayList<Double> taxRateList = new ArrayList<Double>();
        taxRateList.add(0.06);
        taxRateList.add(0.0530);
        taxRateList.add(0.0575);
        taxRateList.add(0.05);

        Random r = new Random();
        int index = r.nextInt(taxRateList.size());
       double itemI = taxRateList.get(index);
        do {
            System.out.println("Enter the item that you ordered");
            String userItem = sc.next();
            System.out.println("Enter the price for each item");
            double userPrice = sc.nextDouble();
            System.out.println("Enter the quantity for the item you ordered");
            int userQuantity = sc.nextInt();
            System.out.println("is it taxable ? Enter true or false");
            boolean userTaxable = sc.nextBoolean();

            itemList.add(new Item(userItem, userPrice, userQuantity, userTaxable));


            System.out.println("Would you like to add another item?");
            userResponse = sc.next();

        } while (!userResponse.equalsIgnoreCase("n"));

        System.out.println("Item Name" + "\t" + "Quantity" + "\t" + "Price" + "\t" + "Cost" + "\t" + " Taxable");
        System.out.println("==========================================================");



        for (Item cafe : itemList) {
            System.out.println(cafe.getName() + "\t" + "\t"+"\t" + cafe.getQuantity() + "\t" + "\t" + "\t" + cafe.getPrice() + "\t" + "\t"+ "\t" + cafe.cost() + "\t"+"\t" + "\t"+cafe.isTaxable());
            amount = cafe.cost() + amount;
            if (cafe.isTaxable() == true) {
                salesTax = cafe.cost() +salesTax;
                salesTax1 = itemI * salesTax;

                grandTotal = salesTax1 + amount;
            }else{
                grandTotal = amount;
            }
        }
        System.out.println("Subtotal : $" + amount);
        System.out.println("TaxRate : " + (itemI * 100) + "%");
        System.out.print(" Sales Tax : $ ");
        System.out.printf("%.2f",salesTax1);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");
        System.out.print("Grand Total : " );
        System.out.printf("%.2f", grandTotal);




        }
    }












