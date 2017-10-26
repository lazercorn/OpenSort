package com.code2bits.opensort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.code2bits.opensort.utils.ArrayUtils;



public class SorterTest {

	
	@Test
	public void testQuickSortSizeTen() {
		int[] unsortedArray = ArrayUtils.generateArraySize(10);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeTen

	
	@Test
	public void testQuickSortSizeTwenty() {
		int[] unsortedArray = ArrayUtils.generateArraySize(20);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeTwenty
	
	
	@Test
	public void testQuickSortSizeFifty() {
		int[] unsortedArray = ArrayUtils.generateArraySize(50);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeFifty
	
	
	@Test
	public void testQuickSortSizeHundred() {
		int[] unsortedArray = ArrayUtils.generateArraySize(100);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeHundred
	
	
	@Test
	public void testQuickSortSizeThousand() {
		int[] unsortedArray = ArrayUtils.generateArraySize(1000);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeThousand


	private void assertSortedArray(int[] unsortedArray) {
		Sorter quickSortExample = new Sorter(unsortedArray);		
		
		quickSortExample.sort();
		assertEquals("Array is Sorted.", true, ArrayUtils.isSorted(unsortedArray));
	} // method assertSortedArray 
	
	
}
