package ifs.br.programacao;

import java.util.Scanner;

public class Menu {
    public static void main(String[]args){
        Scanner ler= new Scanner(System.in);
        int opcao;
      do{
        
        System.out.println("Escolha abaixo uma das opcoes de menu:");  
        System.out.println("1. Professor");  
        System.out.println("2. Aluno");  
        System.out.println("3. Disciplina");  
        System.out.println("4. Sair");    
        opcao = ler.nextInt();

        switch(opcao){
            case 1:
            System.out.println( "Ok, voce escolheu a opção 1 do menu, tente novamente!");
            break;
            case 2:
            System.out.println( "Ok, voce escolheu a opção 2 do menu, tente novamente!");
            break;
            case 3:
            System.out.println( "Ok, voce escolheu a opção 3 do menu, tente novamente!");
            default:
            System.out.println( "Ok, voce escolheu sair");
            break;
        }
      } while(opcao != 4);
    }
}
