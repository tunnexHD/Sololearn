public class Receita1 {
    public static void main(String[] args) {
        double[] receita = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        
        double soma = 0;
        double media = 0;

        for(int i = 0 ; i < receita.length ; i++){
            soma += receita[i];
        }
        
        media = soma/(receita.length);
        
        System.out.println("Receita anual: " + soma);
        System.out.println("Média mensal: " + soma/(receita.length));
        System.out.println("Média mensal: " + media);
        
       
    }
}