package Package_02;
/*编译时异常和运行时异常的区别*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*异常处理之throws
* 权限高于try...catch...
* 格式：
* throws 异常类名;
* 注意：这个格式是跟在括号后面的
*
* 编译时异常必须要进行处理，两种处理方案：try...catch...或者throws,如果采用throws这种方案，将来谁调用谁处理
* 运行时异常可以不处理，出现问题后，需要我们回来修改代码*/
public class ExceptionDemo_01 {
    public static void main(String[] args) {
        System.out.println("开始");
        //method();
        try {
            method2();
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("结束");

    }

    //编译时异常
    public static void method2() throws ParseException {
        String s= "2021-9-26";
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = sdf.parse(s);

    }


    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }
}
