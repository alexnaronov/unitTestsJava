import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {
    @Test
    public void firstTest() {
       Assert.assertTrue(new MyTriangle().makeTriangle(0,0,10,10));
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(new MyTriangle().makeTriangle(-100,-100,-100,-100),true);
    }

    @Test
    @Before
    public void thirdTest() {
        new pngSaveFilter().accept(null);
    }

    @Test
    @After
    public void fourthTest() {
        new txtSaveFilter().accept(null);
    }


}