import java.util.Scanner;

public class Cinema {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a linha do seu assento: ");
        int linha = sc.nextInt();

        System.out.println("Digite a coluna do seu assento: ");
        int coluna = sc.nextInt();

       
    if(seats[linha][coluna] == 0)
        System.out.println("Free");
    else
        System.out.println("Sold");
    
   }
  }  
 
   