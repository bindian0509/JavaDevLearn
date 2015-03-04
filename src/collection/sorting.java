package collection;

import java.util.ArrayList;
import java.util.Random;

public class sorting {
	// selection sort Normal BASIC Version 0.0.1
	public static int[] selectionSort1(int[] x) {
		for (int i=0; i<x.length-1; i++) {
			for (int j=i+1; j<x.length; j++) {
				if (x[i] > x[j]) {
					//... Exchange elements
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}
	// Selection Sort version 0.0.2
	public static int[] selectionSort2(int[] x) {
		for (int i=0; i<x.length-1; i++) {
			int minIndex = i;      // Index of smallest remaining value.
			for (int j=i+1; j<x.length; j++) {
				if (x[minIndex] > x[j]) {
					minIndex = j;  // Remember index of new minimum
				}
			}
			if (minIndex != i) { 
				//...  Exchange current element with smallest remaining.
				int temp = x[i];
				x[i] = x[minIndex];
				x[minIndex] = temp;
			}
		}
		return x;
	}



	public static void mergeSort_srt(int array[],int lo, int n)
	{
		int low = lo;
		int high = n;
		if (low >= high) 
		{
			return;
		}

		int middle = (low + high) / 2;

		mergeSort_srt(array, low, middle);
		mergeSort_srt(array, middle + 1, high);

		int end_low = middle;
		int start_high = middle + 1;
		while ((lo <= end_low) && (start_high <= high)) 
		{
			if (array[low] < array[start_high]) 
			{
				low++;
			} else 
			{
				int Temp = array[start_high];
				for (int k = start_high- 1; k >= low; k--) 
				{
					array[k+1] = array[k];
				}
				array[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}  



	//quick sort Method

	public static void quick_srt(int array[],int low, int n)
	{
		int lo = low;
		int hi = n;
		if (lo >= n) // for only 1 or zero elements just return the control
		{
			return;
		}
		int mid = array[(lo + hi) / 2]; //find out the mid
		while (lo < hi) 
		{
			while (lo<hi && array[lo] < mid) 
			{
				lo++;
			}
			while (lo<hi && array[hi] > mid) 
			{
				hi--;
			}
			if (lo < hi) 
			{
				int T = array[lo];
				array[lo] = array[hi];
				array[hi] = T;
			}
		}
		if (hi < lo) 
		{
			int T = hi;
			hi = lo;
			lo = T;
		}
		quick_srt(array, low, lo);
		quick_srt(array, lo == low ? lo+1 : lo, n);
	}



	//merge sort code in java 
	//sorted in ascending order

	public static int[] mergeSort(int array[])
	{
		// if the array has more than 1 element, we need to split it and merge the sorted halves
		if(array.length > 1)
		{
			// number of elements in sub-array 1
			// if odd, sub-array 1 has the smaller half of the elements
			// e.g. if 7 elements total, sub-array 1 will have 3, and sub-array 2 will have 4

			int elementsInA1 = array.length/2;

			// since we want an even split, we initialise the length of sub-array 2 to
			// equal the length of sub-array 1

			int elementsInA2 = elementsInA1;

			// if the array has an odd number of elements, let the second half take the extra one
			// see note (1)

			if((array.length % 2) == 1)
				elementsInA2 += 1;

			// declare and initialise the two arrays once we've determined their sizes

			int arr1[] = new int[elementsInA1];
			int arr2[] = new int[elementsInA2];

			// copy the first part of 'array' into 'arr1', causing arr1 to become full

			for(int i = 0; i < elementsInA1; i++)
				arr1[i] = array[i];

			// copy the remaining elements of 'array' into 'arr2', causing arr2 to become full

			for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
				arr2[i - elementsInA1] = array[i];

			// recursively call mergeSort on each of the two sub-arrays that we've just created
			// note: when mergeSort returns, arr1 and arr2 will both be sorted!
			// it's not magic, the merging is done below, that's how mergesort works :)

			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);

			// the three variables below are indexes that we'll need for merging
			// [i] stores the index of the main array. it will be used to let us
			// know where to place the smallest element from the two sub-arrays.
			// [j] stores the index of which element from arr1 is currently being compared
			// [k] stores the index of which element from arr2 is currently being compared

			int i = 0, j = 0, k = 0;

			// the below loop will run until one of the sub-arrays becomes empty
			// in my implementation, it means until the index equals the length of the sub-array

			while(arr1.length != j && arr2.length != k)
			{
				// if the current element of arr1 is less than current element of arr2
				if(arr1[j] < arr2[k])
				{
					// copy the current element of arr1 into the final array
					array[i] = arr1[j];
					// increase the index of the final array to avoid replacing the element
					// which we've just added
					i++;
					// increase the index of arr1 to avoid comparing the element
					// which we've just added
					j++;
				}
				// if the current element of arr2 is less than current element of arr1
				else
				{
					// copy the current element of arr1 into the final array
					array[i] = arr2[k];
					// increase the index of the final array to avoid replacing the element
					// which we've just added
					i++;
					// increase the index of arr2 to avoid comparing the element
					// which we've just added
					k++;
				}
			}
			// at this point, one of the sub-arrays has been exhausted and there are no more
			// elements in it to compare. this means that all the elements in the remaining
			// array are the highest (and sorted), so it's safe to copy them all into the
			// final array.
			while(arr1.length != j)
			{
				array[i] = arr1[j];
				i++;
				j++;
			}
			while(arr2.length != k)
			{
				array[i] = arr2[k];
				i++;
				k++;
			}
		}
		// return the sorted array to the caller of the function
		return array;
	}
	public static void main(String[] args) {
		// s0rts
		int[] abc = { -12, 0, 23, 9954, -9984, 32, 3, 435, 6556, 23, 34, -9, 678342, -1000 };
		System.out.println("From unsorted array : ");
		for (int i : abc) System.out.println(i);
		System.out.println("From Selection Sort v 0.0.1 : ");
		for (int i : selectionSort1(abc)) System.out.println(i);
		System.out.println("From Selection Sort v 0.0.2 : ");
		for (int i : selectionSort2(abc)) System.out.println(i);

		ArrayList _arr = new ArrayList();

		for ( int i=0; i<10; i++)
		{
			_arr.add(i);
		}

		Random rand = new Random();

		int tobeSorted[] = new int[10000];
		for ( int j=0; j< 10000; j++)
		{
			tobeSorted[j] = rand.nextInt();
		}
		long startTime = System.currentTimeMillis();
		//for (int i : mergeSort(tobeSorted)) System.out.println(i);
		quick_srt(tobeSorted, 0, tobeSorted.length-1);
		//for (int i : tobeSorted) System.out.println(i);
		//for (int i : selectionSort2(tobeSorted)) System.out.println(i);
		long endTime = System.currentTimeMillis();

		System.out.println("Total elapsed time in execution of mergesort for 2147442 integers is :"+ (endTime-startTime));

	}

}
