/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericcomputingcurrencyconverter;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author macbookpro
 */
public class NumericComputingCurrencyConverter {

    /**
     * @param args
     */
    public static void main(String[] args) {

        double amount, canadiandollar, usdollar, pound, yuan, euro, yen, franc, indianrupee;

        int input, output;

        DecimalFormat df = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        System.out.println("which currency do you want to Exchange to ? ");

        System.out.println("1:Indian Ruppee \t2: American Dollar \t3: Canadian Dollar \t4:Pound \t5:Euro \t6:Japanese Yen \t7:Swiss Franc \t8:Chinese Yuan ");
        input = sc.nextInt();

        System.out.println("Which currency do you want the amount to be converted from ?");

        System.out.println("1:Indian Ruppee \t2: American Dollar \t3: Canadian Dollar \t4:Pound \n5:Euro \t6:Japanese Yen \t7:Swiss Franc \t8:Chinese Yuan ");
        output = sc.nextInt();

        System.out.println("How much Money do you want to change to your desired currency?");
        amount = sc.nextFloat();

        switch (input) {
            case 1: // Ruppee Conversion
                if (output == 2) {
                    usdollar = amount / 71.74;
                    System.out.println("Your " + amount + " Indian Rupee is :" + df.format(usdollar) + " American Dollar");
                }
                if (output == 3) {
                    canadiandollar = amount / 54.01;
                    System.out.println("Your " + amount + " Indian Rupee is : " + df.format(canadiandollar) + " Canadian Dollar");
                }
                if (output == 4) {
                    pound = amount / 92.62;
                    System.out.println("Your " + amount + " Indian Rupee is : " + df.format(pound) + " Pound");
                }
                if (output == 5) {
                    euro = amount / 79.36;
                    System.out.println("Your " + amount + " Indian Rupee is : " + df.format(euro) + " Euro");
                }
                if (output == 6) {
                    yen = amount / 0.29;
                    System.out.println("Your " + amount + " Indian Rupee is : " + df.format(yen) + " Japanese Yen");
                }
                if (output == 7) {
                    franc = amount / 72.20;
                    System.out.println("Your " + amount + " Indian Rupee is :" + df.format(franc) + " Swiss Franc");
                }
                if (output == 8) {
                    yuan = amount / 10.20;
                    System.out.println("Your " + amount + " Indian Rupee is : " + df.format(yuan) + " Chinese Yuan");
                }
                break;

            case 2: // American Dollar Conversion
                if (output==1) {
                    indianrupee = amount * 0.014;
                    System.out.println("Your " + amount + " Indian Rupee is :" + df.format(indianrupee) + " American Dollar");
                }
                if (output == 3) {
                    canadiandollar = amount * 0.75;
                    System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(canadiandollar) + " American Dollar");
                }
                if (output == 4) {
                    pound = amount * 1.28;
                    System.out.println("Your " + amount + " Pound is :" + df.format(pound) + " American Dollar");
                }
                if (output == 5) {
                    euro = amount * 1.10;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " American Dollar");
                }
                if (output == 6) {
                    yen = amount * 0.0092;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " American Dollar");
                }
                if (output == 7) {
                    franc = amount;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " American Dollar");
                }
                if (output == 8) {
                    yuan = amount * 0.14;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " American Dollar");
                }
                break;

            case 3: // Canadian Dollar Conversion
                
                if (output == 1) {
                    indianrupee = amount * 0.019;
                    System.out.println("Your " + amount + " Indian Ruppee is : " + df.format(indianrupee)+ " Canadian Dollar");
                }
                if (output == 2) {
                    usdollar = amount * 0.78;
                    System.out.println("Your " + amount + " American dollar is : " + df.format(usdollar) + " Canadian Dollar");
                }
                if (output == 4) {
                    pound = amount * 1.71;
                    System.out.println("Your " + amount + " Pound is : " + df.format(pound) + " Canadian Dollar");
                }
                
                if (output == 5) {
                  euro = amount * 1.47;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " Canadian Dollar");
                }
                
                if (output == 6) {
                    yen = amount *  0.012;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " Canadian Dollar");
                }
                
                if (output == 7) {
                    franc = amount * 1.33;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " Canadian Dollar");
                }
                
                if (output == 8) {
                    yuan = amount * 0.19;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " Candian Dollar");
                }
                break;
                
            case 4: // Pound Conversion
                if (output == 1) {
                    indianrupee = amount * 88;
                    System.out.println("Your " + amount + " Indian Ruppee is : " + df.format(indianrupee) + " Pound");
                }
                if (output == 2) {
                    usdollar = amount * 1.26;
                    System.out.println("Your " + amount + " American Dollar is : " + df.format(usdollar) + " Pound");
                }
                if (output == 3) {
                    canadiandollar = amount * 0.59;
                    System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(canadiandollar) + " Pound");
                }
                if (output == 5) {
                    euro = amount * 0.86;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " Pound");
                }
                if (output == 6) {
                    yen = amount * 0.0072;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " Pound");
                }
                if (output == 7) {
                    franc = amount * 0.78;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " Pound");
                }
                if (output == 8) {
                    yuan = amount * 0.11;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " Pound");
                }
                break;
                
            case 5: // Euro Conversion
                if (output == 1) {
                    indianrupee = amount * 0.013;
                    System.out.println("Your " + amount + " Indian Ruppee is :" + df.format(indianrupee) + " Euro");
                }
                if (output == 2) {
                    usdollar = amount * 0.91;
                    System.out.println("Your " + amount + " American Dollar is : " + df.format(usdollar) + " Euro");
                }
                if (output == 3) {
                    canadiandollar = amount * 0.68;
                    System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(canadiandollar) + " Euro");
                }
                if (output == 4) {
                    pound = amount * 1.16;
                    System.out.println("Your " + amount + " Pound is : " + df.format(pound) + " Euro");
                }
                if (output == 6) {
                    yen = amount * 0.0084;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " Euro");
                }
                if (output == 7) {
                    franc = amount * 0.91;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " Euro");
                }
                if (output == 8) {
                    yuan = amount * 0.13;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " Euro");
                }
                break;
                
            case 6: // Yen Conversion
                if (output == 1) {
                    indianrupee = amount * 0.13;
                    System.out.println("Your " + amount + " Indian Ruppee is : " + df.format(indianrupee) + " Japanese Yen");
                }
                if (output == 2) {
                    usdollar = amount * 1.51;
                    System.out.println("Your " + amount + " American Dollar is : " + df.format(usdollar) + " Japanese Yen");
                }
                if (output == 3) {
                    canadiandollar = amount * 108.64;
                    System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(canadiandollar) + " Japanese Yen");
                }
                if (output == 4) {
                    pound = amount * 81.66;
                    System.out.println("Your " + amount + " Pound is : " + df.format(pound) + " Japanese Yen");
                }
                if (output == 5) {
                    euro = amount * 119.74;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " Japanese Yen");
                }
                if (output == 7) {
                    franc = amount * 108.93;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " Japanese Yen");
                }
                if (output == 8) {
                    yuan = amount * 15.43;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " Japanese Yen");
                }
                break;
                
            case 7: // Swiss Frank Conversion
                if (output == 1) {
                    indianrupee = amount * 0.014;
                    System.out.println("Your " + amount + " Indian Ruppee is : " + df.format(indianrupee) + " Swiss Franc");
                }
                if (output == 2) {
                    usdollar = amount;
                    System.out.println("Your " + amount + " American Dollar is : " + df.format(usdollar) + " Swiss Franc");
                }
                if (output == 3) {
                    canadiandollar = amount * 0.75;
                    System.out.println("Your " + amount + " American Dollar is :" + df.format(canadiandollar) + " Swiss Franc");
                }
                if (output == 4) {
                    pound = amount * 0.75;
                    System.out.println("Your " + amount + " Pound is : " + df.format(pound) + " Swiss Franc");
                }
                if (output == 5) {
                    euro = amount * 1.10;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " Swiss Franc");
                }
                if (output == 6) {
                    yen = amount * 0.0092;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " Swiss Franc");
                }
                if (output == 8) {
                    yuan = amount * 0.14;
                    System.out.println("Your " + amount + " Chinese Yuan is : " + df.format(yuan) + " Swiss Franc");
                }
                break;
                
            case 8: // Yuan Conversion
                if (output == 1) {
                    indianrupee = amount * 0.098;
                    System.out.println("Your " + amount + " Indian Ruppee is : " + df.format(indianrupee) + " Chinese Yuan");
                }
                if (output == 2) {
                    usdollar = amount * 7.04;
                    System.out.println("Your " + amount + " American Dollar is : " + df.format(usdollar) + " Chinese Yuan");
                }
                if (output == 3) {
                    canadiandollar = amount * 5.29;
                    System.out.println("Your " + amount + " Canadian Dollar is : " + df.format(canadiandollar) + " Chinese Yuan");
                }
                if (output == 4) {
                    pound = amount * 9.03;
                    System.out.println("Your " + amount + " Pound is : " + df.format(pound) + " Chinese Yuan");
                }
                if (output == 5) {
                    euro = amount * 7.76;
                    System.out.println("Your " + amount + " Euro is : " + df.format(euro) + " Chinese Yuan");
                }
                if (output == 6) {
                    yen = amount * 0.065;
                    System.out.println("Your " + amount + " Japanese Yen is : " + df.format(yen) + " Chinese Yuan");
                }
                if (output == 7) {
                    franc = amount * 7.06;
                    System.out.println("Your " + amount + " Swiss Franc is : " + df.format(franc) + " Chinese Yuan");
                } else {
                    System.out.println("Invalid input");
                }

                System.out.println("Thank you for using my Currency Converter Program");
        }

    }
}