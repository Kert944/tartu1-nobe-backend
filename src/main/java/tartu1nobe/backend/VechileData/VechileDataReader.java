package tartu1nobe.backend.VechileData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

public class VechileDataReader {

    public static String readFromFile(String filename) {
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();

            return br.lines().map(sb::append).collect(Collectors.joining());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
