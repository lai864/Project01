package Package_04;

import java.util.ArrayList;
import java.util.List;

/*类型通配符
*   为了表示各种泛型List的父类，可以使用类型通配符
*       类型通配符：<?>
        List<?>:表示元素类型未知的List,它的元素可以匹配任何的类型
        * 这种带通配符的List仅表示各种泛型List的父类，并不能把元素添加到其中
  如果我们不希望List<?>是任何泛型List的父类，只希望它代表某一类泛型List的父类，可以使用类型通配符的上限
  *     类型通配符上限：<?extends类型>
        List<?extends Number>:它表示的类型是Number或者其子类型
        *
        * 类型通配符下限：<?super类型>
         */
public class Generic_01 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Number>();
        List<?> list2 = new ArrayList<Object>();
        List<?> list3 = new ArrayList<Integer>();

//        类型通配符上限：<?extends类型>
//                List<?extends Number>:它表示的类型是Number或者其子类型
        List<?extends Number> list4 = new ArrayList<Number>();
        List<?extends Number> list = new ArrayList<Integer>();

       // 类型通配符下限：<?super类型>
        List<?super Number> list5 = new ArrayList<Number>();
        List<?super Object> list6 = new ArrayList<Object>();
    }
}
