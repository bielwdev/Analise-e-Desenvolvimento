import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int soma = 0;

        String input = JOptionPane.showInputDialog("Digite a quantidade de números que deseja somar");
        int qntNumeros = Integer.parseInt(input);

        for(int i = 1; i <= qntNumeros; i++) {
            input = JOptionPane.showInputDialog("Digite o número " + i + " de " + qntNumeros);
            int numero = Integer.parseInt(input);
            listaNumeros.add(numero);
            soma += numero;
        }

        JOptionPane.showMessageDialog(null,"A soma dos números " + listaNumeros + " é igual a " + soma);
    }
}
