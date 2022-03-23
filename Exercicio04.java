//4. Escreva um programa que verifica se um número
//natural digitado pelo usuário é primo.

import javax.swing.JOptionPane;
public class Exercicio04 {
    public static void main(String[] args) {
        int n;
        int contador=0;

        n = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um numero natural: "));

        for (int i=1; i<n; i++){
            if(n % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            JOptionPane.showMessageDialog(null, 
            String.format(
                "%d e um numero primo ",
                n
            ));
        }
        else 
        JOptionPane.showMessageDialog(null, 
            String.format(
                "%d nao e um numero primo ",
                n
            ));
    }
}
