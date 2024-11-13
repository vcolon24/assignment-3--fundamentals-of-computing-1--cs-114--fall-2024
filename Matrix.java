public class Matrix {
  private int[][] matrix;     //2D

  public Matrix(int size) {
    matrix = new int[size][size];      //size = input number
  }

  public void printMatrix() {
    for(int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (row + col == matrix.length - 1) {
          System.out.print("\u001B[36m" + matrix[row][col] + "\u001B[0m" + "\t");      // highlighting the diagonal numbers blue spaced ("/t")
        } else {
          System.out.print(matrix[row][col] + "\t");
      }
    }
    System.out.println();
  }
}

  public void populateMatrix() {                                      //populated matrix
    int value = 1;
    for(int row = 0; row < matrix.length; row++) {
      for(int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = value++;
      }
    }
  }
  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
  public void flipMatrix() {                                        //flipping matrix
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length - row - 1; col++) {
        if(row + col != matrix.length - 1){
          swap(row, col, matrix.length - row - 1, matrix.length - col - 1);        //flipping matrix top to bottom
        }
      }
    }
   }
  }







