package Package_01;
/*System类的概述
* System包含几个有用的类字段和方法，它不能被实例化
* */
public class SystemDemo {
    public static void main(String[] args) {
        //public static void exit(int status)终止当前运行的Java虚拟机，非零表示终止异常
        /*System.out.println("开始");
        System.exit(0);

        System.out.println("结束");

         */

        //public static Long currentTimeMills()返回当前时间值（以毫秒为单位）
        //System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");//当前时间与1970年的时间差

        long start = System.currentTimeMillis();
        for(int i=0;i<=1000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();//long start 记录开始时间
        System.out.println("共耗时"+(end-start)+"毫秒");
    }
}
