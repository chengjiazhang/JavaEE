package FileDemo;

import java.io.File;

/**
 * @author: ZCJ
 * @Date: 2019-10-29 21:17
 * @Description:递归判断是否是目录
 */
public class FileDemo07 {
    public static void main(String[] args) {

    File my=new File("mldn");
    print(my);
    }

    private static void print(File file) {

        if(file!=null){
            if(file.isDirectory()){
                File f[]=file.listFiles();
                if(f!=null){
                    for(int i=0;i<f.length;i++){
                        print(f[i]);
                    }
                }
            }else{
                System.out.println(file);
            }
        }


    }
}
