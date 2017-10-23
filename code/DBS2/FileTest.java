package DBS2;

import java.io.File;

/**
 * Created by kenneth on 23-10-2017.
 */
public class FileTest {
    public static void main(String... args) {
        File file =
                new File("C:\\hellofile.deleteme");

        System.out.println(file.getAbsolutePath());

    }
}
