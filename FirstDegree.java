// Solve the equation: ax+b=0
import javax.swing.JOptionPane;
public class FirstDegree{
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions!");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution!");
            }
        } else {
            double x = -b/a;
            JOptionPane.showMessageDialog(null,"The solution of equation is: " + x);
    }
}
}