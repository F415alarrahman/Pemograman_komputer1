/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemograman_komputer1.practice.oop;

/**
 *
 * @author f415a
 */
public class MuteQuack implements QuackBehavior{
    
    @Override
    public void quack(){
        System.out.println("<< Silence >>");
    }
}