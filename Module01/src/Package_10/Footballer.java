package Package_10;

public class Footballer extends Player implements SpeakEnglish{
    public Footballer() {
    }

    public Footballer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("足球运动员吃东西");
    }

    @Override
    public void study(){
        System.out.println("足球运动员学习");
    }

    @Override
    public void speakEnglish(){
        System.out.println("足球运动员说英语");
    }
}
