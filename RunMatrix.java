import java.util.Scanner;

public class RunMatrix {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);                                   // scanning input
  System.out.print("Please enter the size of your matrix: ");
  int size = scanner.nextInt();
  scanner.close();

  System.out.println();

  System.out.println("Your matrix is: " + size + " x " + size);               //size x size (4 x 4)
  System.out.println();

  Matrix matrix = new Matrix(size);                                           // 0 values
  System.out.println("Printing matrix with default values:");
  matrix.printMatrix();
  System.out.println();

  System.out.println("Populating matrix... matrix populated");
  System.out.println();
  System.out.println("Printing matrix:");
  matrix.populateMatrix();                                                   // printing populated matrix
  matrix.printMatrix();
  System.out.println();

  System.out.println("Flipping matrix... matrix flipped");
  System.out.println();
  matrix.flipMatrix();                                                       //printing flipped matrix
  System.out.println("printing flipped matrix:");
  matrix.printMatrix();
}
}
