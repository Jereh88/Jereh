/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2jereh;

/**
 *
 * @author User
 */
public class Act2jereh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] jereh = {10, 666, 2, 6, 69};
        
        System.out.println("Array Elements: " + jereh[0] + ", " + jereh[1] +
                ", " + jereh[2] + ", " + jereh[3] + ", " + jereh[4]);
        
        int jereh_sum = jereh[0] + jereh[1] + jereh[2] + jereh[3] + jereh[4];
        
        System.out.println("Sum of all arrays: "+jereh_sum);
        
        int max = Math.max(jereh[4], Math.max(jereh[2], Math.max(jereh[1], Math.max(jereh[3], jereh[0]))));
        
        System.out.println("Maximum Value: " + max);


    }
    
}
