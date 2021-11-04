package Package_01;
/*Object概述(toString和equals)
* Object是类层次结构的根，每个类都可以将Object作为超类，所有类都直接或间接的继承自该类
* 构造方法：public Object()
*
* 回想面对像中，为什么说子类的构造方法访问的是父类的无参构造方法？
* 因为它们的顶级父类只有无参构造方法*/

//建议所有子类重写此方法，封装类中Alt+insert选中toString

/*查看方法的源码，选中方法，按下Ctrl+B*/



/*public boolean equals(Object obj)比较对象是否相等，默认比较地址，重写可以比较内容，自动生成*/

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("巨魔叔叔");
        s.setAge(18);
        // System.out.println(s);
        //System.out.println(s.toString());

        Student s2 = new Student();
        s2.setName("巨魔叔叔");
        s2.setAge(18);
        //  需求：比较两个对象的内容是否相同
       /* System.out.println(s==s2);
    //这是比较地址是否相同

        */
        System.out.println(s.equals(s2));


        int a,b,c;
        a=1;
        b=2;
       c= a>b? a:b;
        System.out.println(c);
    }








    //往下这是Object
    /*public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }


    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }



public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */
}
