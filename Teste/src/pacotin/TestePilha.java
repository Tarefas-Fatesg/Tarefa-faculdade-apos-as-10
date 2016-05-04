/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotin;

import javax.swing.JOptionPane;

/**
 *
 * @author kai
 */
public class TestePilha {
     public static int k = 5;
    public static int[] p1 = new int[k];
    public static int[] p2 = new int[k];
    public static int topo = -1;
    public static int topoB = -1;
  
    
    public static void InsertA(int valor){ 
        if(topo < k){
            topo++;
            p1[topo] = valor;
        }
    }
   
    public static void InsertB(int vlr){
        if(topoB < k){
            topoB++;
            p2[topoB] = vlr;
        }
    }
    
    public static String exibePilha(){
        String str="";
       
        for (int i = topo; i > -1; i--) {
            str += p1[i];
        }
        return str;
    }
        
     public static String ordStr(String str){
        int aux;
        String strR="";
        int[] v = new int[5];
       

        for (int i = topo; i > -1; i--) {
            v[i] += p1[i];
        }
       
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[i]>v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                } 
            }
        }

        for (int i = 0; i < v.length; i++) {
            int a = v[i];
            InsertB(a);
        }
        for (int i = 0; i < v.length; i++) {
            strR += p2[i];
        }
        return strR;
    }

//--------------------------------------------------------------------------------------------------//

      public static void main(String[] args){
        //Variaveis locais
        String str;
        String strOrd;
       
        //pilha A
        InsertA(3);
        InsertA(4);
        InsertA(1);
        InsertA(5);
        InsertA(2);
       
        //uso das funções
        str = exibePilha(); //retorna a pilha A    
        strOrd = ordStr(str); //retorna a pilha B

        //saida
          System.out.println( "Pilha A: " + str);
          System.out.println("Pilha B: " + strOrd);
       
    } //fim do main
} //fim da classe
