package com.mycompany.algoritmosordenamiento;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println("=== ALGORITMOS DE ORDENAMIENTO ===\n");

        // Array de ejemplo
        int[] original = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        int[] arr = original.clone();
        BubbleSort.bubbleSort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(arr));

        // Insertion Sort
        arr = original.clone();
        InsertionSort.insertionSort(arr);
        System.out.println("Insertion Sort: " + Arrays.toString(arr));

        // Selection Sort
        arr = original.clone();
        SelectionSort.selectionSort(arr);
        System.out.println("Selection Sort: " + Arrays.toString(arr));

        // Shell Sort
        arr = original.clone();
        ShellSort.shellSort(arr);
        System.out.println("Shell Sort: " + Arrays.toString(arr));

        // Quick Sort
        arr = original.clone();
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));

        // Merge Sort
        arr = original.clone();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arr));

        // Radix Sort (solo para enteros no negativos)
        arr = original.clone();
        RadixSort.radixSort(arr);
        System.out.println("Radix Sort: " + Arrays.toString(arr));
    }
}