package Package_10;

public class PersonDemo {
    public static void main(String[] args) {
        Basketballer b = new Basketballer();
        b.setName("巨魔叔叔");
        b.setAge(25);
        System.out.println(b.getName()+","+ b.getAge());
        b.eat();
        b.study();
        System.out.println(".......");



        Footballer f = new Footballer();
        f.setName("五五五");
        f.setAge(18);
        System.out.println(f.getName()+","+ f.getAge());
        f.eat();
        f.study();
        f.speakEnglish();
        System.out.println("...........");

        FootballCoach f2 = new FootballCoach("混世魔王",999);
        System.out.println(f2.getName()+","+ f2.getAge());
        f2.eat();
        f2.teach();
        f2.speakEnglish();
        System.out.println(".......");

        Coach c = new Coach("黑山老妖",99999999);
        System.out.println(c.getName()+","+ c.getAge());
        c.eat();
        c.teach();

    }
}
