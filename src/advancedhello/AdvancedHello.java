/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhello;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class AdvancedHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        age = 21;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Сколько вам лет:");
        age = in.nextInt();
        
        System.out.println("Ваш возраст: "+age);
        if(age <21) 
        {
            System.out.println("Наша программа расчитана на взрослую аудиторию. Подрасти немного.");
        }
        
        if (age>=21) {
            System.out.println("Добро пожаловать в нашу клевую программу с азартными играми.");
        }
       
        
    }
    
}
