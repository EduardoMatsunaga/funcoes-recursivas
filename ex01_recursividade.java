public class ex01_recursividade {
    public static void main (String args []) {
        int num;
        num =1;
        System.out.println(rsoma(num));
    }
    static int rsoma(int n) {
        int x;
        if (n<100) {
            x = n + rsoma(n+1);
            return x;
        }
        else {
            return n;
        }
    }
}
