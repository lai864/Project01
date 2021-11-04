package Package_10.Stream;

import Package_10.Stream.Actor;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();

        array.add("巨魔叔叔");
        array.add("混世魔王");
        array.add("王宝强");
        array.add("阿克尚");
        array.add("风清扬");
        array.add("武大郎");

        list.add("王祖贤");
        list.add("赵敏");
        list.add("柳岩");
        list.add("林青霞");
        list.add("林心如");
        list.add("林志玲");

        ArrayList<Actor> arrayList = new ArrayList<Actor>();


     /*   Stream<String> man = array.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> women = list.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> actor = Stream.concat(man, women);
        actor.map(Actor::new).forEach(s-> System.out.println(s.getName()));

      */
        Stream.concat(array.stream().filter(s -> s.length() == 3).limit(3), list.stream().filter(s -> s.length() == 3).limit(3).skip(1)).map(Actor::new).forEach(s-> System.out.println(s.getName()));
    }
}
