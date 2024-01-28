package Shop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFile {

    static public void writeInfo(int x){
        String path = "Prize.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            bw.write(x + " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
