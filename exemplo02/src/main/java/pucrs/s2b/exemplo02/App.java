package pucrs.s2b.exemplo02;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a = 20;
		int b = 30;
		
		int r = somar(a, b);
		
		if (r == 50) {
			System.out.println("Correto.");
		}else {
			System.out.println("Falha!!!");
		}
	}
	
	public static int somar(int a, int b) {
		int soma = a + b;
		return soma;
	
    }
}
