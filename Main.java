import java.util.Scanner;
/**
 * This program will take in 2 3D vectors and calculate the dot product
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create variable array for first vector
    int[] vector1 = new int[3];

    // create variable array for the second vector
    int[] vector2 = new int[3];

    // ask user to enter in 3 values for first vector
    System.out.println("Please enter the 3 values for the first vector");

    // create a for loop for first vector
    for(int i = 0; i < 3; i++){
      vector1[i] = input.nextInt();
    }

    // ask user to enter in 3 values for second vector
    System.out.println("Please enter the 3 values for the second vector");

    // create a for loop for second vector
    for(int i = 0; i < 3; i++){
      vector2[i] = input.nextInt();
    }

    // create a variable for total
    int total = 0;

    // create a for loop to determine the dot product
    for(int i = 0; i < vector1.length; i++){
      int sum = vector1[i] * vector2[i];
      total += sum;

    } // let the user know what the dot product is
    System.out.println("The dot product is " + total);

    

    
  }
}
