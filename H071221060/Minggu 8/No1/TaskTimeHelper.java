package No1;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        // Akan acak dari 0 sampai 6 lalu ditambah 1
        return random.nextInt(6) + 1;
    }
}
