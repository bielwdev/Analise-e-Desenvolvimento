import java.util.Scanner;

public class ContaDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer dividendo = scanner.nextInt();
        Integer divisor = scanner.nextInt();

        Integer quociente = dividendo / divisor;
        System.out.println("Resultado: " + quociente);

    }

}