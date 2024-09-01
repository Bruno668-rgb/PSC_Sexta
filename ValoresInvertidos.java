import java.util.Scanner;

public class PesoIdealHomens{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double Num1, Num2 ;

            System.out.println("Informe um número: ");
            Num1 = teclado.nextDouble();
            System.out.println("Informe um segundo número:");
            Num2 = teclado.nextDouble();

            System.out.printf("Os dois valores informados são: %.2f e %.2f\n" , Num2 , Num1);
        

 teclado.close(); 
    }

}
