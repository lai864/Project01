package Package_03;
/*方法重载练习
*   需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long)*/
public class SeptemberFifteen_02 {
    public static void main(String[] args) {
    boolean result = compare(1,2);
        System.out.println(result);
        System.out.println(compare((short) 1,(short) 2));
        System.out.println(compare((byte) 1,(byte) 2));
        System.out.println(compare(1L,2L));

    }
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
