package aula2.atividade;

/**
 *
 * @author Vanessa Lage
 */
public class Gerente extends Funcionario {
    //@Override
    public double CalcularDescontoINSS(double pSalarioBaseInss){
        return super.CalcularDescontoINSS(pSalarioBaseInss);
    } 
    
    public double CalcularDescontoIR(double pSalarioBaseIr){
        return super.CalcularDescontoIR(pSalarioBaseIr);
    } 
}
