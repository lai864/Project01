package Package_05;

import java.io.File;
import java.io.IOException;

/*File类创建功能
*
* public boolean createNewFile():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
*   如果文件不存在就创建文件,并返回true
*   如果存在就就不创建，并返回false
* public boolean mkdir():创建由此抽象路径名命名的目录
*   如果目录不存在就创建文件,并返回true
 *   如果存在就就不创建，并返回false
* public boolean mkdirs():创建由此抽象路径名命名的目录,包含任何必需但不存在的父目录
*
* 创建目录注意事项：
* 当要创建一个没有的目录和该目录下的文件，不能用mkdir方法同时修建，会创建两个目录。应先创建目录，在用createNewFile方法创建文件，
*
*
* File类删除功能
* public boolean delete():删除由此抽象路径名表示的文件或目录
*  *绝对路径和相对路径的区别
 *  绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：D:\steam\javaee.txt
 * 相对路径：必须使用取自其他路径名的信息进行解释。例如：Module03\javaee.txt
 * 打开模块的路径：右击模块，在open in中explorer*/

/*删除目录注意事项
 * 如果一个目录中有内容（目录，文件），不能直接删除，应该先删除目录中的内容，最后才能删除目录
* */
public class File_02 {
    public static void main(String[] args) throws IOException {
        //在E:\\steam目录下创建一个文件java.txt
        File f1 = new File("d:\\steam\\java.txt");  //命名
        System.out.println(f1.createNewFile());     //用方法创建
        System.out.println(".............");

        //在E:\\steam目录下创建一个目录JavaSE
        File f2 = new File("d:\\steam\\javaSE");
        System.out.println(f2.mkdir());
        System.out.println(".............");

        //在E:\\steam目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("d:\\steam\\javaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println(".............");

        //在E:\\steam目录下创建一个文件javase.txt
        File f4 = new File("d:\\steam\\javase.txt");
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());//名字相同不能创建，目录和文件也会名称相同冲突



        /*File类删除功能
         * public boolean delete():删除由此抽象路径名表示的文件或目录
         *绝对路径和相对路径的区别
         *  绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件。例如：D:\steam\javaee.txt
         * 相对路径：必须使用取自其他路径名的信息进行解释。例如：Module03\javaee.txt
         * 打开模块的路径：右击模块，在open in中explorer*/

        /*删除目录注意事项
        * 如果一个目录中有内容（目录，文件），不能直接删除，应该先删除目录中的内容，最后才能删除目录 */
        File f5 = new File("Module03\\javaee.txt");
        //需求1：在模块Module03中创建javaee.txt文件
//        System.out.println(f5.createNewFile());

        //需求2：删除模块Module03中的javaee.txt文件
        System.out.println(f5.delete());
        System.out.println("............");

        //需求3：在模块Module03中创建javaSE目录
        File f6 = new File("Module03\\javaSE");
//        System.out.println(f6.mkdir());

        //需求4：在模块Module03中删除javaSE目录
        System.out.println(f6.delete());
        System.out.println("...........");

        //需求7：在模块Module03中创建javaWEB目录，并在该目录下创建java.txt目录
        File f7 = new File("Module03\\javaWEB");
        System.out.println(f7.mkdir());
        File f8 = new File("Module03\\javaWEB\\java.txt");
        System.out.println(f8.createNewFile());

        //需求4：在模块Module03中删除javaSE目录和javaWEB目录
        System.out.println(f8.delete());
        System.out.println(f7.delete());
    }
}
