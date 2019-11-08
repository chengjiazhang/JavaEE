package FileByteDemo;

import java.io.*;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 22:17
 * @Description:IO流写入字符串
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        OutputStream out = null;
        out = new FileOutputStream(f);
        String str = "Hello World!!!";
        byte b[] = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();

        InputStream input=null;
        input=new FileInputStream(f);
        byte[] b1=new byte[1024];
        input.read(b1);
        input.close();
        System.out.println("内容为"+new String(b1));

    }


}
