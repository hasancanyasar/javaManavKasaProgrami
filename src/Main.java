import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
    double armutPara = 2.14, elmaPara = 3.67, domatesPara = 1.11, muzPara = 0.95, patlicanPara = 5.00;
    double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar;


    System.out.println("Kaç kilo Armut? : ");
    Scanner inp = new Scanner(System.in);
    armutKilo = inp.nextDouble();

    System.out.println("Kaç kilo Elma? : ");
    elmaKilo = inp.nextDouble();

    System.out.println("Kaç kilo Domates? : ");
    domatesKilo = inp.nextDouble();

    System.out.println("Kaç kilo Muz? : ");
    muzKilo = inp.nextDouble();

    System.out.println("Kaç kilo Patlican? : ");
    patlicanKilo = inp.nextDouble();

    armutTutar = armutKilo*armutPara;
    System.out.println("Armut Tutarı : " + armutTutar + "TL");

    elmaTutar = elmaKilo*elmaPara;
    System.out.println("Elma Tutarı : " + elmaTutar + "TL");

    domatesTutar = domatesKilo*domatesPara;
    System.out.println("Domates Tutarı : " + domatesTutar + "TL");

    muzTutar = muzKilo*muzPara;
    System.out.println("Muz Tutarı : " + muzTutar + "TL");

    patlicanTutar = patlicanKilo*patlicanPara;
    System.out.println("Patlıcan Tutarı : " + patlicanTutar + "TL");

    double toplamTutar = armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
    System.out.println("Toplam Tutar : " + toplamTutar + "TL");

    }
}