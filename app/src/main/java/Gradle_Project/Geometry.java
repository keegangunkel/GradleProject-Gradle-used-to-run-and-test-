package Gradle_Project;
import java.util.Scanner;

public class Geometry {

    //Main method to initiate user menu
    public static void main(String args[]){
        userMenu();
    }

    public static void userMenu(){
       //Creating a boolean to continue/break the while loop
       boolean valid = true;
       //Scanner to get user input
       Scanner reader = new Scanner(System.in);
       //While loop to create the selection menu
       while(valid){
        System.out.println("Welcome to my geometry program!\nSelect from the following options:\n1.) Cylinder\n2.) Sphere\n3.) Cone\n0.) Quit");
        
        int answer = reader.nextInt();

        if(answer == 1){
            //prompts cylinder program
            cylinderPrompt();
        }
        else if(answer == 2){
            //prompts sphere program
            spherePrompt();
        }
        else if(answer == 3){
            //prompts cone program
            conePrompt();
        }
        else if(answer == 0){
            //Closes program
            System.out.println("Terminating program...");
            reader.close();
            valid = false;
        }
       }
      }
      //Method to prompt the cylinder program
      private static void cylinderPrompt()
      {
  
      System.out.println("------------------------------------------------------------");
      System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CYLINDER");
      System.out.println("------------------------------------------------------------");
  
      Scanner radiusReader = new Scanner(System.in);
      System.out.println("Please enter the radius:");
      int radiusInput = radiusReader.nextInt();
      System.out.println("Please enter the height:");
      Scanner heightReader = new Scanner(System.in);
      int heightInput = heightReader.nextInt();
      //Instantiating a local Cylinder object
      Cylinder cylinder = new Cylinder();
      //invokes volume and surface area method in cylinder class to calculate 
      double volume = cylinder.volume(radiusInput, heightInput);
      double surfaceArea = cylinder.surfaceArea(radiusInput, heightInput);
      //prints out volume and surface area
      System.out.println("\nThe volume of the Cylinder: " + volume); 
      System.out.println("\nThe surface area of the Cylinder: " + surfaceArea + "\n");
       //invokes menu again
      userMenu();
      //Closes scanners
      radiusReader.close();
      heightReader.close();
      }
      //Method to prompt the cone program
      private static void conePrompt()
      {
  
      System.out.println("------------------------------------------------------------");
      System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CONE");
      System.out.println("------------------------------------------------------------");
  
      Scanner radiusReader = new Scanner(System.in);
      System.out.println("Please enter the radius:");
      int radiusInput = radiusReader.nextInt();
      System.out.println("Please enter the height:");
      Scanner heightReader = new Scanner(System.in);
      int heightInput = heightReader.nextInt();
      //Instantiating a local Cylinder object
      Cone cone = new Cone();
      //invokes volume and surface area method in cylinder class to calculate 
      double volume = cone.volume(radiusInput, heightInput);
      double surfaceArea = cone.surfaceArea(radiusInput, heightInput);
      //prints out volume and surface area
      System.out.println("\nThe volume of the Cone: " + volume); 
      System.out.println("\nThe surface area of the Cone: " + surfaceArea + "\n");
       //invokes menu again
      userMenu();
      //Closes scanners
      radiusReader.close();
      heightReader.close();
      }
            //Method to prompt the sphere program
            private static void spherePrompt()
            {
        
            System.out.println("------------------------------------------------------------");
            System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A SPHERE");
            System.out.println("------------------------------------------------------------");
        
            Scanner radiusReader = new Scanner(System.in);
            System.out.println("Please enter the radius:");
            int radiusInput = radiusReader.nextInt();
            //Instantiating a local Cylinder object
            Sphere sphere = new Sphere();
            //invokes volume and surface area method in cylinder class to calculate 
            double volume = sphere.volume(radiusInput);
            double surfaceArea = sphere.surfaceArea(radiusInput);
            //prints out volume and surface area
            System.out.println("\nThe volume of the SPhere: " + volume); 
            System.out.println("\nThe surface area of the Sphere: " + surfaceArea + "\n");
            //invokes menu again
            userMenu();
            //Closes scanners
            radiusReader.close();
            
            }
}