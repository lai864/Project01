package Package01;

import java.net.SocketOption;

public class OperatorDemo {
    public static void main(String[] args) {
        //字符串常量
        System.out.println("HelloWorld");
        //整数常量
        System.out.println(666);
        //小数常量
        System.out.println(1.5);
        //字符常量
        System.out.println('b');
        System.out.println('我');
        System.out.println('2');
        //布尔常量
        System.out.println(true);
        System.out.println(false);
//空值常量不能直接输出
//System.out.println(null);


        /*变量定义格式
         * 变量名=变量值
         * 基本数据类型（byte,short,int,float,double,boolean,char)
         * 变量的使用
         * 取值格式：变量名
         * 修改格式：变量名=变量值
         */

            /*public static void main(String[] args){
                //定义变量
                int a = 10;
                //输出变量
                System.out.println(a);
                //修改变量
                a=20;
                System.out.println(a);
                public static void main(String[] args){

                short b=18;
                System.out.println(b);
                b=22;
                System.out.println(b);*/
        //long类型超出要加L ,float类型不兼容要加F
        //char加不加单引号的区别

        //加单引号
        char a = 'A';//不运算表示对应字符，     只能定义一个字符
        int b = a;
        System.out.println(a);
        System.out.println(b);//运算表示对应ASII国际编码表
        System.out.println(a + 1);
        //不加单引号,不能定义字符，能定义数值
        char c = 1;
        int d = c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c + 1);

        //标识符：数字，字母，下划线，$组成，数字不能开头，有大小写,不能是关键字
        //小驼峰：方法，变量 例：name，studentNAME,第一个词小写
        //大驼峰：类 例：StudendName，词开头大写

        /*
关于+=的强制转换
 */

        int i = 10;
        System.out.println("i:" + 10);
        //+=
        //i+=20;
        //System.out.println(i);
        i = i + 20;
        System.out.println("i:" + i);

        short x = 2;
        // x+=4;表示x = (short)(x+4)
        //System.out.println(x);
        x = (short) (x + 4);//x=x+4错误，x+4为int类型
        System.out.println("x:" + x);

                /*double b=1;
		System.out.println(b);
		short a=2;
		long c=a;
		System.out.println(c);*/
        //变量类型长度从大到小bite<short=char<int<long<float<double
        //字符+操作：int a=1+1.2错误，是double a=1+1.2 int变量提升为double
        //字符串+操作：遵循优先级
        System.out.println("哔哩哔哩" + 555);
        System.out.println("哔哩哔哩" + 5 + 55);
        System.out.println(5 + 55 + "哔哩哔哩");

        //水仙花：三位数的个十百的立方等于原数


    }
}
