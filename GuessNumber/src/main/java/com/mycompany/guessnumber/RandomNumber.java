/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessnumber;

import java.util.Random;

/**
 *
 * @author elcan
 */
public class RandomNumber {
    public static int RandomNumber(int low , int high ){
        Random r = new Random();
        int result  = r.nextInt(high-low)+low;
        return result;}
    
    
    
    
}
