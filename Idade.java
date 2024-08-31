import java.util.Scanner;
public class Idade{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
    int AnoNasc, Idade, AnoAtual, IdadeFuturo, AnoFuturo;
     System.out.println("Informe o ano atual: ");
         AnoAtual = teclado.nextInt();
     System.out.println("Informe o ano de nascimento:");
         AnoNasc = teclado.nextInt();
        
         Idade = AnoAtual - AnoNasc;

     System.out.println("Sua idade é: " + Idade);

     System.out.println("Digite um ano futuro: ");
            AnoFuturo = teclado.nextInt();
        
        IdadeFuturo = AnoFuturo - AnoAtual;
     System.out.println("Sua idade será: " + IdadeFuturo);
        System.exit (0);
    }
}