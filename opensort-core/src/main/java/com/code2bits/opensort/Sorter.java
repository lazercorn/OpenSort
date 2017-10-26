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
package com.code2bits.opensort;


/**
 *  
 * 
 * 
 * @author	André Maré	
 */
public class Sorter {


	private int[] collection;
	
	
	public Sorter(int[] _collection) {
		this.collection = _collection;
	} // constructor
	
	
	public void sort() {
		quickSort(collection, 0, collection.length-1);
	} // method sort
	
	
	private void quickSort(int[] collection, int firstPosition, int lastPosition) {
		if (firstPosition >= lastPosition) {
			return;
		} else {			
			int pivotIndex = partition(collection, firstPosition, lastPosition);
			quickSort(collection, firstPosition, pivotIndex-1);
			quickSort(collection, pivotIndex+1, lastPosition);
		} // end if		
	} // end quickSort
	
	
	private int partition(int[] collection, int firstPosition, int lastPosition) {	
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
	} // end partition	
	
	
	private void swap(int[] collection, int x, int y) {
		int temp = collection[x];
		collection[x] = collection[y];
		collection[y] = temp;
	} // end swap
	

	private int selectPivot(int first, int last) {
        int pivotPosition = (first+last)/2;
		return pivotPosition;
	} // end selectPivot

}
