package patikadev;
import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yas, km, ucusTuru;
        double indirimliTutar, ilkTutar;
        System.out.print("yaşınızı giriniz:");
        yas = inp.nextInt();
        System.out.println("yolculuk tipinizi seçiniz:(1: tek yön  2: gidiş dönüş)");
        ucusTuru = inp.nextInt();
        System.out.print("gideceğiniz mesafeyi KM cinsinden giriniz:");
        km = inp.nextInt();
        ilkTutar = (km * 0.10);
        if ((yas < 0) || (km < 0) || (ucusTuru != 1) && (ucusTuru != 2)) {
            System.out.println("hatalı bilgi girdiniz");
        } else {
            if (yas < 12) {
                if (ucusTuru == 1) {
                    indirimliTutar = ilkTutar * 0.5;
                    System.out.println("indirimsiz tutar:" + ilkTutar);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                } else {
                    indirimliTutar = (ilkTutar * 0.5) * 0.8 * 2;
                    System.out.println("indirimsiz tutar:" + ilkTutar * 2);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                }


            } else if (yas > 65) {
                if (ucusTuru == 1) {
                    indirimliTutar = ilkTutar * 0.7;
                    System.out.println("indirimsiz tutar:" + ilkTutar);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                } else {
                    indirimliTutar = (ilkTutar * 0.7) * 0.8 * 2;
                    System.out.println("indirimsiz tutar:" + ilkTutar * 2);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                }
            } else if (yas >= 12 && yas <= 24) {
                if (ucusTuru == 1) {
                    indirimliTutar = (ilkTutar * 0.9);
                    System.out.println("indirimsiz tutar:" + ilkTutar);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                } else {
                    indirimliTutar = (ilkTutar * 0.9) * 0.8 * 2;
                    System.out.println("indirimsiz tutar:" + ilkTutar * 2);
                    System.out.println("indirimli tutar:" + indirimliTutar);
                } if (yas > 24 && yas < 65) {
                    if (ucusTuru == 1) {
                        System.out.println("tutar:" + ilkTutar);
                    } else {
                        indirimliTutar = ilkTutar * 0.8 * 2;
                        System.out.println("indirimsiz tutar:" + ilkTutar);
                        System.out.println("indirimli tutar:" + indirimliTutar);
                    }
                }
            }
        }
    }
}









