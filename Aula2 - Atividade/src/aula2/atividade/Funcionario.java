package aula2.atividade;

/**
 *
 * @author Vanessa Lage
 */
public class Funcionario {
    private String Nome;
    private double SalarioBruto;
    private double SalarioLiquido;
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String pNome){
        Nome = pNome;
    }
    
    public double getSalarioBruto(){
        return SalarioBruto;
    }
    
    public void setSalarioBruto(double pSalarioBruto){
        SalarioBruto = pSalarioBruto;
    }
    
    public double getSalarioLiquido(){
        return SalarioLiquido;
    }
    
    public void setSalarioLiquido(double pSalarioLiquido){
        SalarioLiquido = pSalarioLiquido;
    }    
    
    public double CalcularDescontoINSS(double pSalario){
        double ttSalario, desconto;
        // desconto INSS
        if (pSalario <= 1045) {
            desconto = (pSalario*0.075);  
        }
        else if (pSalario >= 1045.01 && pSalario <= 2089.60){ 
            desconto = (pSalario*0.09);
        }
        else if (pSalario >= 2089.61 && pSalario <= 3134.40){ 
            desconto = (pSalario*0.12);
        }        
        else{
            desconto = (pSalario*0.14);
        }
        ttSalario = pSalario-desconto;
        System.out.println("Salário com desconto INSS: "+desconto+" = " + ttSalario);
        /*
        //Desconto de IRRF
        if (ttSalario > 1903.98) { 
            double ttSalarioIr = ttSalario-(ttSalario*0.11);
            System.out.println("desconto IR: " +(ttSalario*0.11) + " = " + ttSalarioIr);
            ttSalario = ttSalarioIr;
        }
        */
        return ttSalario;  
    }    
    
        public double CalcularDescontoIR(double pSalarioBaseIr){
               
        //Desconto de IRRF
        if (pSalarioBaseIr > 1903.98) { 
            pSalarioBaseIr = pSalarioBaseIr-(pSalarioBaseIr*0.11);
            System.out.println("desconto IR: " +(pSalarioBaseIr*0.11) + " = " + pSalarioBaseIr);
        }
        
        return pSalarioBaseIr;  
    }     
}
