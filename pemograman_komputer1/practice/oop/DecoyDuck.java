/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemograman_komputer1.practice.oop;

/**
 *
 * @author f415a
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Duck Decoy");
    }
    
}