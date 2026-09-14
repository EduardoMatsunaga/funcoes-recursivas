import javax.swing.JOptionPane;
public class ex02_recursividade {
    public static void main (String args []){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        System.out.println(recursiva(num));
    }
    static int recursiva (int n) {
        int x;
        if (n>=1) {
            x = n + recursiva (n-1);
            return x;
        }
        else {
            return n;
        }
    }
}