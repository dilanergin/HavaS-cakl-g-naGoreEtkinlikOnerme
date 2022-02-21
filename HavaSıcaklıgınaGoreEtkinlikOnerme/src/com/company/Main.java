package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*Koşullar :
   Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
   Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
   Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
   Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
     Scanner scan =new Scanner(System.in);
        System.out.print("Bugüne ait hava sıcaklığını giriniz:");
        int derece=scan.nextInt();
        if(derece<5){
            System.out.println("Bugün hava kayak yapmak için uygun.");
        }else if(derece>=5 && derece<15){
            System.out.println("Bugün hava sinema için uygun.");
        }else if(derece>=15 && derece<25){
            System.out.println("Bugün hava piknik yapmak için uygun.");

        }else {
            System.out.println("Bugün hava yüzme için uygun.");

        }





    }
}

