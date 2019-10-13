package tartu1nobe.backend;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tartu1nobe.backend.Vechile.Car;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarBatteryTextTests {

    @Test
    public void givenFileContent_carIdIsReturned() {
        Car car = new Car();
        car.setBatteryPercentage("100%");
        Assert.assertEquals("Battery full",car.getChargingText());

        car.setBatteryPercentage("4%");
        Assert.assertEquals("Battery percentage critically low!",car.getChargingText());

        car.setBatteryPercentage("12%");
        Assert.assertEquals("Battery percentage very low",car.getChargingText());

        car.setBatteryPercentage("30%");
        Assert.assertEquals("Battery running low",car.getChargingText());

        car.setBatteryPercentage("29%");
        Assert.assertEquals("Battery running low",car.getChargingText());

        car.setBatteryPercentage("31%");
        Assert.assertEquals("Battery percentage OK",car.getChargingText());

        car.setBatteryPercentage("50%");
        Assert.assertEquals("Battery percentage OK",car.getChargingText());

        car.setBatteryPercentage("0%");
        Assert.assertEquals("Battery percentage critically low!",car.getChargingText());

    }
}
