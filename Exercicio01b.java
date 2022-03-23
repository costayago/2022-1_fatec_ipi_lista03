//1.B) Escreva um programa que exiba os primeiros 100 números
//naturais. Faça versões usando for, whilhe e do while.
//=================USANDO WHILE===============================

public class Exercicio01b {
    public static void main(String[] args) {
        int contador=0;
        while(contador <= 100){
            System.out.printf(contador + " ");
            contador++;
        }
    }
}
