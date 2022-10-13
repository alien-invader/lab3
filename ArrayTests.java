import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = {3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3}, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReversed2() {
    int[] input1 = {10, 8};
    assertArrayEquals(new int[]{8, 10}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testLowest1() {
    double[] input1 = {1.0, 1.0, 5.0, 9.0};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
