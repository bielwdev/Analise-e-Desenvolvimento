import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {
        int MatSoma [][],a,b,soma = 0;
        MatSoma = new int [2][2];

        for (a=0;a<=1;a++){
            for(b=0;b<=1;b++) {
                MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                soma = soma + MatSoma[a][b];
            }
        }
        System.out.println("A soma dos 4 valores digitados é: " + soma);
        System.exit(0);
    }
}