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


/**
 * The QuickSortAlgorithm class implements the QuickSort algorithm for sorting an array of
 * integers. 
 * 
 * @author	André Maré
 */
public final class QuickSortAlgorithm {

	
	/**
	 * The private constructor suppresses the default constructor to prevent the instantiation of class 
	 * (Ensuring non-instantiability.)
	 */
	private QuickSortAlgorithm() {
	} // constructor
	
	
	public static void sort(int[] _collection) {
		quickSort(_collection, 0, _collection.length-1);
	} // method sort
	
	
	private static void quickSort(int[] collection, int firstPosition, int lastPosition) {
		if (firstPosition >= lastPosition) {
			return;
		} else {			
			int pivotIndex = partition(collection, firstPosition, lastPosition);
			quickSort(collection, firstPosition, pivotIndex-1);
			quickSort(collection, pivotIndex+1, lastPosition);
		} // end if		
	} // method quickSort
	
	
	private static int partition(int[] collection, int firstPosition, int lastPosition) {	
		int pivotIndex = selectPivot(firstPosition, lastPosition);
		swap (collection, pivotIndex, lastPosition);
		int store = firstPosition;
		pivotIndex = lastPosition;
		for (int i = firstPosition; i <= lastPosition-1 ; i++) {
			if (collection[i] <= collection[pivotIndex]) {
				swap (collection, i, store);
				store++;
			}
		}
		swap (collection, store, pivotIndex);
		pivotIndex = store;
		return pivotIndex;
	} // method partition	
	
	
	private static void swap(int[] collection, int x, int y) {
		int temp = collection[x];
		collection[x] = collection[y];
		collection[y] = temp;
	} // method swap
	

	private static int selectPivot(int first, int last) {
        int pivotPosition = (first+last)/2;
		return pivotPosition;
	} // method selectPivot

	
} // class QuickSortAlgorithm
