import java.util.Scanner;
public class Media{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
    Double num1, num2, num3, resultado, soma;
        System.out.println("Informe o primeiro valor: ");
         num1 = teclado.nextDouble();
        System.out.println("Informe o segundo valor:");
         num2 = teclado.nextDouble();
        System.out.println("Informe o terceiro valor: ");
         num3 = teclado.nextDouble();

           soma = num1 + num2 + num3;
           resultado = soma/3;
           
        System.out.println("A média dos valores é: " + resultado);
        
        teclado.close();
    }
}