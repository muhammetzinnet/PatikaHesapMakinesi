package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hesap Makinesi Projesi...");
        double sayi_1, sayi_2;
        int secim;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin = ");
        sayi_1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin = ");
        sayi_2 = scanner.nextDouble();

        System.out.println("Lütfen yapmak işlemi saçin = \n1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarma");
        secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("Girmiş Olduğunuz sayıların toplamı = "+(sayi_1+sayi_2));
                break;
            case 2:
                System.out.println("Girdiğiniz sayıların farkı = "+(sayi_1-sayi_2));
                break;
            case 3:
                if (sayi_2!=0){
                    System.out.println("Girdiğiniz sayıların bölümü = "+(sayi_1/sayi_2));
                }else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            case 4:
                System.out.println("Girdiğiniz sayıların çarpımı = " + (sayi_1*sayi_2));
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız..");
                break;
        }
    }
}
