package atm_project01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusteriRunner {

    static List<MusteriBilgileri> list1 = new ArrayList<>();

    static int no=hm();


    public static int hm(){
        Scanner input = new Scanner(System.in);
        System.out.println("Banka giris numaranizi giriniz");
        int x =input.nextInt();
        return x;
    }


    public static void main(String[] args) {

                musterilist((list1), musteri("Mustafa DAG", "1234", "7777",100.00),
                        musteri("Ayhan GULER", "3698", "8888",10.00),
                        musteri("Tacettin Demir", "4633", "1452", 50.00),
                        musteri("Zeynep", "1111", "1453", 25));

        hangiMusteri();





    }

    public static List<MusteriBilgileri> musterilist(List<MusteriBilgileri> list,  MusteriBilgileri ...musteriler){

        for(MusteriBilgileri w: musteriler){
            list.add(w);
        }
        return list;
    }

    public static MusteriBilgileri musteri(String ad, String kartNo, String sifre, double bakiye){


        return new MusteriBilgileri(ad, kartNo, sifre, bakiye);
    }



    public static void hangiMusteri() {


        MusteriBilgileri xmusteri = list1.get(no - 1);
        System.out.println("Sayin " + xmusteri.getAd() + "\n" + "JAVABANK'a HOSGELDINIZ!!\n");

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen kart numaranizi giriniz..");
            String k = scan.next();
            k = k.replace(" ", "").trim();
            if (xmusteri.getKartNo().equals(k)) {
                System.out.println("Lutfen sifrenizi giriniz");
                if (xmusteri.getSifre().equals(scan.next())) {
                    Islem.islemler();
                    break;
                } else {
                    System.out.println("Tekrar deneyiniz..");
                }
            } else {
                System.out.println("Tekrar deneyiniz..");
            }
        }






    }





}
