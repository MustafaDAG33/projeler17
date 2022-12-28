package film_tahmin_oyunu;

import java.util.*;

public class FilmTahminEtmeOyunu {

    static         List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK", "MEMENTO", "GORA", "ESKIYA",
            "FIGHTCLUB", "KARAKOMIK", "KILLBILL", "AMELIE", "XMEN", "OLDBOY",
            "BATMAN", "KELOGLAN", "TOYSTORY", "MUTLULUK", "SEVEN"));

    public static void main(String[] args) {

        secim();

    }
    public static void secim(){


        while(true){
            int r = (int)(Math.random()*18);
            System.out.println("\nOYUN BASLIYOR!...");
            filmSec(film.get(r));
            System.out.println("Oyundan Cikmak icin 0'a\nDevam etmek icin herhangi bir tusa basin");
            Scanner input = new Scanner(System.in);
            if(input.next().equals("0")){
                System.out.println("TEKRAR GORUSURUZ..");
                break;
            }
        }

    }



    public static void filmSec(String str){

        String d = str;

        List<String> tahminList = new ArrayList<>(str.length());//filmin kac harfli oldugunu gosteren bos list
        for (int i = 0; i < str.length(); i++) {
            tahminList.add("-");
        }
        System.out.println(d.length()+    " harfli bir film  = " + tahminList);//tahminList = [-, -, -, -]

        System.out.println("Tahmin hakkiniz : " + (str.length() * 2) + "\n");//tahmin hakki filmin harf sayisinin iki kati kadar.

        String sp[] = d.split("");
        List<String> j = Arrays.asList(sp);


        int dogruTahmin=0;
        int yanlisTahmin=0;
        int tahminHakki = str.length() * 2;


        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("HARF LUTFEN!!");
            String c = input.next().substring(0, 1).toUpperCase();

            if(str.contains(c)){
                dogruTahmin++;
                int idx=0;
                while(str.contains(c)){
                    idx++;
                    tahminList.set(str.indexOf(c), c);

                    str= str.replaceFirst(c, "P");
                }

                System.out.println(tahminList);
                System.out.println("BINGOO!! --> "  + c + "  harfi " + idx + " tane bulundu");

            }else{
                yanlisTahmin++;
                System.out.println(c + " harfi yok maalesef");

            }

            if(j.equals(tahminList)){
                System.out.println("BRAVOO!");
                System.out.println(dogruTahmin + " defa harf alarak oyunu kazandinn..");
                System.out.println("---------------------------------");
                break;
            }


            Scanner scan = new Scanner(System.in);
            System.out.println("Filmi tahmin edebilir misin?");
            String ft = scan.nextLine();


            if (ft.equalsIgnoreCase(d)) {
                System.out.println("BRAVOO!!");
                System.out.println(dogruTahmin + " defa harf alarak oyunu kazandinn..");
                System.out.println("-------------------------------");
                break;
            }else{
                System.out.println("Devam et!!");
            }


            tahminHakki--;
            System.out.println("kalan tahmin hakkin : " + tahminHakki);

            if(tahminHakki==0){
                System.out.println("KAYBETTINIZ");
                System.out.println("FILM : " + d);
                System.out.println(dogruTahmin + " defa harf alarak oyunu kazandinn..");
                System.out.println("----------------------------");
                break;

            }







        }

    }
}
