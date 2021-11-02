package Gradle_Project;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConeTest {

    @Test
    public void volumeTest(){
        Cone cone = new Cone();
        double result = cone.volume(5, 10);
        assertEquals(261.79938779914943 ,result,0.0);
    }
    @Test
    public void surfaceAreaTest(){
        Cone cone = new Cone();
        double result = cone.surfaceArea(5, 10);
        assertEquals(172.78759594743863,result,0.0);
    }
    
}
