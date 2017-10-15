package com.github.engfragui.fundamentals.sort;

import java.util.Arrays;

public class QuickSort {

  private static void quickSort(int[] array) {
    quickSort(array, 0, array.length-1);
  }

  private static void quickSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }

    int pivotIndex = partition(array, start, end);
    quickSort(array, start, pivotIndex - 1);
    quickSort(array, pivotIndex + 1, end);
  }

  // returns the index of the pivot
  private static int partition(int[] array, int start, int end) {

    // pick pivot element, let's say I always pick the last element of the array
    int pivot = array[end];
    int pivotIndex = start;

    for (int i=start; i<end; i++) {

      // compare array[i] with pivot element, if array[i] <= pivot swap array[i] with array[pivotIndex]
      if (array[i] <= pivot) {

        // swap array[i] array[pivotIndex]
        int temp = array[i];

        array[i] = array[pivotIndex];
        array[pivotIndex] = temp;

        // move up pivotIndex
        pivotIndex++;
      }
    }

    // swap element at pivotIndex with element at last index
    int temp = array[end];
    array[end] = array[pivotIndex];
    array[pivotIndex] = temp;

    return pivotIndex;
  }

  public static void main(String args[]) {

    int[] array = new int[] {5,2,7,8,9,4,2,6};

    System.out.println("initial array = " + Arrays.toString(array));

    quickSort(array);

    System.out.println("final array = " + Arrays.toString(array));
  }
}