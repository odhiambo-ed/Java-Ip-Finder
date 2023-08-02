import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = new JFrame("Ip Finder App");
        jFrame.setBounds(100, 100, 800, 200);
        jFrame.setVisible(true);

        JLabel label = new JLabel("Enter URL");
        label.setBounds(10, 10, 50, 20);
        label.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 50, 20);
        textField.setVisible(true);

        jFrame.add(label);
        jFrame.add(textField);
    }
}
