package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 21:03
 * @Description:创建文件夹,给出路径
 */
public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        File f=new File("mldn");
        f.mkdir();
        String str[]=f.list();
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
