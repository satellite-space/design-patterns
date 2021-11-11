package com.wxy.design.patterns.behavioral.strategy;

public class Sorter {

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(Comparable[] arr, int i, int minPos) {
        Comparable temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
