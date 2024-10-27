// Solve the equation: a*x*x+b*x+c=0
import javax.swing.JOptionPane;
public class SecondDegree {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");
        String strC = JOptionPane.showInputDialog("Enter c:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double delta = b*b-4*a*c;

        if(a==0){
            double x = -b/c;
            JOptionPane.showMessageDialog(null,"The solution of the equation is x=" + x);
            return;
        }

        if(delta>0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            JOptionPane.showMessageDialog(null,"The equation has two mean roots x1=" + x1 + " and x2=" + x2);
        }else if(delta==0){
            double x0 = -b/(2*a);
            JOptionPane.showMessageDialog(null,"The equation has one unique solution x=" + x0);
        }else{
            JOptionPane.showMessageDialog(null,"The equation has no solutions");
        }
        System.exit(0);
    }
}
