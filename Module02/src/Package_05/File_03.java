package Package_05;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;

/*File判断和获取功能
* public boolean isDirectory():测试此抽象路径名表示的File是否为目录
* public boolean isFile():测试此抽象路径名表示的File是否为文件
* public boolean exists():测试此抽象路径名表示的File是否存在
* public String getAbsolutePath():返回此抽象路径名的决对路径名字符串
* public String getPath():将此抽象抽象路径名转换为路径名字符串
* public String getName():返回此抽象路径名表示的文件或目录的名称
* public String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
* public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组 */
public class File_03 {
    public static void main(String[] args) {
        //创建一个File对象
        File f1 = new File("steam\\java.txt");

//        public boolean isDirectory():测试此抽象路径名表示的File是否为目录
//        public boolean isFile():测试此抽象路径名表示的File是否为文件
//        public boolean exists():测试此抽象路径名表示的File是否存在
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());



//        public String getAbsolutePath():返回此抽象路径名的决对路径名字符串
//        public String getPath():将此抽象抽象路径名转换为路径名字符串
//        public String getName():返回此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("..............");



//        public String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("D:\\steam");

        String[] list = f2.list();//文件名字
        for (String str:list){
            System.out.println(str);
        }
        System.out.println("..............");


        File[] files = f2.listFiles();//这个方法得到目录和文件的集合，文件对象，绝对和相对路径
        for (File file:files){
//            System.out.println(file);//绝对路径：指完整的某个盘下
//            System.out.println(file.getName());//获取steam下的目录和文件字符串名称
            if (file.isFile()){
//                System.out.println(file);//绝对路径
                  System.out.println(file.getName());//只获取steam下的文件字符串名称
            }

        }
    }
}
