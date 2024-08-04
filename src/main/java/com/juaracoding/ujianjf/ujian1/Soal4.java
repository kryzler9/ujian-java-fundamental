package com.juaracoding.ujianjf.ujian1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soal4 {

        public static void main(String[] args){

            //Perulangan

            Scanner input = new Scanner(System.in);
            System.out.println("Masukan jumlah film yang ingin ditonton: ");
            int dataLength = input.nextInt();
            String film[] = new String[dataLength];

            for (int i = 0; i < film.length; i++) {
                System.out.println("Masukan nama film ke-"+(i+1)+":");
                film[i] = input.next();
            }
            System.out.println("Film yang ingin ditonton: ");
            for (int i = 0; i < film.length; i++) {
                System.out.print(+i+1);
                System.out.println("."+film[i]);

            }


        }
}
