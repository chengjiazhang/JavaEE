package RandomFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 21:59
 * @Description:
 */
public class FileDemo01 {

    public static void main(String[] args) throws IOException {
        File f=new File("test.txt");
        RandomAccessFile rdf=null;
        rdf=new RandomAccessFile(f,"rw");
        String name=null;
        int age=0;
        name="zhangsan";
        age=30;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        rdf.close();
    }
}
