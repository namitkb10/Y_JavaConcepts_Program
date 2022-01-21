	package java_Basic_Program;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c=0;
		System.out.print(a + " " + b);
		
		// Upto 100
		while(c<1000)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" " + c);
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		// Only first 10 Fibonacci series
		
		int m=1, n=10;
		int p=0, q=1, r=0;
		System.out.print(p + " " + q);
		while(m<n)
		{
			r=p+q;
			p=q;
			q=r;
			System.out.print(" " + r);
			m++;
		}
	}
}
