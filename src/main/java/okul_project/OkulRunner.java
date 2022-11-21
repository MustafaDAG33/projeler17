package okul_project;

import java.util.Scanner;

public class OkulRunner {

    public static void main(String[] args) {

        Okul okul = new Okul("MKAL", 2);



        int ogr = 1;
        while(ogr<=okul.maksimumOgrenciSayisi){
            Scanner input = new Scanner(System.in);
            System.out.println(ogr + ". ogrencinin adini ve yasini giriniz");

//            Scanner scan = new Scanner(System.in);
//            System.out.println(ogr + ". ogrencinin yasini giriniz");

            try{
                Ogrenci ogrenci = new Ogrenci(input.nextLine(), input.nextInt());
                okul.list.add(ogrenci);
                ogr++;
            }catch(RuntimeException e){
                System.out.println("yeni bir ogrenci kaydedin");
            }



        }
//        okul.list.add(0, new Ogrenci("mustafa", 12));

        System.out.println(okul.list);
        System.out.println(okul);

        for(Ogrenci w : okul.list){
            System.out.println(w);
        }





    }
}
