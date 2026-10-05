package com.javacodegeeks.examples.junitmavenexample;

public class App {

    public static void bubbleSort(int[] vet) {
        if (vet == null) {
            return;
        }
        
        int aux;
        for (int i = vet.length; i >= 2; i--) {
            for (int j = 0; j <= i - 2; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}