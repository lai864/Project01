package Package_04;
/*可变参数
*
* 可变参数又称参数个数可变，用作方法是形参出现，那么方法参数个数就是可变的了
*   格式：修饰符 返回值类型 方法名(数据类型...变量名){}
*   范例：public static int sum(int...a){}
*
* 可变参量注意事项
*   这里的变量其实是一个数组
*   如果一个方法有多个参数，包含可变参量，可变参量要放在后面*/
public class Generic_02 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(10,20,30));
        System.out.println(sum(100,200,300));
    }

    public static int sum(int b,int...a){

    //public static int sum(int...a){
        int sum=0;
        for (int i:a){
            sum += i;
        }
        return sum;
    }


}
