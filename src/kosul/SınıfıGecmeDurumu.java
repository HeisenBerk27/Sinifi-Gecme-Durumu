package kosul;

import java.util.Scanner;

public class SınıfıGecmeDurumu {
	
public static void main(String[] args) {

int mat, fizik, turkce, kimya, muzik, dersSayisi=0 , toplam=0;
double ortalama;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Matematik : ");
    mat = scanner.nextInt();
    if(mat>=0 && mat<=100){
        toplam += mat;
        dersSayisi++;
    }
    System.out.print("Fizik : ");
    fizik = scanner.nextInt();
    if(fizik>=0 && fizik<=100){
        toplam += fizik;
        dersSayisi++;
    }
    System.out.print("Türkçe : ");
    turkce = scanner.nextInt();
    if(turkce>=0 && turkce<=100){
        toplam += turkce;
        dersSayisi++;
    }
    System.out.print("Kimya : ");
    kimya = scanner.nextInt();
    if(kimya>=0 && kimya<=100){
        toplam += kimya;
        dersSayisi++;
    }
    System.out.print("Müzik : ");
    muzik = scanner.nextInt();
    if(muzik>=0 && muzik<=100){
        toplam += muzik;
        dersSayisi++;
    }

    ortalama = toplam/dersSayisi;

    if(ortalama>=55){
        System.out.println("Sınıfı geçtin");
    }
    else{
        System.out.println("Sınıfı geçemedin");
    }
    System.out.println("Ders Sayısı: " + dersSayisi + " Ortalama : " + ortalama);
}
}