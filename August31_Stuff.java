import static org.junit.Assert.assertEquals;

public class August31_Stuff {
  
  /* We will create a new method called createList which takes 3 integers
   * those three integers will define the lengths of 3 rows of a 2-D integer array
   * the values in the arrays will be increasing counters. 
   * 
   * Example: 
   *    createList(3,2,3)
   *    
   *    would return 
   *    
   *    [[0, 1, 2],
   *     [3, 4],
   *     [5, 6, 7]]
   */
  public static int[][] createList(int i, int j, int k) {
    int [][] theArray = new int[3][];
    
    // declares the jagged array with the input sizes
    theArray[0] = new int[i];
    theArray[1] = new int[j];
    theArray[2] = new int[k];
    
    // fill in the values
    int count = 0;
    for(int l=0; l<i; l++) {
      theArray[0][l] = count;
      count++;
    }
    for(int l=0; l<j; l++) {
      theArray[1][l] = count;
      count++;
    }
    for(int l=0; l<k; l++) {
      theArray[2][l] = count;
      count++;
    }
    
    return theArray;
  }
}
