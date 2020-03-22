package aula2.atividade;

import java.util.Scanner;

/**
 *
 * @author Vanessa Lage
 */
public class CalcularSalario {
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente();
        
        Scanner pScanner = new Scanner(System.in);
        
        //usando Herança para os métodos set;
        System.out.println("Informe o nome do funcionário: ");
        gerente.setNome(pScanner.nextLine());
        
        System.out.println("Informe o salário do funcionário: ");
        gerente.setSalarioBruto(pScanner.nextDouble());
        
        //usando Herança para os métodos get;
        System.out.println("Funcionario: "+gerente.getNome());
        System.out.println("Salário bruto: "+gerente.getSalarioBruto());
        
        //Usando POLIMORFISMO no método CalcularDescontoIR e CalcularDescontoINSS
        gerente.setSalarioLiquido(gerente.CalcularDescontoIR(gerente.CalcularDescontoINSS(gerente.getSalarioBruto())));
        
        System.out.println("Salário líquido: "+gerente.getSalarioLiquido());
    }
}
