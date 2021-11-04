package Package_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*模拟斗地主*/
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        String[] colors = {"♦", "♣", "♠", "♥"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //组合牌
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("大王");
        array.add("小王");
        // System.out.println(array);
        //洗牌
        Collections.shuffle(array);

        ArrayList<String> jmssArray = new ArrayList<String>();
        ArrayList<String> hsmwArray = new ArrayList<String>();
        ArrayList<String> wzxArray = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();




        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                jmssArray.add(poker);
            } else if (i % 3 == 1) {
                hsmwArray.add(poker);
            } else if (i % 3 == 2) {
                wzxArray.add(poker);
            }
        }

        lookPoker("巨魔叔叔", jmssArray);
        lookPoker("混世魔王", hsmwArray);
        lookPoker("王祖贤", wzxArray);
        lookPoker("底牌", dpArray);

    }

    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();

    }
}
