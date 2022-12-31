import java.util.Random;

public class RandomOdev {



    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayici = 0 ;
        while (true){
            int sayi = rastgele.nextInt(500);
            if (sayi>50 && sayi<100){
                System.out.println(sayici + ".işlemde bulunmuştur.");
                System.out.println("Bulunan sayı:" +sayi) ;
                break ;
            }
            sayici++ ;


        }}}
