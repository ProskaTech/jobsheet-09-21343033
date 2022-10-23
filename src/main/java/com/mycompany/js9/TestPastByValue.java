//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js9;

/**
 *
 * @author User
 */
public class TestPastByValue {
    public static void main(String[] args) {
        int i =10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j) {
        j = 33;
    }
}
