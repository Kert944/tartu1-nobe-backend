package tartu1nobe.backend;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tartu1nobe.backend.VechileData.VechileDataReader;

import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

    private String fileName = "src/test-data/test-data-1";


    @Test
    public void givenFileName_contentIsReturned() {
        String result = VechileDataReader.readFromFile(fileName);

        Assert.assertEquals("{\"carId\": \"nob001\", \"batteryPercentage\": \"90%\"}", result);
    }

    @Test
    public void givenFileContent_carIdIsReturned() {
        String result = VechileDataReader.getVechileId(VechileDataReader.readFromFile(fileName));

        Assert.assertEquals("nob001", result);
    }

    @Test
    public void givenFileContent_batteryPercentageIsReturned() {
        String result = VechileDataReader.getVechileBatteryPercentage(VechileDataReader.readFromFile(fileName));

        Assert.assertEquals("90%", result);
    }

    @Test
    public void givenNoFile_emptyStringIsReturned() {
        String nonExistantFilePath = "src/test-data/non-existent-file";
        Assert.assertEquals("", VechileDataReader.readFromFile(nonExistantFilePath));
        Assert.assertEquals("", VechileDataReader.getVechileId(nonExistantFilePath));
        Assert.assertEquals("", VechileDataReader.getVechileBatteryPercentage(nonExistantFilePath));
    }

}
