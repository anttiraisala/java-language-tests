/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalanguagetests;

/**
 *
 * @author anttir
 */
public class CompoundAssignmentOperator {

    public CompoundAssignmentOperator() {

        ////
        ////
        int a = 0;
        int b = a++;
        // b=0 a=1
        System.out.println("b=" + b + " a=" + a);
        
        ////
        ////
        int c=0;
        c=c++;
        // c=0
        System.out.println("c=" + c);
        
        ////
        ////
        int d=0, e=0;
        d=e++ + e++ + e++ + e++;
        // d=6 e=4
        System.out.println("d=" + d + " e=" + e);
        
        d=0; e=0;
        d=++e + ++e + ++e + ++e;
        // d=10 e=4
        System.out.println("d=" + d + " e=" + e);
        
        ////
        ////
        int f=1, g=2;
        f+=g++ + g++;
        // f=6 g=4
        System.out.println("f=" + f + " g=" + g);
        
        f=1; g=2;
        f+=++g + ++g;
        // f=8 g=4
        System.out.println("f=" + f + " g=" + g);
        
        
    }

}
