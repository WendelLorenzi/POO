public class DadExt{

	public static void main(String arg[]){

	System.out.println("\n X: "+ arg[0]);
	System.out.println("\n Y: "+ arg[1]);

	int x= Integer.parseInt(arg[0]);
	int y= Integer.parseInt(arg[1]);

	System.out.println("\n Soma X + Y: "+ (x+y));
	System.out.println("\n Subtração X - Y: "+ (x-y));
	System.out.println("\n Multiplicação X * Y: "+ (x*y));
	System.out.println("\n Divisão X / Y: "+ (x/y));
	}	
}