/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Markus Badzura
 */
public class test1 
{
    public static void main(String[] args) {
        try
        {
            int a = 7;
            a = a/0;
        }
        catch(Exception e)
        {
            String test = e.toString();
            System.out.print(test);
        }
    }
}
