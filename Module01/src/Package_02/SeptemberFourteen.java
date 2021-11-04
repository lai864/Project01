package Package_02;

public class SeptemberFourteen {
    public static void main(String[] args){
        /*静态初始化
        *   初始化时指定每个数组元素初始值，由系统决定数组长度
        *
        *   格式：数据类型[] 变量名 = {数据1，数据2，数据3，....}
        *   范例：int[] arr = {1,2,3};
        * */
        //定义数组
        int arr[] = {1,2,3};

        //输出数组名
        System.out.println(arr);
        //输出数组元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("......");



        /*数组索引从0开始
        *数组操作的两个常见小问题：
        *   索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
        *   空指针异常：访问的数组已经不再指向堆内存数据，造成空指针异常
        *   null:空值，引用数据类型的默认值，表示不再指向任何有效对象 */
        /*int[] arr2 = new int[2];
        System.out.println(arr2[3]);
        arr2 =null;
        System.out.println(arr2[0]);
         */

        /*数组常见操作*/
        //遍历：
        int[] arr3 = {111,222,333};
        for(int a= 0;a<3;a++){
            System.out.println(arr3[a]);
        }
        System.out.println("......");
        /*遍历通用格式
        int[] arr = new int[....]
        for(int x=0;x<arr.length;x++){
        system.out.println(arr[x]);
        }
         */
        int[] arr4 = {11,22,33,44};
        for(int x=0;x<arr4.length;x++){
            System.out.println(arr4[x]);
        }
        System.out.println("........");
        //获取最值
        int[] arr5 ={12,45,6,9,60};//定义数组
        int max = arr5[0];//定义中间值等于定义个元素
        for(int c=1;c<arr5.length;c++){//历遍
            if(arr5[c]>max){//数组元素与中间量比较
                max=arr5[c];//得到新的最值
            }
        }
        System.out.println("max:"+max);//结束，得到最大值




    }
}
