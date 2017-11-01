/**
 * MIT License
 * 
 * Copyright (c) 2017 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.opensort.algorithm;


import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import com.code2bits.opensort.utils.ArrayUtils;


/**
 * The QuickSortAlgorithmTest class forms part of the Test Driven Development approach to test the 
 * QuickSortAlgorithm class.
 * 
 * @author	André Maré
 */
public class QuickSortAlgorithmTest {

	
	@Test
	public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<QuickSortAlgorithm> constructor = QuickSortAlgorithm.class.getDeclaredConstructor();
		assertEquals("Modifier is Private.", true, Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	} // method testConstructorIsPrivate
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testQuickSortNull() {
		int[] unsortedArray = null;
		QuickSortAlgorithm.sort(unsortedArray);
	} // method testQuickSortNull

	
	@Test
	public void testQuickSortSizeOne() {
		int[] unsortedArray = ArrayUtils.generateArraySize(1);
		assertSortedArray(unsortedArray);
	} // method testQuickSortSizeOne
	
	
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
		QuickSortAlgorithm.sort(unsortedArray);
		assertEquals("Array is Sorted.", true, ArrayUtils.isSorted(unsortedArray));
	} // method assertSortedArray 
	
}
