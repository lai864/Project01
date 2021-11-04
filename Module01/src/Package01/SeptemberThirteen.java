package Package01;

//import java.util.Random;
//import java.util.Scanner;

import java.sql.SQLOutput;

public class SeptemberThirteen {
    public static void main(String[] args){
        /*Random
        作用：产生一个随机数
        1.导包
        import java.util.Random;
        2.创建一个对象‘
        Random.r = new.Random；
        3.获取随机数
        int number = r.nextInt(10);
        获取范围包括0，不包括10,10不是固定的。
         */
       /* Random r = new Random();
        //int number = r.nextInt(10);能获取0-9中的随机数
        int number = r.nextInt(100)+1;//能获取1-100的随机数
        System.out.println(number);

        */
       /* while(true) {
            System.out.println("请输入0-100中的一位数");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            Random r = new Random();
            int number = r.nextInt(101);
            if (a < number) {
                System.out.println("猜小了");
            } else if (a > number) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }

        */
        /*idea中内容辅助键和快捷键
        注释：
            单行：选中代码，Ctrl+/,再来一次，取消
            多行注释：选中代码Ctrl+shift+/,再来一次，就取消

        格式化：Ctrl+Alt+l

         快速生成语句：
            快速生成main():psvm,回车
            快速生成输出语句：sout,回车

          内容辅助键：
            Ctrl+Alt+space(内容提示，代码补全等)
        */


        /*一.数组
        * 定义格式(两种格式用法一样推荐第一种）
        *   格式一：数据类型[] 变量名
        *   范例：     int[] arr
        *   定义了一个int类型的数组，组名是arr
        *
        *
        * 格式二：数据类型 变量名[]
        * 范例：       int arr[]
        *
        *
        * 二.数组初始化（动静两种,所谓初始化，就是为数组中的数组元素分配内存空间，并未每个数组元素赋值）
        * 1.动态初始化：初始化时只能指定数组长度，由系统为数组分配初始值
        * 格式：数据类型[]变量名 = new 数据类型[数组长度]
        * 范例：int[] arr = new int[3]*/

        int[] arr = new int[5];
        /*
        * 左边：
        *   int说明数组中元素为int类型
        *   []说明这是一个数组
        *   arr:这是一个数组的名字
        * 右边：
        *   new为数组申请内存空间
        *   int:说明说明数组中的元素类型是int
        *   []:说明这是一个数组
        *   3：数组长度，其实就是数组中元素的个数
        *
        * 三.元素访问
        * 数组变量访问方式
        * 格式：数组名
        *
        * 数组内部保存的数据的访问方式
        * 格式：数组名[索引]
        *
        * 索引是数组中数据的编号方式
        * 作用：索引用于访问数组中的数据使用，数组名[索引]等同于变量名，是一种特殊的变量
        * 特征1：索引从0开始
        * 特征2：索引是连续的
        * 特征3：索引逐一增加，每次加1*/

        int[] b = new int[3];
        //输出数组名
        System.out.println(b);
        //输出数组元素
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println("........");

        /*内存分配。例如int[] c = new int[]  int[] c是栈内存   new int[]是堆内存
        *栈内存：储存局部变量,定义在方法中的变量，例如：arr使用完毕，立即消失
        * 堆内存：储存new出来的内容（实体，对象），数组在初始化时，会为存储空间添加默认值
                 整数：0
                 浮点数：00
                 布尔：false
                 字符：空字符
                 引用数据类型：null
           每一个new出来的东西都有一个地址值，使用完毕，会在垃圾回收器空闲时被回收*/


        //单个数组内存图
        int[] c = new int[3];
        System.out.println(c);
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        c[0] = 100;
        c[1] = 200;
        System.out.println(c);
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println("........");

        //多个数组内存图
        int[] arr2 =new int[2];
        int[] arr3 = new int[3];
        //分别输出数组名及元素
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr3);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        //然后分别给数组中的元素赋值
        arr2[0] =10;
        arr2[1] = 20;
        arr3[1] =300;
        arr3[2] =400;
        //分别再次输出数组名及数组元素
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr3);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("........");


        //多个数组指向相同数组,了（多个数组会相同，其中一个数组变化，其他数组指向变化了的数组）
        int[] arr4 = new int[3];
        arr4[0] =100;
        arr4[1] =200;
        arr4[2] =300;
        System.out.println(arr4);
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        //定义第二个数组等于第一个数组
        int[] arr5 = arr4;
        arr5[0]=111;
        arr5[1]=222;
        arr5[2]=333;
        //输出两个数组的名及元素
        System.out.println(arr4);
        System.out.println(arr4[0]);
        System.out.println(arr5);
        System.out.println(arr5[0]);

    }
}
