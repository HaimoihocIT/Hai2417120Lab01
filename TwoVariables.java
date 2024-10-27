// Solve the equation a11*x1+a12*x2=b1
//                    a21*x2+a22*2x=b2
import javax.swing.JOptionPane;
public class TwoVariables {
    public static void main(String[] args) {
        String strA11 = JOptionPane.showInputDialog("Enter a11");
        String strA12 = JOptionPane.showInputDialog("Enter a12");
        String strB1 = JOptionPane.showInputDialog("Enter b1");
        String strA21 = JOptionPane.showInputDialog("Enter a21");
        String strA22 = JOptionPane.showInputDialog("Enter a22");
        String strB2 = JOptionPane.showInputDialog("Enter b2");

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);

        double D = a11*a22 - a12*a21;
        double D1 = b1*a22 - b2*a12;
        double D2 = b2*a11 - b1*a21;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinity solutions!");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution!");
            }
        } else {
            double x1 = D1/D;
            double x2 = D2/D;
            JOptionPane.showMessageDialog(null,"Solutions of equation are " + x1 + "and " +x2);
        }
        System.exit(0);


    }
}
