package EVDict3;

import java.io.FileWriter;
import java.io.IOException;

public class Bookmark {
    public FileWriter output;

    {
        try {
            output = new FileWriter("Bookmark_Dict.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String line) {
        try {
            output.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
