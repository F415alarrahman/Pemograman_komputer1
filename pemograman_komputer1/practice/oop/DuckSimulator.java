/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemograman_komputer1.practice.oop;
import java.util.Scanner;

/**
 *
 * @author f415a
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pilih jenis bebek:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            System.out.println("0. Keluar");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Anda Keluar dari program !!");
                break;
            }

            Duck duck = null;

            switch (pilihan) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RubberDuck();
                    break;
                case 3:
                    duck = new DecoyDuck();
                    break;
                case 4:
                    duck = new ModelDuck();
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan tidak ada");
            }

            if (duck != null) {
                System.out.println("Anda memilih: " + duck.getClass().getSimpleName());
                duck.performQuack();
                duck.performFly();
            }
        } while (true);
    }
}