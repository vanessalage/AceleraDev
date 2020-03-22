/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulal01;

public class Aulal01 {

    public static void main(String[] args) {
         System.out.println("Hello Word");
         
         int x = 30;
         int y = 10;
           
         System.out.println(x+y);
         
         byte a;
         short b;
         int c;
         long d;
         
         float e;
         double f;
         
         boolean g;
         char h;
         
         double base, altura, areaRetangulo;
         base = 10.34;
         altura = 20;
         areaRetangulo = base * altura;
         
         System.out.println("A área do retângulo de base = " + base);
         System.out.println("e altura " + altura);
         System.out.println("é " + areaRetangulo);
         
         
        double vlPrincipalCapital = 5.42;
        double vlTaxa = 0.6;
        double nrPeriodos = 3;
        
        double vlJuros = vlPrincipalCapital*vlTaxa*nrPeriodos;
        double vlEmprestimo = 100.00;
        
        double vlParcela = (vlEmprestimo+vlJuros)/3;
       
        System.out.println("Juros " + vlJuros);
        System.out.println("Valor de parcela " + vlParcela);
        
        double vlaltura = 1.62;
        double vlpeso = 62.3;
        double vlimc = vlpeso/(vlaltura*vlaltura);
        System.out.println("IMC = " + vlimc);
        
        int velocidade = 50;
        double vltempo = 0.5;
        double velocidademedia = velocidade / vltempo;
        System.out.println("velocidade atingida = " + velocidademedia);
        
        double salario = 1900.00;
        System.out.println("Salário = " + salario);
        
        if (salario <= 1700) {
            double ttSalario = salario-(salario*0.08);
            System.out.println("Salário até 1700 recebe desconto de 8% = " + ttSalario);   
        }
        else if (salario <= 3000) { 
            double ttSalario = salario-(salario*0.09);
            System.out.println("Salário até 3000 recebe desconto de 9% = " + ttSalario);
        }
        else{
            double ttSalario = salario-(salario*0.11);
            System.out.println("Salário acima de 3000 recebe desconto de 11% = " + ttSalario);   
        }
                
    }
    
}
