import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplambakiye = 100 ;
        int cekilenpara;
        String yapabilecekleriniz =
                """
                        *** 1.İŞLEM: BAKİYE ÖĞRENME ***\s
                        *** 2.İŞLEM: PARA ÇEKME ***
                        *** 3.İŞLEM: PARA YATIRMA ***
                        *** ÇIKIŞ İÇİN 4'E BASINIZ ***
                        """;
        System.out.println("Yapılacak İşlemi Seçiniz:");
        System.out.println(yapabilecekleriniz);
        System.out.println("Bir tuşa basınız:");
        int islem = scanner.nextInt();
        scanner.nextLine();
        while (true) {
            switch (islem) {
                case 1 -> System.out.println("Toplam Bakiyeniz:" + toplambakiye);
                case 2 -> {
                    System.out.println("Bir miktar giriniz:");
                    cekilenpara = scanner.nextInt();
                    {
                        if (toplambakiye - cekilenpara < 0)
                            System.out.println("Yetersiz Bakiye");
                        else
                            System.out.println("Lütfen Bekleyiniz");
                    }
                }
                case 3 -> System.out.println("Paranızı düzgün bir şekilde yerleştiriniz");
                case 4 -> System.out.println("Kartınızı almadan gitmeyiniz.");
            }
            break ;
        }
    }
}

