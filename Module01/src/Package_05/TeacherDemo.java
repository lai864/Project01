package Package_05;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.show();
        Teacher t2 = new Teacher("赖慎琛");
        t2.show();
        Teacher t3 = new Teacher("赖慎琛",22);
        t3.show();
    }
}
