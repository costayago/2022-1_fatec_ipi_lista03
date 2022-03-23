// 3. Escreva um programa que calcula o fatorial
// de um valor natural digitado pelo usuário.

import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String[] args) {
        int n;
        int resultado = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um numero natural: "
        ));
        for ( ; n>=1 ; n--){
            resultado = resultado * n;
        } 
        JOptionPane.showMessageDialog(null,
        String.format(
            "O resultado e %d",
            resultado 
            ));
    } 
}

