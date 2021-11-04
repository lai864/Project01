package Package_10;

public class FootballCoach extends Coach implements SpeakEnglish{
    public FootballCoach() {
    }

    public FootballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish(){
        System.out.println("教练说英语");
    }

    @Override
    public void eat(){
        System.out.println("足球教练");
    }

    @Override
    public void teach(){
        System.out.println("足球教练教足球");
    }
}
