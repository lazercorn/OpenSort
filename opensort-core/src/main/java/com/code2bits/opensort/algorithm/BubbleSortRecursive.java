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


import com.code2bits.opensort.Sort;


/**
 * The BubbleSort class implements the Bubblesort algorithm for sorting an array of integers. 
 *  
 * The Bubble Sort algorithm repeatedly steps through the list and compare each adjacent item. The pair 
 * of values gets swapped if they are in the wrong order. The algorithm gets its name from the way smaller 
 * or larger elements "bubble" to the top of the list.
 * 
 * The BubbleSortRecursiveAlgorithm implements the BubbleSort algorithm by making use of recursion.
 * 
 * @author	André Maré
 */
public final class BubbleSortRecursive implements Sort {

		
	/**
	 * The sort method is invoked by external classes to sort an array of integers by making use of the 
	 * BubbleSort algorithm.
	 */
	public void sort(int[] collection) {
		if (collection != null) {
			bubbleSort(collection, collection.length);
		} else {
			throw new IllegalArgumentException("Input paramenter for array to sort is null.");
		}
	} 
	
	/**
	 * The Bubble Sort algorithm repeatedly steps through the list and compare each adjacent item. The pair 
	 * of values gets swapped if they are in the wrong order. The method implements it through one pass of 
	 * the array, whereby the largest element is moved to the last (top) position of the array. The process 
	 * is repeated by recursively invoking the method excluding the last (top) position of the array.
	 */
	private void bubbleSort(int[] collection, int arrayLength) {
        if (arrayLength == 1) {
            return;
        }

        for (int i=0; i < arrayLength-1; i++) {
            if (collection[i] > collection[i+1]) {
            		swap(collection, i, i+1);
            }
        }
        
        bubbleSort(collection, arrayLength-1);
	}
        
        
    	/**
    	 * The method swaps two values around within an array based on the two input parameters x and y.
    	 */
    	private void swap(int[] collection, int x, int y) {
    		int temp = collection[x];
    		collection[x] = collection[y];
    		collection[y] = temp;
    	}
	
}
