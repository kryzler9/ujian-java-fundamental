package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        //Soal 3 Percabangan

        Scanner input = new Scanner(System.in);
        int tiket = input.nextInt();
        System.out.println("Jumlah Tiket: " + tiket);

        float discount = 0.0f;
        boolean isWeekday = false;
        float harga = 0;
        float total = 0;

        if (isWeekday) {
            harga = 35000.0f;
        } else {
            harga = 45000.0f;
        }
        if (tiket > 5) {
            discount = 0.1f;
            total = (harga*tiket);
            System.out.println("Harga Total (dengan diskon): " +(total - (total * discount)));
        } else {
            total = (harga*tiket);
            System.out.println("Harga total (dengan diskon): "+total);
        }



    }
}
