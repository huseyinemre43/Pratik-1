import java.util.Scanner;

public class Ö�dev1 {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,tarih,muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat= input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik= input.nextInt();

        System.out.print("Turkce notunuz:");
        turkce= input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih=input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik= input.nextInt();

        int toplam =mat+fizik+turkce+kimya+tarih+muzik;
        double sonuc=toplam/6;

        System.out.println("Ortalamanız:" + sonuc);

        int Ortalamanız=53;
        boolean kosul1=Ortalamanız>60;
        boolean kosul2=Ortalamanız<60;
        boolean sonuc2=Ortalamanız>60;

        String str=sonuc2 ?"Sınıfı Geçtiniz ":"S�n�fta Kald�n�z";

        System.out.println(str);








    }




}



