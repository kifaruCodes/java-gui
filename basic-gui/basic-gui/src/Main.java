import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // create an input dialog
        String name = JOptionPane.showInputDialog("Enter your name");
        // display the entry from the above dialog in another dialog
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // The GUI only takes strings as inputs so we have to use parseInt to convert to integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "Your age is "+age);

        // Same applies to doubles
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "Your height is "+height);
    }
}
