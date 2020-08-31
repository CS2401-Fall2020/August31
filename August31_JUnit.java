import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class August31_JUnit {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(August31_JUnit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
    
    /* We will create a new method called createList which takes 3 integers
     * those three positive integers will define the lengths of 3 rows of a 2-D integer array
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
     *     
     * In this class we want to test that creatList is written correctly
     */
    
    // in this test case we are going to verify that 
    // the rows are the size we specified in the input. 
    @Test
    public void testRowLength() {
      int[][] theArray = August31_Stuff.createList(251, 77, 32);
      assertEquals(3,theArray.length); 
      assertEquals(251,theArray[0].length);
      assertEquals(77,theArray[1].length);
      assertEquals(32,theArray[2].length);
    }
    
    // in this test case we are going to verify that 
    // the counters are correct in the array
    @Test
    public void testCounters() {
      int count = 0;
      int[][] theArray = August31_Stuff.createList(5, 999, 57);
      for(int i=0; i<5; i++) {
        assertEquals(count,theArray[0][i]);
        count++;
      }
      for(int i=0; i<999; i++) {
        assertEquals(count, theArray[1][i]);
        count++;
      }
      for(int i=0; i<57; i++) {
        assertEquals(count, theArray[2][i]);
        count++;
      }
    }
    
    // Edge cases: 
    //  >> * smallest inputs
    //  X * largest inputs
    //  X * null inputs
    // in this test case we will test the lower boundary of the input sizes
    @Test
    public void testSmallest() {
      int[][] theArray = August31_Stuff.createList(1,1,1);
      
      /* should be :
       * [[0],
       *  [1],
       *  [2]]
       */
      
      
      assertEquals(3,theArray.length);
      
      /*assertEquals(1,theArray[0].length);
      assertEquals(1,theArray[1].length);
      assertEquals(1,theArray[2].length);
      
      assertEquals(0,theArray[0][0]);
      assertEquals(1,theArray[1][0]);
      assertEquals(2,theArray[2][0]);*/
      
      for(int i=0; i<3; i++) {
        // testing the size
        assertEquals(1,theArray[i].length);
        
        // testing the values
        assertEquals(i,theArray[i][0]);
      }
    }
}
