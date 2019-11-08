package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 20:51
 * @Description:删除文件,新建文件，判断是否存在
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f=new File("a"+File.separator+"test.txt");
        if(f.exists()){
        f.delete();
    }else{
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}
