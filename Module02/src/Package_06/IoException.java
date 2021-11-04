package Package_06;


import java.io.FileOutputStream;
import java.io.IOException;

/*io用方法抛出异常   import java.io.IOException;*/
public class IoException {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\steam\\student.txt");
            fos.write("hello".getBytes());
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
