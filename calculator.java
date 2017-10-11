package calculator1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a,b;
		char c;
		float r;
		float r2;
	System.out.println("enter the first number: ");
        a = s.nextFloat();
     System.out.println("enter the second number: ");
        b= s.nextFloat();
        
      
        System.out.println("enter your choice:\n a for addition\n s for subtraction \n m for multipication \n d for division \n q for square\n c for cube\n f for factorial");
        
        c = s.next().charAt(0);
        
        if(c=='a')
        {
        	add a1 = new add();
        	r=a1.add(a,b);
        	System.out.println(+r);
        }
        
        else if(c=='s')
        {
        	sub s1 = new sub();
        	r=s1.sub(a,b);
        	System.out.println(+r);
	    }
        else if(c=='m')
        {
        	mul m1 = new mul();
        	r=m1.mul(a,b);
        	System.out.println(+r);
        }
        else if(c=='d')
        {
        	div d1 = new div();
        	r=d1.div(a,b);
        	System.out.println(+r);
        }
      
        else if(c=='q')
        {
        	square s1 = new square();
        	square s2 = new square();
        	r=s1.square(a);
        	r2=s2.square(b);
        	System.out.println(+r);
        	System.out.println(+r2);
        }
        else if(c=='c')
        {
        	cube c1 = new cube();
        	cube c2 = new cube();
        	r=c1.cube(a);
        	r2=c2.cube(b);
        	System.out.println(+r);
        	System.out.println(+r2);
        }
        
        else if(c=='f')
        {
        	fact f1 = new fact();
        	fact f2 = new fact();
        	r=f1.facto(a);
        	r2=f2.facto(b);
        	System.out.println(+r);
        	System.out.println(+r2);
        }
}
}
