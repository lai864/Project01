package package_07;

import java.util.Random;

public class Game {
        public static int ranDom(){
                Random random = new Random();
                int ran = random.nextInt(1000);

                return ran;
        }
}
