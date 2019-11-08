package FileDemo;

import java.io.File;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 21:11
 * @Description:输出文件夹内容
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File f=new File("src");
        File files[]=f.listFiles();
        for (int i=0;i<f.length();i++){
            System.out.println(files[i]);
        }
    }

}