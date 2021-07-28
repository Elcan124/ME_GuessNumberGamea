/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessnumber;

import java.util.Scanner;

/**
 *
 * @author elcan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        while(true){
       double compNumber =RandomNumber.RandomNumber(0, 100);
            System.out.println("Enter your number between 0 and 100: ");
            int guess = sc.nextInt();
            if(guess == compNumber){
                System.out.println("TRUE you WIN !!!!");
            
            }else System.out.println("False you LOSE !!!");
            System.out.println("Number is :"+compNumber);
       
        }
    }
    
}
