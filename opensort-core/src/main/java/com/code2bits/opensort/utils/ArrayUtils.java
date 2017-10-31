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
package com.code2bits.opensort.utils;


import java.util.Random;


/**
 * 
 * @author	André Maré
 */
public class ArrayUtils {

	
	/**
	 * The private constructor suppresses the default constructor to prevent the instantiation of class 
	 * (Ensuring non-instantiability.)
	 */
	private ArrayUtils() {
	} // constructor
	
	
    public static boolean isSorted(int[] _collection) {    	
        if (_collection.length < 1) {
            return false;
        }
        int previous = _collection[0];        
        for (int i = 1; i < _collection.length; i++) {
            int current = _collection[i];            
            if (previous > current) {
                return false;
            }
            previous = current;
        }
        return true;
    } // end method
    
    
    public static int[] generateArraySize(int _arrayLength) {
	    Random random = new Random();
	    int [] collection = new int [_arrayLength];
	    
	    for (int i=0; i< _arrayLength ;i++){
	    	collection[i] = random.nextInt(_arrayLength);
	    }
	    return collection;
    } // end method
    
    
	
} // end class
