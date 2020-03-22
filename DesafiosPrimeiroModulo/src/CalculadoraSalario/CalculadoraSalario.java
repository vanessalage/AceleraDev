package CalculadoraSalario;

/**
 *
 * @author Vanessa Lage
 */
public class CalculadoraSalario {

    public void CalculadoraSalarioLiquido(double pvlSalarioBruto) {
        
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
