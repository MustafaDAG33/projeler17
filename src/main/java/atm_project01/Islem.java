package atm_project01;

import java.util.Scanner;

import static atm_project01.MusteriRunner.*;

public class Islem {

    public static void islemler() {
        System.out.println("1-Bakiye sorgula\n2-Para yatirma\n3-Para çekme\n4-Para gönderme\n5-Sifre değiştirme\n6-Cikis");
        Scanner scan1 = new Scanner(System.in);
        String secim = scan1.next();
        secim(secim);
    }

    public static void secim(String x) {

        switch (x) {
            case "1":
                bakiyeSorgulama(no);
                break;
            case "2":
                paraYatirma(no);
                break;
            case "3":
                paraCekme(no);
                break;
            case "4":
                paraGonderme(no);
                break;
            case "5":
                sifreDegistirme(no);
                break;
            case "6":
                System.out.println("Iyi gunler diliyoruz...");
                break;
            default:
                System.out.println("Cikis yapmak icin 6'ya basiniz");
                islemler();
                break;

        }


    }


    public static void bakiyeSorgulama(int x) {
        System.out.println("Bakiye= " + list1.get(no - 1).getBakiye());
        Scanner input = new Scanner(System.in);

        System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
        input.next();
        islemler();
    }

    public static void paraYatirma(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yatirmak istediginiz miktari giriniz..");
        double yatirilacakMiktar = input.nextDouble();

        list1.get(no - 1).setBakiye(list1.get(no - 1).getBakiye() + yatirilacakMiktar);
        System.out.println("Bakiye = " + list1.get(no - 1).getBakiye());

        System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
        input.next();
        islemler();

    }

    public static void paraCekme(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cekmek istediginiz miktari giriniz..");
        double cekilecekMiktar = input.nextDouble();


        if (cekilecekMiktar > list1.get(no - 1).getBakiye()) {
            System.out.println("Yetersiz Bakiye!!");
        } else {
            list1.get(no - 1).setBakiye(list1.get(no - 1).getBakiye() - cekilecekMiktar);
            System.out.println("Bakiyeniz = " + list1.get(no - 1).getBakiye());
        }

        System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
        input.next();
        islemler();

    }

    public static void paraGonderme(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Para gondermek istediginiz hesabin IBAN numarasini giriniz");
        String iban = input.next();

        if (iban.length() != 7) {
            System.out.println("Hatali giris!!\nIBAN'i kontrol ediniz..\n");
            islemler();
        } else if (!iban.startsWith("TR")) {
            System.out.println("Hatali giris!!\nIBAN TR ile baslamali..\n");
        } else {
            System.out.println("Gondermek istediginiz miktari giriniz..");
            double gonderilecekMiktar = input.nextDouble();

            if (gonderilecekMiktar > list1.get(no - 1).getBakiye()) {
                System.out.println("Yetersiz Bakiye!!");
            } else {
                list1.get(no - 1).setBakiye(list1.get(no - 1).getBakiye() - gonderilecekMiktar);
                System.out.println("Bakiyeniz = " + list1.get(no - 1).getBakiye());
            }
        }
        System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
        input.next();
        islemler();
    }

    public static void sifreDegistirme(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mevcut sifrenizi giriniz..");
        String sifre = input.next();

        if (sifre.equals(list1.get(no - 1).getSifre())) {
            System.out.println("Yeni sifrenizi giriniz");
            String yeniSifre = input.next();
            list1.get(no - 1).setSifre(yeniSifre);
            System.out.println("Yeni sifreniz " + list1.get(no - 1).getSifre() + " olarak onaylandi\n");
            System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
            input.next();
            islemler();
        } else {
            System.out.println("Sifre hatali\tTekrar Deneyiniz..");
            islemler();

        }




    }
}
