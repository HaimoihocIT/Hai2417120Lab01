import javax.swing.JOptionPane;
public class Basicmath {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null,"Enter the first number:","Input 1st Num",JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null,"Enter the second number:","Input 2nd Num",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        String notification;
        if(num2 != 0){
            double quotient = num1/num2;
            notification = "quotient: " + quotient;
        }else {
                notification = "can't divide by 0!";
            }
            String result = "Sum: " + sum + "\n" + "Difference: " + difference + "\n" + "Product: " + product + "\n" + notification;
            JOptionPane.showMessageDialog(null, result, "Result",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
    }
}
