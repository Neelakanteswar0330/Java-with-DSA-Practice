import javax.swing.JOptionPane;

public class DialougeBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "Hello "+ name +  "!");
        
        String age = JOptionPane.showInputDialog("Hello " +  name + "!, How old are you? ");
        JOptionPane.showMessageDialog(null, name +" You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height: "));
        JOptionPane.showMessageDialog(null, name +" You Height is " + height + " feet tall");
    }
} 