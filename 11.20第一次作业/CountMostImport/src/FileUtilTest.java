import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dell--pc on 2016/11/16.
 */
public class FileUtilTest {
    public static void main(String[] args) throws IOException {
        /*
        把路径改好即可
         */
        File dir=new File("D:\\eclipse code\\Algo");
        FileUtil.scan(dir);


    }
}
