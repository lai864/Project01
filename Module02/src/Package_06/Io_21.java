package Package_06;

import java.io.*;

/*复制单级文件夹*/
public class Io_21 {
    public static void main(String[] args) throws IOException{
        //指向一个文件名称，名称变化不受影响
        File srcFolder = new File("D:\\steam");//因为是复制文件，所以这个地址是真的存在
        String srcFolderN = srcFolder.getName();//拿到每次的字符串名字，这一次是steam

        //复制到本模块的地址名称，指向这个相对地址
        File destFolder = new File("Module02",srcFolderN);//输出是Module02/steam,自动转换

        if (!destFolder.exists()){
            destFolder.mkdir();
        }

        //增强for拿到steam下的每个文件，并复制
        File[] listFiles = srcFolder.listFiles();
        for (File srcFile:listFiles){
            //每遍历得到一个文件，指向一个地址，此时文件并不存在，
            String srcFileName = srcFile.getName();//得到这个文件字符串名称
            //指向本模块地址，此时本模块地址还不存在
            File destFile = new File(destFolder,srcFileName);
            copyFile(srcFile,destFile);
        }

    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
