import java.util.Scanner;

public class Gorjeta{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double ValorConta, Gorjeta;

        do {
            System.out.println("Informe o valor da conta: ");
            ValorConta = teclado.nextDouble();

            if (ValorConta < 0) {
                System.out.println("Conta inválida, ela não pode ser negativa.");
            }
        } while (ValorConta < 0);

        
        Gorjeta = 0.10 * ValorConta;

    System.out.println("O valor a ser pago de gorjeta é: " + Gorjeta );

 teclado.close(); 
    }
}
