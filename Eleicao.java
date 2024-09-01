import java.util.Scanner;

public class Eleicao{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int TotalEleitores, NumVotos1, NumVotos2, NumVotosNulos ; 
        double PercentualVotos1, PercentualVotos2, PercentualVotosNulos ;

            System.out.println("Informe o total de eleitores: ");
            TotalEleitores = teclado.nextInt();
            System.out.println("Informe o número de votos do primeiro canditado: ");
            NumVotos1 = teclado.nextInt();
            System.out.println("Informe o número de votos do segundo canditado: ");
            NumVotos2 = teclado.nextInt();
            System.out.println ("Informe ");
            
            NumVotosNulos = TotalEleitores - (NumVotos1 + NumVotos2);
            PercentualVotos1 = ((double)NumVotos1 / TotalEleitores) * 100;
            PercentualVotos2 = ((double)NumVotos2 / TotalEleitores) * 100;
            PercentualVotosNulos = ((double)NumVotosNulos / TotalEleitores) * 100;

            System.out.printf("O percentual de votos do candidato 1 é: %.2f%%\n " , PercentualVotos1);
            System.out.printf("O percentual de votos do candidato 2 é:  %.2f%%\n ",  PercentualVotos2);
            System.out.printf("O percentual de votos nulos é:  %.2f%%\n ", PercentualVotosNulos);
        

 teclado.close(); 
    }
}
