package Package_10;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/*反射操作泛型
    Java采用泛型擦除的机制来引入泛型
    为了通过反射操作这些类型，Java新增了
    ParameterizedType:表示一种参数化类型，比如Collection<String>
    GenericArrayType:表示一种元素类型是参数化类型或者类型变量的数组类型
    TypeVariable:是各种类型变量的公共父接口
     WildcardType:代表一种通配符类型表达式*/
public class Test_08 {
    public void test01(Map<String,User> map, List<String> list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test_08.class.getDeclaredMethod("test01", Map.class, List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();//获得泛型的参数类型

        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);
            if (genericParameterType instanceof ParameterizedType){//如果属于ParameterizedType:表示一种参数化类型
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("$"+actualTypeArgument);//真实的参数
                }
            }
        }
        System.out.println(".......................");


        Method method1 = Test_08.class.getDeclaredMethod("test02",null);

        Type genericReturnType = method1.getGenericReturnType();//获得泛型的返回值类型

        //这部分和上面一样，判断泛型返回参数类型是否为参数化类型
        if (genericReturnType instanceof ParameterizedType){//如果属于ParameterizedType:表示一种参数化类型
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("$"+actualTypeArgument);//真实的参数
            }
        }


    }
}
