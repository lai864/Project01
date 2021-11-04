package Package_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*斗地主优化*/
public class PokerDemo_02 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        ArrayList<Integer> array = new ArrayList<Integer>();

        String[] colors = {"♦", "♣", "♠", "♥"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int index = 0;
        for (String number:numbers){
            for ( String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
       hm.put(index,"大王");
        array.add(index);
        index++;
        hm.put(index,"小王");
        array.add(index);

        Collections.shuffle(array);


        TreeSet<Integer> jmssSet = new TreeSet<Integer>();
        TreeSet<Integer> hsmwSet = new TreeSet<Integer>();
        TreeSet<Integer> wzxSet = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();


            //发牌
            for (int i = 0; i < array.size(); i++) {
                Integer poker = array.get(i);
                if (i >= array.size() - 3) {
                    dpSet.add(poker);
                } else if (i % 3 == 0) {
                    jmssSet.add(poker);
                } else if (i % 3 == 1) {
                    hsmwSet.add(poker);
                } else if (i % 3 == 2) {
                    wzxSet.add(poker);
                }
        }

        lookPoker("巨魔叔叔",jmssSet,hm);
        lookPoker("混世魔王",hsmwSet,hm);
        lookPoker("王祖贤",wzxSet,hm);
        lookPoker("底牌",dpSet,hm);

    }

    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌：");
        for (Integer index:ts){
            String poker = hm.get(index);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
