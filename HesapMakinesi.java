import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secim, n1, n2;
        System.out.println("------Hesap Makinesi v1.1-------");
        System.out.print("Lutfen ilk sayiyi giriniz:");
        n1 = in.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        n2 = in.nextInt();
        System.out.println("---------------------------\n1-Toplama \t 2-Cikarma \t 3-Carpma \t 4-)Bolme \n---------------------------------");
        System.out.print("Yapmak istediğiniz Islem Nedir?[1-2-3-4]:");
        secim = in.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark" + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpim:" + (n1 * n2));
                break;
            case 4:
                if ((n1 == 0 && n2 == 0) || n2 == 0)
                    System.out.println("HATALI GIRIS!");
                else
                    System.out.println("Bolum:" + (n1 / n2));
                break;
            default:
                do {
                    System.out.print("Hatali Secim!\nTekrar Deneyin:");
                    secim = in.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Toplam:" + (n1 + n2));
                            break;
                        case 2:
                            System.out.println("Fark:" + (n1 - n2));
                            break;
                        case 3:
                            System.out.println("Carpim:" + (n1 * n2));
                            break;
                        case 4:
                            if ((n1 == 0 && n2 == 0) || n2 == 0)
                                System.out.println("HATALI GIRIS!");
                            else
                                System.out.println("Bolum:" + (n1 / n2));
                            break;
                    }

                } while (secim < 1 || secim > 4);


        }
    }
}
