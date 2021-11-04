package Package_09.Lambda_01;

public class StudentDemo {
    public static void main(String[] args) {
//        useStudentBuilder((String name ,int age) ->{
////
//            return new Student(name,age);
//        });
        useStudentBuilder((name,age) -> new Student(name,age));

        //引用构造器 格式：类名::new
        useStudentBuilder(Student::new);
        //Lambda表达式被构造器替代的时候，它的形式参数全部传递得构造器作为参数

    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student student = sb.builder("巨魔叔叔", 30);
        System.out.println(student.getName()+","+student.getAge());
    }
}
