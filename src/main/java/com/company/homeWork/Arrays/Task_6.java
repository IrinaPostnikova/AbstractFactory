package com.company.homeWork.Arrays;

import static com.company.homeWork.Arrays.Task_1.inputArrayWithRandom;
import static com.company.homeWork.Arrays.Task_1.printArray;

//Задача 6/Сделать реверс массива (массив в обратном направлении)
public class Task_6 {
    public static void main(String[] args) {
        int n = 10;
        int a[] = inputArrayWithRandom(n, 0, 10);
        printArray(a, n);
        for (int i = 0; i < n / 2; i++) {
            int tmp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = tmp;
        }
        printArray(a, n);
    }
}
