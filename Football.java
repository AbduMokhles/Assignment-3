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
public class Football extends Ball 
{
    public Football (String B2)
    {
        BrandName=B2;
    }

    @Override
    public String getBrandName() {
        return BrandName;
    }
    
    
    @Override
    public void bounce(){};
    @Override
    public void toss(){};
    
}
