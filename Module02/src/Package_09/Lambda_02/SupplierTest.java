package Package_09.Lambda_02;
/*Supplier接口
 * Supplier<T>:包含一个无参的方法
 *   T.get:获得结果
 *   该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现)返回一个数据
 *   Supper<T> 接口也称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get()方法就会产生什么类型的数据供我们使用*/
import java.util.function.Supplier;

/*返回数组最大值*/
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {23,45,12,32,11};

        int maxValue =getMax(()-> {
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    private static int getMax(Supplier<Integer> sup){//固定写法
        return sup.get();//接口是泛型的返回值，里面有无参get方法
    }
}
