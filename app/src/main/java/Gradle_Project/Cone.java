package Gradle_Project;

public class Cone {
        //Code to calculate volume and return it for tests
        public double volume (int radius, int height){
            // No sqaure funtion so i manually coded it to be squared
            double radiusSquared = radius*radius;
            //Equation to solve volume
            double volume = Math.PI * radiusSquared * height/3;
            return volume;
        }
    //Code to calculate surface area and return it for tests
        public double surfaceArea (int radius, int height){
            //couldnt find a square sqaure funtion so i manually coded it to be squared
            double radiusSquared = radius*radius;
            //Equation to solve surface area
            double surfaceArea = Math.PI * (radius + Math.sqrt( height*height* radiusSquared));
            return surfaceArea;
        }
    //Code to calculate later surface area and return it for tests
        public double lateralSurfaceArea (int radius, int height){
            //Lateral Surface area equation
            double lateralSurfaceArea = Math.PI * (radius * Math.sqrt( height*height* radius*radius));
            return lateralSurfaceArea;
        }
    
}
