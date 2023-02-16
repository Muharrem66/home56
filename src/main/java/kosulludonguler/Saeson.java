package kosulludonguler;

import java.util.Scanner;

public class Saeson {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kaçıncı Ayda olduğunuzu giriniz");
        int ay = input.nextInt();


        if (ay==3 || ay==4 || ay ==5){
            System.out.println("İlkbahar");
        }
        else if (ay==6 || ay==7 || ay==8) {
            System.out.println("Yaz");
        } else if (ay==9 || ay==10 || ay==11) {
            System.out.println("Sonbahar");

        } else if (ay==12 || ay==1 || ay==2) {
            System.out.println("Kış");
        } else {
            System.out.println("Ay 1-12 arasında olmalıdır.");
        }


    }
}
