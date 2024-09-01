import java.util.Scanner;

public class PesoIdealMulheres{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double PesoIdeal, Altura ;

       
            System.out.println("Digite sua altura em metros para calcular o peso ideal (para mulheres):  ");
            Altura = teclado.nextDouble();
            if (Altura <= 0) {
                System.out.println("Altura inválida. Por favor, insira um valor positivo.");
            } else {

                PesoIdeal = (62.1 * Altura) - 44.7 ;
        
        System.out.println("O seu peso ideal é : " + PesoIdeal);

 teclado.close(); 
    }
    }
}
