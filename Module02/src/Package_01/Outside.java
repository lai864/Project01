package Package_01;
/*匿名内部类(是局部内部类的一种特殊格式)
 * 前提:存在一个类或者接口，这里的类可以是具体类也可以是抽象类
 * 格式：
 *   new 类名或者接口名(){
 *       重写方法；
 *   };
 *
 *   范例：
 *       new Inner(){
 *   public void show(){
 *       }
 *   };
 * 本质：是一个继承了该类或者实现了该接口的子类匿名对象*/
public class Outside {
    public void method() {
        /*
        new Inter(){
            @Override
            public void show(){
                System.out.println("匿名内部类");
            }
        };

         */

        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

         */

        Inter i = new Inter(){
            @Override
            public void show(){
                System.out.println("匿名内部类");
            }
        };
//多次调用
        i.show();
        i.show();
    }
}
