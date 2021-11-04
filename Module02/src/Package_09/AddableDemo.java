package Package_09;
/*Lambda简便写法*/
public class AddableDemo {
    public static void main(String[] args) {
//        useAddable((int x,int y) ->{
//            return x+y;
//        });


        //1.参数类型可以省略，但多个参数不能只省略一个
        useAddable((x,y) ->{
            return x+y;
        });
        //参数只有一个，小括号能省略
        flyable(s ->{
            System.out.println(s);
        });
        //如果代码块的语句只有一条，可以省略大括号和分号sout后面的分号
        flyable(s -> System.out.println(s));
        //如果代码块的语句只有一条，可以省略大括号和分号sout后面的分号，有return,return也可以省略
        useAddable((x,y) -> x+y);




    }
     /*   //定义子类类实现,执行顺序：先是main方法中，调用useAddable方法，传入实参，即对象，
        // 调用add方法，接收返回值sum，之后，main方法接收返回值addSum,输出result
        Addable a = new AddableImpl();
        int result = useAddable(a);
        System.out.println(result);

        //匿名内部类实现
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
               int sum = x+y;
               return sum;
            }
        });
    }

    private static int useAddable(Addable a){
        int addSum = a.add(3, 7);
        return addSum;

      */


    private static void useAddable(Addable a){
        int sum = a.add(7, 3);
        System.out.println(sum);
    }

    private static void flyable(Flyable f){
        f.fly("晴天万里，风和日丽");
    }
}
