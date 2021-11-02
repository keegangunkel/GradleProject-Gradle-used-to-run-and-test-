package Gradle_Project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class SphereTest {

    @Test
    public void volumeTest(){
        Sphere sphere = new Sphere();
        double result = sphere.volume(5);
        assertEquals(392.6990816987241 ,result,0.0);
    }
    @Test
    public void surfaceAreaTest(){
        Sphere sphere = new Sphere();
        double result = sphere.surfaceArea(5);
        assertEquals(314.1592653589793,result,0.0);
    }
    
}
