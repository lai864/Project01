package Package_06;

import java.io.*;

/*复制多级文件夹*/
public class Io_22 {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("D:\\steam");

        File destFolder  = new File("D:\\box\\");

        copyFolder(srcFile,destFolder);

    }

    public static void copyFolder(File srcFile,File destFolder) throws IOException{
        if (srcFile.isDirectory()){ //递归时srcFile被方法传入file,
            // 这时，srcFile不代表D:\\steam,也就是steam目录，而是代表steam文件下的一个目录或文件，
            // 例如D:\\steam\\javaWEB或D:\\steam\\javaWEB、、荷塘月色.txt
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFolder,srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }

            File[] files = srcFile.listFiles();
            for (File file:files){
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFolder,srcFile.getName());
            copyFile(srcFile,newFile);//递归时srcFile被方法传入file,
            // 这时，srcFile不代表D:\\steam,也就是steam目录，而是代表steam文件下的一个目录或文件，
            // 例如D:\\steam\\javaWEB或D:\\steam\\javaWEB、、荷塘月色.txt
        }
    }

    private static void copyFile(File srcFile, File destFolder) throws IOException {    //把srcFile和newFile传入,
        // 使用方法体时，方法体括号里是形参，调用方法函数括号里的参数为实参
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFolder));

        byte[] bytes = new  byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }



        bis.close();
        bos.close();
    }


}
