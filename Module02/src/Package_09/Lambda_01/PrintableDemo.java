package Package_09.Lambda_01;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(s -> System.out.println(s));
        //方法引用是Lambda表达式的孪生兄弟，Lambda表达式能输出的，能用方法引用改进
        //会自动推导方法里的参数类型
        usePrintable(System.out::println);//println方法的参数可是字符串，int类型等，输出时自动推导




        useConverter(s ->Integer.parseInt(s));
        //Lambda表达式被类方法代替时，它的形式参数s全部传递给静态方法parseInt作为参数
        useConverter(Integer::parseInt);


        //引用对象的实例方法，引用类的实例方法。当别的类有Lambda表达式要做的操作，
        // 可以用引用对象的实例方法，引用类的实例方法，
        // 例如usePrintUpperCase(s -> System.out.println(s.toUpperCase()));
        //它在ConverterString类中有方法实现了，就用方法引用


        usePrintUpperCase(s -> System.out.println(s.toUpperCase()));
        //引用对象的实例方法 格式：对象::成员方法
        ConverterString cs = new ConverterString();
        usePrintUpperCase(cs::show);
        //Lambda表达式被对象实例方法替代时，它的形式参数全部传递给方法作为形式参数



        useMySubString((s,x,y) -> s.substring(x,y));
        //引用类的实例方法 格式：类名::成员方法
        useMySubString(String::substring);
        //Lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数

    }






    private static void usePrintable(Printable p){
        p.printString("巨魔叔叔");

    }


    private static void useConverter(Converter c){
        int result = c.converter("18");
        System.out.println(result);
    }


    private static void usePrintUpperCase(ToUpperCase t){
         t.printUpper("student");
    }


    private static void useMySubString(MyString my){
        String s = my.mySubString("HelloWorld",2,5);
        System.out.println(s);
    }
}
