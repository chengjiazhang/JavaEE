package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 20:36
 * @Description:创建新文件
 */
public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File f=new File("test.txt");
        f.createNewFile();
    }
}
