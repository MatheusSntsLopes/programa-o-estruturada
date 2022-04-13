import java.util.Scanner;
public class MultaRadar {
    public static void main(String[] args) {
        double velocidade_carro;
        double velocidade_maxima; 
        double multa;
        System.out.println("digite a velocidade do carro em km/h: ");
        Scanner leia= new Scanner(System.in);
        velocidade_carro=leia.nextInt();  
        System.out.println("digite a velocidade maxima para a rua em km/h: ");
        velocidade_maxima=leia.nextInt();
        multa=velocidade_carro-velocidade_maxima;
        if (multa <= 10) {
            System.out.println("multa de 50,00 reais pois estava acima da velocidade permitida");
        } else if ((multa >= 11 && multa <= 30) || (multa >= 31)) {
            System.out.println("multa de 100,00 reais pois estava acima da velocidade permitida");
        } else {
            System.out.println("multa de 300,00 reais pois estava acima da velocidade permitida");
        }

    }
    
}