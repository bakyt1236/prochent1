import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 100;
        int max = 999;
        int diff = max - min;
        int c = random.nextInt(diff + 1);
        c += min;
        int d = c / 100;
        int a = (c / 10) % 10;
        int b = c % 10;
        System.out.println(c);
        System.out.print(d + "," + a + "," + b);
    }
}