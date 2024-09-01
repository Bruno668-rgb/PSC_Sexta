import java.util.Scanner;

public class Gorjeta{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int Num, Antecessor, Sucessor, Dobro ;

       
            System.out.println("Informe um número inteiro:  ");
           Num = teclado.nextInt();

                Antecessor = Num - 1;
        
        System.out.println("O antecessor deste número é: " + Antecessor);

                Sucessor = Num + 1; 
            
        System.out.println("O sucessor deste número é: " + Sucessor);

                Dobro = Num * 2;
                
        System.out.println("O dobro deste número é: " + Dobro);

 teclado.close(); 
    }
}
