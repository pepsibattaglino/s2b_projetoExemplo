package pucrs.s2b.exemplo01;
//import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
	
////========================================================================================		
//		String nome = null;
//		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
//		JOptionPane.showMessageDialog(null, "Bem vindo " + nome + "!");
//		
//		int a;
//		a = Integer.parseInt(JOptionPane.showInputDialog(nome + " digite um n�mero."));
//		int b;
//		b = Integer.parseInt(JOptionPane.showInputDialog("Agora digite outro n�meor"));
//		
//		JOptionPane.showMessageDialog(null, "O resultado � " + somar(a,b));
//		
//	}
//	
//	public static int somar(int a, int b){
//		int r = a + b;
//		return r;
//	}
////========================================================================================	
	
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
