import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CylinderTest {

    @Test
    public void volumeTest(){
        Cylinder cylinder = new Cylinder();
        double result = cylinder.volume(1, 4);
        assertEquals(12.566370614359172 ,result,0.0);
    }
    @Test
    public void surfaceAreaTest(){
        Cylinder cylinder = new Cylinder();
        double result = cylinder.surfaceArea(1, 4);
        assertEquals(37.69911184307752,result,0.0);
    }
    
}
