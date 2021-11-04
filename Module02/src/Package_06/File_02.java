package Package_06;

import java.io.File;

/*遍历目录，用递归,只输出文件*/
public class File_02 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\steam");

        find(srcFile);
    }

    public static void find(File srcFile){
        File[] fileArray = srcFile.listFiles();
        if (fileArray!=null){
            for (File file:fileArray){
                if(file.isDirectory()){
                    find(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }



    }
}
