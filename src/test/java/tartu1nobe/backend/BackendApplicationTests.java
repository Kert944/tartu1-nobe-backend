package tartu1nobe.backend;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tartu1nobe.backend.VechileData.VechileDataReader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

    private String fileName = "src/test-data/test-data-1";


    @Test
    public void givenFileName_contentIsReturned() {
        String result = VechileDataReader.readFromFile(fileName);

        Assert.assertEquals("{\"carId\": \"nob001\"}", result);
    }

    @Test
    public void givenFileContent_carIdIsReturned() {
        String result = VechileDataReader.getVechileId(VechileDataReader.readFromFile(fileName));

        Assert.assertEquals("nob001", result);
    }

}
