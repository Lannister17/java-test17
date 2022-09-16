import java.util.Scanner;

public class Java101 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu giriniz : ");
        int input1 = input.nextInt();
        System.out.print("Fizik Notunu giriniz : ");
        int input2 = input.nextInt();
        System.out.print("Kimya Notunu giriniz : ");
        int input3 = input.nextInt();
        System.out.print("Türkçe Notunu giriniz : ");
        int input4 = input.nextInt();
        System.out.print("Tarih Notunu giriniz : ");
        int input5 = input.nextInt();
        System.out.print("Müzik Notunu giriniz : ");
        int input6 = input.nextInt();
        int total = input1 + input2+input3+input4+input5+input6 ;
        float average = total /6f;
        boolean result = average >60;
        String text = result ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(text);
    }
}
