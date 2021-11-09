/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.pkg3;

/**
 *
 * @author Abdulrahman
 */
public class Ass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Ball B1 = new Baseball("Nike");
        System.out.println(B1.getBrandName());
        
        Ball F1 = new Football("Adidas");
        System.out.println(F1.getBrandName());
        

    }
    
}
