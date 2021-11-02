package Gradle_Project;

public class Cylinder {

    //Code to calculate volume and return it for tests
        public double volume (int radius, int height){
            // Couldnt find sqaure funtion so i manually coded it to be squared
            double radiusSquared = radius*radius;
            //Equation to solve volume
            double volume = Math.PI * radiusSquared * height;
            return volume;
        }
    //Code to calculate surface area and return it for tests
        public double surfaceArea (int radius, int height){
            // couldnt find swuare function so i manually coded it to be squared
            double radiusSquared = radius*radius;
            //Equation to solve surface area
            double surfaceArea = 2 * Math.PI * radius * height + 2*Math.PI * radiusSquared*2;
            return surfaceArea;
        }
    //Code to calculate later surface area and return it for tests
        public double lateralSurfaceArea (int radius, int height){
            //Lateral Surface area equation
            double lateralSurfaceArea = 2 * Math.PI * radius * height;
            return lateralSurfaceArea;
        }
    
}
