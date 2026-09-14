import javax.swing.JOptionPane;
public class ex04_recursividade {
    public static void main (String args []) {
        double num, i;
        i = 1.0;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        System.out.println(rdeno(num, i));
    }
    static double rdeno (double n, double i) {
        double x;
        if (i<=n) {
            x = (n-i + 1) / i + rdeno(n, i + 1);  
            return x;
        }
        else {
            return 0;
        }
    }
}