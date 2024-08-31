import java.util.*;
public class Equacao{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    int CoeficienteA, CoeficienteB, CoeficienteC;
    double Delta, Raiz1, Raiz2;
    
        System.out.println("Informe o coeficiente A, da equação: ");
         CoeficienteA = teclado.nextInt();
    
         System.out.println("Informe o coeficiente B, da equaçãao:");
         CoeficienteB = teclado.nextInt();
        
         System.out.println("Informe o coeficiente C, da equação:");
         CoeficienteC = teclado.nextInt();

        Delta = CoeficienteB * CoeficienteB - 4 * CoeficienteA * CoeficienteC;

        Raiz1 = (-CoeficienteB + Math.sqrt(Delta)) / (2 * CoeficienteA);     
        Raiz2 = (-CoeficienteB - Math.sqrt(Delta)) / (2 * CoeficienteA);
        

     System.out.printf("As raízes da equação são: %.2f e %.2f\n ", Raiz1, Raiz2);
     teclado.close();
    }
}