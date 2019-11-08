package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 20:42
 * @Description:按照指定路径创建文件
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        String path="a"+File.separator+"test02.txt";
        File f=new File(path);
        f.createNewFile();
    }
}
