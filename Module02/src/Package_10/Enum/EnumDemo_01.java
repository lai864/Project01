package Package_10.Enum;
/**
 *枚举类的使用
 * 1.枚举类的理解，类的对象只有有限个，明确的，我们称之为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *
 * 二；如何定义枚举类
 * 方式一，jdk5.0之前，自定义枚举类
 * 方式二。jdk5.0之后，可以使用enum关键字定义枚举类,枚举类默认继承java.lang.Enum类
 *
 * 三.Enum类中的常用方法
 * //可以在toString里删除属性，不输出
 * //三个用法：重写toString，输出枚举类的对象常量数values()，寻找指定枚举类对象
 *
 * 四。使用enum关键字定义的枚举类实现接口的情况
 *  情况一：实现接口，在enum类中实现抽象方法
 *  情况二：让枚举类的对象分别实现接口中的抽象方法，对比情况一，能输出各种需求
 */



public class EnumDemo_01 {
    public static void main(String[] args) {
        //自定义枚举类,要重写toString
        Season1 spring = Season1.SPRING;
        System.out.println(spring);



        //使用enum关键字定义枚举类，重写toString，输出枚举类对象常量属性，不重写toString，输出枚举类对象常量名称，重不重写看需求
        Season summer = Season.SUMMER;
        System.out.println(summer);
        System.out.println(Season.class.getSuperclass());//枚举类默认继承java.lang.Enum类

        //三个用法：重写toString，输出枚举类的对象常量数values()，寻找指定枚举类对象
        //重写toString
        System.out.println(summer.toString());
        //输出枚举类的对象常量数values()
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
            value.show();
        }
        System.out.println("===================");
        //线程状态
        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state : values1) {
            System.out.println(state);
        }

        //寻找指定枚举类对象
        //valueOf(String objName):返回这个枚举类中对象名是objName的对象
        Season spring1 = Season.valueOf("SPRING");
        System.out.println(spring1);


        summer.show();

    }
}

interface Info{
    void show();
}

//自定义枚举类
class Season1{
    private String seasonName;
    private String seasonDesc;


    public static final Season1 SPRING = new Season1("春天","春意盎然");
    public static final Season1 SUMMER  = new Season1("夏天","夏日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天","秋高气爽");
    public static final Season1 WINTER = new Season1("冬天","万里雪飘");

    public Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
        //可以在toString里删除属性，不输出
    }



}

//使用enum关键字定义枚举类
enum Season implements Info{

     SPRING("春天","春意盎然"){
         @Override
         public void show() {
             System.out.println("春天在哪里");
         }
     },
     SUMMER("夏天","夏日炎炎"){
         @Override
         public void show() {
             System.out.println("夏天的风");
         }
     },
     AUTUMN("秋天","秋高气爽"){
         @Override
         public void show() {
             System.out.println("秋天，落叶");
         }
     },
     WINTER("冬天","万里雪飘"){
         @Override
         public void show() {
             System.out.println("冬天四季最后一个季节");
         }
     };

    private String seasonName;
    private String seasonDesc;


    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}