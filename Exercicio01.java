//1) Escreva um programa que exiba os primeiros 100 números
//naturais. Faça versões usando for, whilhe e do while.
//=================USANDO FOR===============================

import java.util.Scanner;
public class Exercicio01{
    public static void main(String[] args) {
        int contador;

        for (contador = 1; contador <= 100; contador ++ ){
            System.out.printf("%d ", contador);
            contador++;
        }
    }
}