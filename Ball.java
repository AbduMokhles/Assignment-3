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
public class Ball implements Tossable 
{
    String BrandName;
    
//    public Ball(String B)
//    {
//        BrandName =B;
//    }

    public String getBrandName() {
        return BrandName;
    }
    
    public  void bounce(){};

    @Override
    public void toss() {};
    
    
    
    
    
    
}
