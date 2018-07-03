package com.company.lab5;

import java.util.Random;
import java.util.Scanner;

public class lab5_z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][M];

        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = rand.nextInt(20);
                System.out.print(Integer.toString(arr[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        boolean[] sorted = new boolean[M]; //массив бинарных значений отсортированности столбцов(true - отсортирован)
        for(int i = 0; i < M; i++) {
            boolean sort = true;

            //проверка на сортированность по возрастанияю
            for(int j = 0; j < N-1; j++) {
                if( !(arr[j][i] < arr[j+1][i]) ) {
                    sort = false;
                }
            }

            if (!sort) { //если не отсортирован по возрастанию
                sort = true;
                //проверяем отсортировал ли по убыванию
                for(int j = 0; j < N-1; j++) {
                    if( !(arr[j][i] > arr[j+1][i]) ) {
                        sort = false;
                    }
                }
            }
            sorted[i] = sort;
        }
        int max = 0;
        //находим максимум от всех сортированных столбцов
        for(int i = 0; i < M ; i++) {
            if (sorted[i]) {
                for(int j = 0; j < N; j++) {
                    if (arr[j][i] > max) {
                        max = arr[j][i];
                    }
                }
            }
        }

        System.out.println(max);
    }
}