import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class ButtonFrame extends JFrame{

    private JButton TButton;
    private JButton IButton;

    private JButton IButton2;

    public ButtonFrame(){

        super("Testing Buttons");
        setLayout(new FlowLayout());

        Icon bug2 = new ImageIcon(getClass().getResource("bug2.png"));
        IButton2 = new JButton("butao c image", bug2);
        IButton2.setRolloverIcon(bug2);
        add(IButton2);




        TButton = new JButton("Botão com texto 1");
        add(TButton);

        IButton = new JButton("Botão com texto 2");
        add(IButton);

        ButtonHandler handler = new ButtonHandler();
        IButton.addActionListener(handler);
        TButton.addActionListener(handler);
        IButton2.addActionListener(handler);




    }

    private class ButtonHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

                JOptionPane.showMessageDialog(ButtonFrame.this, String.format ( "Você pressionou: %s", event.getActionCommand()));

        }

    }


}