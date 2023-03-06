public class Receita {
    public static void main(String[] args) {
        double[] receita = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        
        double soma = 0;
        double media = 0;

        for(double x : receita){
        soma += x;
        media = soma/(receita.length);

    }
        
        System.out.println("Receita anual: " + soma);
        System.out.println("Média mensal: " + soma/(receita.length));
        System.out.println("Média mensal: " + media);
        
       
    }
}