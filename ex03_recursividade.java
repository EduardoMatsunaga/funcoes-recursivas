import javax.swing.JOptionPane;
public class ex03_recursividade {
    public static void main (String args []) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        System.out.println(recursiva (num));
    }
    static double recursiva (int n) {
        double x;
        if (n>1) {
            x = 1.0 / n + recursiva (n-1);
            return x;
        }
        else {
            return n;
        }
    }
}
