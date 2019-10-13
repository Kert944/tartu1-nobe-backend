package tartu1nobe.backend.VechileData;

import com.fasterxml.jackson.databind.ObjectMapper;
import tartu1nobe.backend.Vechile.Car;

import java.io.*;
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

    public static String getVechileId(String content){
        try {
            return new ObjectMapper().readValue(content, Car.class).getCarId();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getVechileBatteryPercentage(String content) {
        try {
            return new ObjectMapper().readValue(content, Car.class).getBatteryPercentage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
