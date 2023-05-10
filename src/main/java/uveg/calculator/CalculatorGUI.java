
package uveg.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author luis.loaeza
 */
public class CalculatorGUI extends JFrame {
    
    private ActionButtons actionButtons;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;
    private JButton periodButton;
    private JButton clearButton;
    private JLabel label;
    private JPanel panel;
    private JTextField screen;
    
    
    
    public CalculatorGUI() {
        
        setTitle("Calculator GUI");
        actionButtons = new ActionButtons();
        add(calculatorPanel());
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        
        
    }
        private JPanel calculatorPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        label = new JLabel("Not pressed nothing yet");
        panel.add(label);
        
        JTextField screen = new JTextField(20);
        panel.add(screen);
        
        button0 = new JButton("0");
        button0.addActionListener(actionButtons);
        panel.add(button0);
        
        button1 = new JButton("1");
        button1.addActionListener(actionButtons);
        panel.add(button1);
        
//        JButton button2 = new JButton("2");
//        panel.add(button2);
//        button2.addActionListener(actionButtons);
//        
//        JButton button3 = new JButton("3");
//        button3.setBounds(50, 50, 100, 50);
//        button3.addActionListener(actionButtons);
//        
//        JButton button4 = new JButton("4");
//        button4.setBounds(50, 50, 100, 50);
//        button4.addActionListener(actionButtons);
//        
//        JButton button5 = new JButton("5");
//        button5.setBounds(50, 50, 100, 50);
//        button5.addActionListener(actionButtons);
//        
//        JButton button6 = new JButton("6");
//        button6.setBounds(50, 50, 100, 50);
//        button6.addActionListener(actionButtons);
//        
//        JButton button7 = new JButton("7");
//        button7.setBounds(50, 50, 100, 50);
//        button7.addActionListener(actionButtons);
//        
//        JButton button8 = new JButton("8");
//        button8.setBounds(50, 50, 100, 50);
//        button8.addActionListener(actionButtons);
//        
//        JButton button9 = new JButton("9");
//        button9.setBounds(50, 50, 100, 50);
//        button9.addActionListener(actionButtons);
//        
//        JButton addButton = new JButton("+");
//        addButton.setBounds(50, 50, 100, 50);
//        addButton.addActionListener(actionButtons);
//        
//        JButton subtractButton = new JButton("-");
//        subtractButton.setBounds(50, 50, 100, 50);
//        subtractButton.addActionListener(actionButtons);
//        
//        JButton multiplyButton = new JButton("x");
//        multiplyButton.setBounds(50, 50, 100, 50);
//        multiplyButton.addActionListener(actionButtons);
//        
//        JButton divideButton = new JButton("/");
//        divideButton.setBounds(50, 50, 100, 50);
//        divideButton.addActionListener(actionButtons);
//        
//        JButton equalsButton = new JButton("=");
//        equalsButton.setBounds(50, 50, 100, 50);
//        equalsButton.addActionListener(actionButtons);
//        
//        JButton periodButton = new JButton(".");
//        periodButton.setBounds(50, 50, 100, 50);
//        periodButton.addActionListener(actionButtons);
//        
//        JButton clearButton = new JButton("C");
//        clearButton.setBounds(50, 50, 100, 50);
//        clearButton.addActionListener(actionButtons);

        return panel;
    }


    public class ActionButtons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
              if (e.getSource() == button0) {
                  System.out.println("Clicked button 0");
                  label.setText("Button 0");
            } if (e.getSource() == button1) {
                System.out.println("Clicked button 1");
                label.setText("Button ");
            }        
        }

    }
}
