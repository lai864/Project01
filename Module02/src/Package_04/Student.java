package Package_04;

public class Student implements java.lang.Comparable<Student> {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    @Override
    public int compareTo(Student s){
//        return 0;不比较
//        return 1;升序
//        return -1;降序
        //按照年龄从小到大排序
//       int num = this.age-s.age;//升序，从小到大排
        int num = s.age-this.age;//降序
        //当年龄相同时，按照姓名的字母排序(只有升序)
        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;


    }
}
