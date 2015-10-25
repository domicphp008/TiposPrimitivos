/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author domiciosilva
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Domicio";
        //float nota = 8.5f;
        float nota = 1.5f;
       // System.out.println("A nota é " + nota);
       //System.out.printf("A sua nota é %.2f \n", nota);
       //  System.out.printf("A sua nota é %.3f \n", nota);
            //System.out.printf("A sua nota de %s é %.4f \n",nome, nota);
             // System.out.printf("A sua nota é %.5f \n", nota);
              System.out.format("A sua nota de %s é %.4f \n",nome, nota);
              
    }
    
}
