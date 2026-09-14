import javax.swing.JOptionPane;
public class ex05_recursividade {
	public static void main (String args []) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        System.out.println(soma (num));
	}
	static long soma (int n) {
		long x;
		if (n>= 1) {
			x = fatorial (n) + soma (n-1);
			return x;
		}
		else {
			return 0;
		}
	}
	static long fatorial (int n) {
		long fat;
		if (n>=1) {
			fat = n * fatorial (n-1);
			return fat;
		}
		else {
			return 1;
		}
	}
}
