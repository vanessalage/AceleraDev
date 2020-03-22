package fibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanessa Lage
 */
public class Fibonacci {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner pScanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        Integer nrExiste = pScanner.nextInt();
        
        if (isFibonacci(nrExiste) == true) {
            System.out.println("Número "+nrExiste+" faz parte da série de FIBONACCI");
        }
        else {
            System.out.println("Número "+nrExiste+" NÃO faz parte da série de FIBONACCI");
        }
        //fibonacci();
    }
    
    public static List<Integer> fibonacci() {
        //Declaração da variável de cálculo do número de sequencia
        Integer nrSerieFibonacci;
        
        //Declaração da lista que conterá a sequencia Fibonacci
        List<Integer> lsFibonacci = new ArrayList();
        
        //Preenche os primeiros valores da lista
        lsFibonacci.add(0,0);
        lsFibonacci.add(1,1);
        
        //Comando de repetição para executar até valor ser maior que 350
        //README: "lista `java.util.List` com os primeiro números `Integer` da série de *Fibonacci* até *passar* de *350*".
        for (int i = 0; i < 351 ; i++) {
            if (i>1) {
                //Realiza o cálculo da sequencia: 0, 1, 1, 2, 3, 5...
                nrSerieFibonacci = (lsFibonacci.get(i-1) + lsFibonacci.get(i-2));
                //Insere o valor na lista
                lsFibonacci.add(i,nrSerieFibonacci);
            }
        }
        
        return lsFibonacci;
    }
    
    public static Boolean isFibonacci(Integer a) {
        List<Integer> srFibonacci = fibonacci();

        return srFibonacci.contains(a);
    }
    
    /*public static Boolean IsFibonacci(long nrExiste){

        ArrayList flsFibonacci = GetSequenciaFibonacci();
        
        boolean stExiste = false;
        
        for (int j = 0; j < flsFibonacci.size(); j++) {
            
            long nrSerieFibonnaci = (long) flsFibonacci.get(j);
            
            //System.out.println(j+" - "+nrSerieFibonnaci);
            
            if (nrSerieFibonnaci > nrExiste) {
                //System.out.println("Próximo número da série é maior que o de verificação");
                stExiste = false;
                break;
            }
            
            if (nrSerieFibonnaci == nrExiste) {
                System.out.println("Existe número: "+nrExiste);
                stExiste = true;
                break;
            }
        }
        return stExiste;
    }*/
    
}
