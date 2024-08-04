package com.juaracoding.ujianjf.ujian1;

    public class Soal5 {
        public static void main(String[] args){

            //soal 5 array
            int[] hargaTiket = {50000,60000,70000,80000,90000};
            int total = 0;

//            System.out.println("Harga tiket film 1:"+hargaTiket[0]);
//            System.out.println("Harga tiket film 2:"+hargaTiket[1]);
//            System.out.println("Harga tiket film 3:"+hargaTiket[2]);
//            System.out.println("Harga tiket film 4:"+hargaTiket[3]);
//            System.out.println("Harga tiket film 5:"+hargaTiket[4]);

            for (int i = 0; i < hargaTiket.length; i++) {
                System.out.println("Harga tiket film"+(i+1)+":"+hargaTiket[i]);
                total += hargaTiket[i];
            }

//            for (int h : hargaTiket){
//                total += h;
//            }

            System.out.println("Total harga tiket: "+total);

        }
}
