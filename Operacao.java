package ifs.br.programacao;

import java.util.Scanner;

public class Operacao {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha a operaçao");
        System.out.println("1. Soma");
        System.out.println("2. Divisão");
        System.out.println("3. Multiplicação");
        System.out.println("4. Subtração");
        int opçao = ler.nextInt();

        switch(opçao){
          case 1:
          System.out.println("Informe o primeiro numero");
          double x = ler.nextDouble();
          System.out.println("Informe o segundo numero");
          double y = ler.nextDouble();
          System.out.println( "O resultado foi " +x + y);
          break;
          case 2:
          System.out.println("Informe o primeiro numero");
          double a = ler.nextDouble();
          System.out.println("Informe o segundo numero");
          double s = ler.nextDouble();
          System.out.println("O resultado foi " +   a / s);
          break;
          case 3:
          System.out.println("Informe o primeiro numero");
          double w = ler.nextDouble();
          System.out.println("Informe o segundo numero");
          double m = ler.nextDouble();
          System.out.println("O resultado foi " + w * m);
          break;
          case 4:
          System.out.println("Informe o primeiro numero");
          double t = ler.nextDouble();
          System.out.println("Informe o segundo numero");
          double r = ler.nextDouble();
          System.out.println(t - r);
          break;
        }
    }
}
