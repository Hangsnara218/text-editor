import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("<html>About this program</html>");
    JTextArea textArea = new JTextArea("This is a simple text editor for simple text documents.");
    
    NewWindow(){

        label.setBounds(0,0,200, 50);
        label.setFont(new Font(null,Font.PLAIN, 15));
        textArea.setBounds(0, 10, 250, 250);
        textArea.setFont(new Font(null, Font.PLAIN, 10));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setTitle("About");
        frame.setLayout(null);
        frame.setVisible(true);



    }
}
