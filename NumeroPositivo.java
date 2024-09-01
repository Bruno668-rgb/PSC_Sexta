import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int Num, ValorQuadrado, ValorCubo;
        double RaizQuadrada , RaizCubica ;
        
        do {
            System.out.println("Informe um número inteiro e positivo: ");
            Num = teclado.nextInt();

            if (Num < 0) {
                System.out.println("Número informado é negativo, por favor digite um número positivo");
            }
        } while (Num < 0); 

        
        ValorQuadrado = Num * Num;
    System.out.println("O quadrado do número " + Num + " é: " + ValorQuadrado);

        ValorCubo = Num * Num * Num;
    System.out.println("O cubo do número " + Num + " é: " + ValorCubo);

        RaizQuadrada =  Math.sqrt(Num) ;
    System.out.println ("A raiz quadrada do " + Num + " é: " + RaizQuadrada);

        RaizCubica = Math.cbrt(Num);
    System.out.println ("A raiz cubica do " + Num + " é: " + RaizCubica);

 teclado.close(); 
    }
}
