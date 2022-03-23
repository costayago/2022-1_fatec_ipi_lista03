//1) Escreva um programa que exiba os primeiros 100 números
//naturais. Faça versões usando for, whilhe e do while.
//=================USANDO DO WHILE==============================

public class Exercicio01c {
    public static void main(String[] args) {
        int contador=0;
    do{
        System.out.printf(contador + " ");
        contador++;
    }while(contador <= 100);
    }   
}
