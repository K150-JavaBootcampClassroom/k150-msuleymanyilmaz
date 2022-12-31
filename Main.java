import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int sayi;
        int sayici = 0;
        Random rastgele = new Random();
        while (true) {
            sayi = rastgele.nextInt(500);

            if (sayi > 50 && sayi < 100) {
                System.out.println(sayici + ". seçimde bulunmuştur");
                System.out.println("Bulunan sayı:" + sayi);

                break;
            }
            sayici ++;
        }

    }
}






