package Package_05;
/*String构造方法：
*   public String(),创建一个空白字符串对象，不含有任何内容
*   public String(char[] chs),根据字符数组的内容，来创建字符串对象
*   public String(byte[] bys),根据字节数组的内容，来创建字符串对象
*   String s = "abc"，直接赋值的方式创建字符串对象，内容就是abc
*
*   推荐使用直接赋值的方式创建字符串对象*/
public class SeptemberSeventeen_02 {
    public static void main(String[] args) {
        //public String(),创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println("s1:"+s1);

        //public String(char[] chs),根据字符组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);

         //public String(byte[] bys),根据字节数组的内容，来创建字符串对象
        byte[] bys = {97,98,99};//97,98,99,字节根据Asll表转换为字符
        String s3 = new String(bys);
        System.out.println("s3:"+s3);

        //String s = "abc"，直接赋值的方式创建字符串对象，内容就是abc
        String s4 = "abc";
        System.out.println("s4:"+s4);
    }
}
/*String对象特点
*   1.通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址值不同
*   char[] chs = {'a','b','c'};
*   String s1 = new String(chs);
    String s2 = new String(chs);
    * 上面代码中，JVM会首先创建一个字符数组，然后每一次new的时候都会有一个新地址，只不过s1和s2参考的字符串内容是相同的
    *
    * 2.以""方式给出的字符串，只要字符序列相同（顺序和大小写），无论在程序代码中出现几次
    * JVM都只会创立一个String对象，并在字符串池中维护
    *   String s3 = "abc";
    *   String s4 = "abc";
    *   在上面的代码中针对第一行代码，JVM会建立一个String对象放在字符串池中，并给s3参考；
    *   第二行则让s4直接参考字符串池中的String对象，也就是说它们本质上是同一个对象*/
//System.out.println(s1==s2);输出false;s1和s2地址不相同
//System.out.println(s3==s4);输出true;s3和s4地址相同




