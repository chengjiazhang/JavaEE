package FileByteDemo;

import java.io.*;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 22:37
 * @Description:
 */
public class CopyTest {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("test.txt");
            System.out.println("a.txt");
            System.exit(1);
        }
        File f1 = new File("test.txt");
        File f2 = new File("a/test02.text");
        if (!f1.exists()) {
            System.out.println("源文件不存在");
            System.exit(1);
        }

        InputStream input = null;
        OutputStream out = null;
        try {
            input = new FileInputStream(f1);
            out = new FileOutputStream(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (input != null && out != null) {
            int temp = 0;
            try {
                while ((temp = input.read()) != -1) {
                    out.write(temp);
                }
                System.out.println("复制成功");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("失败");
            }
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
