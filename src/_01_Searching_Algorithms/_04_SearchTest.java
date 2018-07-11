package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] words = {"lame", "lamer", "lamest", "lamerest"};
	@Test
	void testLinearSearch() {
		_00_LinearSearch lin = new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		assertEquals(3, lin.linearSearch(words, words[3]));
		assertEquals(1, lin.linearSearch(words, words[1]));
		assertEquals(4, lin.linearSearch(words, words[4]));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
