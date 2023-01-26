import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);

    //test passes
    assertArrayEquals("demonstrating that the actual output is now correct", 
        input2, new int[]{5,4,3,2,1});
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1,2,3,4,5};
    assertArrayEquals(ArrayExamples.reversed(input2), new int[] {5,4,3,2,1});
  }

  @Test 
  public void testMinimum() {
    double[] input1 = {1,2,3,4,5};
    assertEquals("test", ArrayExamples.averageWithoutLowest(input1), 14.0/4, 0.01);
  }

  
}
