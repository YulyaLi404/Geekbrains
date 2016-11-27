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

        int range = 1000;
        int n = (int) (Math.random() * range);

        playGo(n, range);
        reader.close();
    }

    private static void playGo(int num, int range) throws IOException {
        System.out.println("Введите число от 0 до " + range);

        while (true) {
            int n = Integer.parseInt(reader.readLine());

            if (num == n) {
                System.out.println("Win!");
                break;
            } else
            if (num < n) {
                System.out.println("Меньше");
            } else {
                System.out.println("Больше");
            }
        }
    }
}

/* Output:

Введите число от 0 до 1000
23
Больше
1000
Меньше
34
Больше
500
Меньше
400
Меньше
100
Больше
200
Меньше
150
Больше
160
Меньше
155
Больше
156
Больше
157
Win!

*/
