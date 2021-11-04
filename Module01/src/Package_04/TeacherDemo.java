package Package_04;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("赖慎琛");
        t.setAge(22);

        t.show();//格式单一
        System.out.println(t.getName()+"----"+t.getAge());//格式多样
    }
}
