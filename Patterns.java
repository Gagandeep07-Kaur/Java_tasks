import java.util.Scanner;

public class Patterns {

public static void main(String[] args )  {
	Scanner in = new Scanner(System.in);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
int a,b;
for(a=1; a<=5; a++) 
{
for(b=1; b<=a; b++)
{
//System.out.print("#");
//System.out.print(a);
System.out.print(b);
}
System.out.println();
}  

//System.out.println("\n");
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
for(int i=1; i<=5; i++) 
{
	for(int j=5; j>=i; j--)
	{
		System.out.print("#");
		
	}
	System.out.println();
}
System.out.println("\n");

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

System.out.print("Enter your name : ");
String name = in.next();
//int n=10;
for(int k=1; k<=5; k++){
	for(int l=1; l<=k; l++){
		System.out.print(name);
	}
	System.out.println("\n");
}
//System.out.println("Your name is: " + name);  

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

System.out.print("Enter the value of integer : " );
int num = in.nextInt();

for(int p=1; p<=num; p++) 
{
for(int q=num; q>p; q--)
{
System.out.printf(" ");
}	
for(int r=1; r<=p; r++)
{
System.out.printf("*");
}
System.out.println();
}

}
}