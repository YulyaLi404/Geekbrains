import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Crow on 27.11.2016.
 *
 */

public class random {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        for (int i = 100; i <= 1000; i +=200) playGo(i);
        System.out.println("WIN!!!");
        reader.close();
    }

    private static void playGo(int num) throws IOException {
        int a = (int) (Math.random() * num);

        System.out.println("Введите число от 0 до " + num);

        while (true) {
            int n = Integer.parseInt(reader.readLine());

            if (a == n) {
                System.out.println("Win!");
                break;
            } else
            if (a < n) {
                System.out.println("Меньше");
            } else {
                System.out.println("Больше");
            }
        }
    }
}
