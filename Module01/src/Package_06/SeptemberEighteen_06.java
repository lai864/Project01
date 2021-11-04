package Package_06;
/*StringBuilder和String相互转换
*   1.StringBuilder转换为String
*       public String toString：通过toString就可以实现把StringBuilder转换为String
*
*   2.String转换为StringBuilder
*       public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder*/
public class SeptemberEighteen_06 {
    public static void main(String[] args) {
        /*StringBuilder sb =new StringBuilder();
        sb.append("Hello");

        //public String toString：通过toString就可以实现把StringBuilder转换为String
        String s =sb.toString();
        System.out.println(s);

         */

       /* StringBuilder sb4 = new StringBuilder();
        String sb5 =  sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        String sb7=sb6.toString();
        StringBuilder sb8=new StringBuilder();
        String sb9 =sb8.toString();

        */


        String s = "Hello";

        //public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

       /* String s2="qw";
        StringBuilder sbb1 =new StringBuilder(s2);

        String s3 ="ewe";
        StringBuilder sbb2 = new StringBuilder(s3);

        */

    }
}
