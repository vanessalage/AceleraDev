package criptografiajuliocesar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanessa Lage
 */
public class CriptografiaJulioCesar {

    public static void main(String[] args) {
        //Recebe a mensagem de entrada do usuário
        Scanner pScanner = new Scanner(System.in);
        System.out.println("Informe a mensagem: ");
        String dsMsgEntrada = pScanner.nextLine();
        

        

        
        
        System.out.println("Informe uma das opções (0 para Criptografar ou 1 para Descriptografar):");
        int vlOpcao = pScanner.nextInt();
        
        while (vlOpcao != 0 && vlOpcao != 1) {
            System.out.println("Informe uma das opções (0 - Criptografar ou 1 - Descriptografar):");
            
            vlOpcao = pScanner.nextInt();
        }
        
        //Converte o conteúdo da mensagem de entrada para minúsculo
        dsMsgEntrada = dsMsgEntrada.toLowerCase();
        //gero o array com os caracteres do Alfabeto
        
	ArrayList lsAlfabeto = new ArrayList();
        int i = 0;
	for(char a='a';a<='z';a++) {
            lsAlfabeto.add(i,a);
            i = i+1;
	}
        if (vlOpcao == 0){
            System.out.println("Opção selecionada: 0 - Criptografar");
            System.out.println("Mensagem criptografada: " + Criptografar(dsMsgEntrada, lsAlfabeto,true));    
        }
        else {
            System.out.println("Opção selecionada: 1 - Descriptografar");
            System.out.println("Mensagem descriptografada: " + Descriptografar(dsMsgEntrada, lsAlfabeto,false));     
        }
    }
    
    public static String Criptografar(String pdsMsgEntrada, ArrayList plsAlfabeto,Boolean stCriptografar){
    
        ArrayList lsAlfabeto = new ArrayList();
        int i = 0;
	for(char a='a';a<='z';a++) {
            lsAlfabeto.add(i,a);
            i = i+1;
	}
        //Declaração da string que receberá a mensagem criptografada;
        String dsMsgCripto = new String();
        
        //Leitura dos caracteres da mensagem de entrada;
	for(int j=0; j<pdsMsgEntrada.length(); j++) {
            int vlPosicao;
            char dsLetra = pdsMsgEntrada.charAt(j);
                        
            //x y z (23,24,25) = a b c (0,1,2)                
            if (dsLetra == 'x' || dsLetra == 'y' || dsLetra == 'z') {
                vlPosicao = 3-(lsAlfabeto.size()- lsAlfabeto.indexOf(dsLetra));
            } 
            else{
                vlPosicao = (lsAlfabeto.indexOf(pdsMsgEntrada.charAt(j)))+3;
            }
           
            //Ignoro espaços e caracteres diferentes dos existentes na lista do alfabeto
            //se o caracter esta contido na lista e é uma posiçao válida vejo qual é o caracter do alfabeto
            if (lsAlfabeto.contains(dsLetra) && vlPosicao != -1){
                dsMsgCripto = dsMsgCripto + (lsAlfabeto.get(vlPosicao));
            }
            else{
                dsMsgCripto = dsMsgCripto + pdsMsgEntrada.charAt(j);
            }
        }
        return dsMsgCripto;
        
        
        
        /*//Declaração da string que receberá a mensagem criptografada;
        StringBuilder dsMsgCripto = new StringBuilder();
        
        //Leitura dos caracteres da mensagem de entrada;
	for(int j=0; j<pdsMsgEntrada.length(); j++) {
            int vlPosicao;
            char dsLetra = pdsMsgEntrada.charAt(j);
            
            if (stCriptografar == true) {
                //x y z (23,24,25) = a b c (0,1,2)                
                if (dsLetra == 'x' || dsLetra == 'y' || dsLetra == 'z') {
                    vlPosicao = 3-(plsAlfabeto.size()- plsAlfabeto.indexOf(dsLetra));
                } 
                else{
                    vlPosicao = (plsAlfabeto.indexOf(pdsMsgEntrada.charAt(j)))+3;
                }
            }
            else {
                //x y z (23,24,25) = a b c (0,1,2)                
                if (dsLetra == 'a' || dsLetra == 'b' || dsLetra == 'c') {
                    vlPosicao = (plsAlfabeto.size()-3) + plsAlfabeto.indexOf(dsLetra);
                } 
                else{
                    vlPosicao = plsAlfabeto.indexOf(pdsMsgEntrada.charAt(j))-3;
                }
            }
            //Ignoro espaços e caracteres diferentes dos existentes na lista do alfabeto
            //se o caracter esta contido na lista e é uma posiçao válida vejo qual é o caracter do alfabeto
            if (plsAlfabeto.contains(dsLetra) && vlPosicao != -1){
                dsMsgCripto.append(plsAlfabeto.get(vlPosicao));
            }
            else{
                dsMsgCripto.append(pdsMsgEntrada.charAt(j));
            }
        }
        return dsMsgCripto;*/
    }
    
    public static String Descriptografar(String pdsMsgEntrada, ArrayList plsAlfabeto,Boolean stCriptografar){
    
        ArrayList lsAlfabeto = new ArrayList();
        int i = 0;
	for(char a='a';a<='z';a++) {
            lsAlfabeto.add(i,a);
            i = i+1;
	}
        //Declaração da string que receberá a mensagem criptografada;
        String dsMsgCripto = new String();
        
        //Leitura dos caracteres da mensagem de entrada;
	for(int j=0; j<pdsMsgEntrada.length(); j++) {
            int vlPosicao;
            char dsLetra = pdsMsgEntrada.charAt(j);
                        
            //x y z (23,24,25) = a b c (0,1,2)                
            if (dsLetra == 'a' || dsLetra == 'b' || dsLetra == 'c') {
                vlPosicao = (plsAlfabeto.size()-3) + plsAlfabeto.indexOf(dsLetra);
            } 
            else{
                vlPosicao = plsAlfabeto.indexOf(pdsMsgEntrada.charAt(j))-3;
            }
           
            //Ignoro espaços e caracteres diferentes dos existentes na lista do alfabeto
            //se o caracter esta contido na lista e é uma posiçao válida vejo qual é o caracter do alfabeto
            if (lsAlfabeto.contains(dsLetra) && vlPosicao != -1){
                dsMsgCripto = dsMsgCripto + (lsAlfabeto.get(vlPosicao));
            }
            else{
                dsMsgCripto = dsMsgCripto + pdsMsgEntrada.charAt(j);
            }
        }
        return dsMsgCripto;
        
    }
}
