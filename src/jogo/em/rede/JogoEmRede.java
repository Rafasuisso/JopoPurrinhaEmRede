/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.em.rede;

/**
 *
 * @author FaelT
 */
public class JogoEmRede {

    public JogoEmRede() {
    }

    static int [] lista  = new int[7];
    
    
     static void sortearNumeros(){
        //Gera os numeros da lista
        for(int i =0; i <lista.length;i++ ){
            lista[i] = (int) (Math.random() * 10);
        }
       
     }
 
     public int pegarValor(int i){
         return lista[i];
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sortearNumeros();
    }
    
}
