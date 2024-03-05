package org.example;

import java.util.Scanner;
/*
 Klavyeden kütlesi, hızı ve yerden yüksekliği girilen maddenin potansiyel ve kinetik enerjisini hesaplayan program.

 Bu örnekte, kullanıcı 10 kg kütleye, 20 m/s hıza ve 30 m yüksekliğe sahip bir cisim için bilgileri girdi.

 Potansiyel enerjiyi hesaplarken :                          Kinetik enerjiyi hesaplarken :
 Potansiyel Enerji = m⋅g⋅h                                   Kinetik Enerji = 0.5×m×v²
 Potansiyel Enerji = 10 kg×9.81 m/s²×30 m                   Kinetik Enerji = 0.5×10 kg×(20 m/s)²
 Potansiyel Enerji = 2943.0 J                               Kinetik Enerji = 2000.0 J
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sırasıyla maddenin kütlesini, hızını ve yerden yüksekliğini giriniz. ");

        double kutle;
        double hiz;
        double yukseklik;
        double yercekimi = 9.81;
        double potansiyelEnerji;
        double kinetikEnerji;

        System.out.print("Lütfen Kütleyi Giriniz (kg) : ");
        kutle = scanner.nextDouble();

        System.out.print("Lütfen Hızı Giriniz (m/s) : ");
        hiz = scanner.nextDouble();

        System.out.print("Lütfen Yüksekliği Giriniz (m) : ");
        yukseklik = scanner.nextDouble();

        // Potansiyel enerjiyi hesapla: m * g * h
        potansiyelEnerji = kutle * yercekimi * yukseklik;

        // Kinetik enerjiyi hesapla: 0.5 * m * v^2
        kinetikEnerji = 0.5 * kutle * hiz * hiz;

        System.out.println("\nPotansiyel Enerji: " + potansiyelEnerji + " J");
        System.out.println("\nKinetik Enerji: " + kinetikEnerji + " J");

        scanner.close();
    }
}