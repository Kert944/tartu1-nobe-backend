package tartu1nobe.backend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tartu1nobe.backend.CarParameters.CarLocationParameter;
import tartu1nobe.backend.CarParameters.CarParameter;
import tartu1nobe.backend.CarParameters.Coordinate;
import tartu1nobe.backend.CarParameters.TemperatureParameter;
import tartu1nobe.backend.controller.*;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


public class AcceptanceTests {

    @Mock
    private RegistrationService registrationService;

    @Mock
    private LoginService loginService;

    private CarLockControllerService carLockControllerService = new CarLockControllerServiceImpl();

    private BatteryPercentageService batteryPercentageService = new BatteryPercentageServiceImpl();

    @Mock
    private LocationGetterServices locationGetterServices;

    private LocationService locationService = new LocationServiceImpl();

    private CarParametersService carParametersService = new CarParametersServiceImpl();

    private TemperatureControllerService temperatureControllerService = new TemperatureControllerServiceImpl();


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void userShouldBeAbleToLoginWithCorrectCredentials() {
        String userName = "testUser";
        String password = "testPassword";
        when(registrationService.validateAndRegisterUser(anyString(), anyString())).thenReturn(true);
        when(loginService.validateUser(anyString(), anyString())).thenReturn(true);
        when(loginService.performLogin()).thenReturn(true);

        boolean userRegistered = registrationService.validateAndRegisterUser(userName, password);
        Assert.assertTrue(userRegistered);

        boolean userCanNowLogin = loginService.validateUser(userName, password);
        Assert.assertTrue(userCanNowLogin);
        Assert.assertTrue(loginService.performLogin());
    }


    @Test
    public void userShouldBeAbleToLockHisCar() {
        carLockControllerService.unlock();
        Assert.assertFalse(carLockControllerService.isCarLocked());
        carLockControllerService.lock();
        Assert.assertTrue(carLockControllerService.isCarLocked());
    }

    @Test
    public void userShouldBeAbleToUnLockHisCar() {
        carLockControllerService.lock();
        Assert.assertTrue(carLockControllerService.isCarLocked());
        carLockControllerService.unlock();
        Assert.assertFalse(carLockControllerService.isCarLocked());
    }

    @Test
    public void userShouldBeAbleToChangeBatteryChargingLimit() {
        batteryPercentageService.changeBatteryChargingLimit(30);
        Assert.assertEquals(30L, batteryPercentageService.getBatteryPercantageCharnignLimit());
    }

    @Test
    public void userShouldBeAbleToSeeCarLocation() {
        //TODO: THIS NEEDS REAL IMPLEMENTATION OF fake location setter
        when(locationGetterServices.moveCar()).thenReturn(new Coordinate(123456L, 987654L));
        Coordinate newFakeCoordinates = locationGetterServices.moveCar();
        Coordinate carsCurrentLocation = locationService.getCoordinate();
        Assert.assertEquals(newFakeCoordinates.getLatitude(), carsCurrentLocation.getLatitude());
        Assert.assertEquals(newFakeCoordinates.getLongitude(), carsCurrentLocation.getLongitude());
    }

    @Test
    public void userShouldBeAbleToSeeCarParameters() {
        setTestCarParameters();
        Assert.assertEquals(2, carParametersService.getCarParameters().size());
    }
    private void setTestCarParameters() {
        List<CarParameter> carParams = Arrays.asList(new TemperatureParameter(24), new CarLocationParameter(new Coordinate(123456L, 987654L)));
        carParametersService.addMultipleCarParameters(carParams);
    }

    @Test
    public void userShouldBeAbleToChangeTemperature() {
        temperatureControllerService.changeTemperature(23);
        Assert.assertEquals(23, temperatureControllerService.getTemperature());
    }

}
