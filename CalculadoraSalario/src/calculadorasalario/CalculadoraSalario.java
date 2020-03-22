package calculadorasalario;

import java.util.Scanner;
/**
 *
 * @author Vanessa Lage
 */
public class CalculadoraSalario {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner pScanner = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        double pvlSalarioBruto = pScanner.nextDouble();
        
        System.out.println("Salário líquido: " + CalculadoraSalarioLiquido(pvlSalarioBruto));
    }
    
    public static int CalculadoraSalarioLiquido(double salarioBase) {
        
            if (salarioBase <= 0) {
                throw new IllegalArgumentException("ERRO! Informe o valor do salário.");
            }
            double ttSalario;
            if (salarioBase <= 1039){
                return (int) Math.round(0.0);
            }
            else if (salarioBase <= 1039){
                return (int) Math.round(0.0);
            }
            else if (salarioBase <= 1500) {
                ttSalario = salarioBase-(salarioBase*0.08);
                System.out.println("INSS - Salário até 1500 recebe desconto de 8% = " + (int) ttSalario);
            }
            else if (salarioBase <= 4000) { 
                ttSalario = salarioBase-(salarioBase*0.09);
                System.out.println("INSS - Salário até 4000 recebe desconto de 9% = " + (int) ttSalario);
            }
            else{
                ttSalario = salarioBase-(salarioBase*0.11);
                System.out.println("INSS - Salário acima de 3000 recebe desconto de 11% = " + (int) ttSalario);
            }
            return Math.round(calcularInss(ttSalario));
    }
    
    public static int calcularInss(double salarioBase) {       
            if (salarioBase > 6000) {
                double ttSalarioBase = salarioBase-(salarioBase*0.15);
                System.out.println("IRRF - Salário base maior que 6000 recebe desconto de 15% = " + (double) ttSalarioBase);
                 return (int) ttSalarioBase;
            }
            else if (salarioBase >= 3000.01 && salarioBase <= 6000) { 
                double ttSalarioBase = salarioBase-(salarioBase*0.075);
                System.out.println("IRRF - Salário base de R$ 3.000,01 até R$ 6.000,00 recebe desconto de 7,5% = " + (double) ttSalarioBase);
                return (int) ttSalarioBase;
            }
            else{
                System.out.println("IRRF - Salário base menor que 3000 é isento = " + (double) salarioBase);
                return (int) salarioBase;
            } 
    }
    
}
