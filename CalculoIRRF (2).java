package ifs.br.programacao;

import java.util.Scanner;

public class CalculoIRRF {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        float sal = ler.nextFloat();
        if(sal<=3992.00){
            System.out.print("Isento de IRRF");
        }else
            if((sal>=3992.01) && (sal<=5988.00)){
            Float aliq_01 = sal*0.15f;
            System.out.print("A aliquota correspondente ao salario é R$" + aliq_01);
        }else
            if((sal>=5988.01) && (sal<=7984.00)){
            Float aliq_02 = sal*0.20f;
            System.out.print("A aliquota correspondente ao salario é R$" + aliq_02);
        }else
            if((sal>=7984.01) && (sal<=9980.00)){
            Float aliq_03 = sal*0.25f;
            System.out.print("A aliquota correspondente ao salario é R$" + aliq_03);
        }else
            if((sal>=9980.01) && (sal<=33932.00)){
            Float aliq_04 = sal*0.275f;
            System.out.print("A aliquota correspondente ao salario é R$" + aliq_04);
        }else
            if(sal>=33932.01){
            float aliq_05 = sal*0.37f;
            System.out.print("A aliquota correspondente ao salario é R$" + aliq_05);
        }    
    }
    
}