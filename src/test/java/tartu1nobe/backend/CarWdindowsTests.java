package tartu1nobe.backend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tartu1nobe.backend.Vechile.OpenedClosedStatus;
import tartu1nobe.backend.Vechile.Window;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarWdindowsTests {

    private Window window;

    @Before
    public void beforeEach() {
        window = new Window();
        window.setOpenedPercentage(0);
        window.setStatus(OpenedClosedStatus.CLOSED);
    }

    @Test
    public void windowStatusAssertionsTest() {
        Assert.assertTrue(window.isClosed());
        Assert.assertEquals(0, window.getOpenedPercentage());

        window.setStatus(OpenedClosedStatus.OPENED);
        window.setOpenedPercentage(50);
        Assert.assertTrue(window.isOpened());
        Assert.assertEquals(50, window.getOpenedPercentage());
    }

    @Test
    public void openingWindowTest() {
        window.open();
        Assert.assertTrue(window.isOpened());
        Assert.assertEquals(100, window.getOpenedPercentage());
    }

    @Test
    public void closingWindowTest() {
        window.open();
        window.close();
        Assert.assertTrue(window.isClosed());
        Assert.assertEquals(0, window.getOpenedPercentage());
    }

    @Test
    public void openingWindowByPercentageTest() {
        window.open(0);
        Assert.assertFalse(window.isOpened());

        window.open(20);
        Assert.assertTrue(window.isOpened());
        Assert.assertEquals(20, window.getOpenedPercentage());

        window.open(30);
        Assert.assertTrue(window.isOpened());
        Assert.assertEquals(50, window.getOpenedPercentage());

        window.open(120);
        Assert.assertTrue(window.isOpened());
        Assert.assertEquals(100, window.getOpenedPercentage());
    }

    @Test
    public void closingWindowByPercentageTest() {
        window.close(0);
        Assert.assertTrue(window.isClosed());

        window.open(50);
        Assert.assertFalse(window.isClosed());

        window.close(30);
        Assert.assertFalse(window.isClosed());
        Assert.assertEquals(20, window.getOpenedPercentage());

        window.close(20);
        Assert.assertTrue(window.isClosed());
        Assert.assertEquals(0, window.getOpenedPercentage());

        window.close(120);
        Assert.assertTrue(window.isClosed());
        Assert.assertEquals(0, window.getOpenedPercentage());
    }
}
