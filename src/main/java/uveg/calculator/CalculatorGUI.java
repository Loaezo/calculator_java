
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
        
        button2 = new JButton("2");
        panel.add(button2);
        button2.addActionListener(actionButtons);
        
        button3 = new JButton("3");
        panel.add(button3);
        button3.addActionListener(actionButtons);
        
        button4 = new JButton("4");
        panel.add(button4);
        button4.addActionListener(actionButtons);
        
        button5 = new JButton("5");
        panel.add(button5);
        button5.addActionListener(actionButtons);
        
        button6 = new JButton("6");
        panel.add(button6);
        button6.addActionListener(actionButtons);
        
        button7 = new JButton("7");
        panel.add(button7);
        button7.addActionListener(actionButtons);
        
        button8 = new JButton("8");
        panel.add(button8);
        button8.addActionListener(actionButtons);
        
        button9 = new JButton("9");
        panel.add(button9);
        button9.addActionListener(actionButtons);
        
        addButton = new JButton("+");
        panel.add(addButton);
        addButton.addActionListener(actionButtons);
        
        subtractButton = new JButton("-");
        panel.add(subtractButton);
        subtractButton.addActionListener(actionButtons);
        
        multiplyButton = new JButton("x");
        panel.add(multiplyButton);
        multiplyButton.addActionListener(actionButtons);
        
        divideButton = new JButton("/");
        panel.add(divideButton);
        divideButton.addActionListener(actionButtons);
        
        equalsButton = new JButton("=");
        panel.add(equalsButton);
        equalsButton.addActionListener(actionButtons);
        
        periodButton = new JButton(".");
        panel.add(periodButton);
        periodButton.addActionListener(actionButtons);
        
        clearButton = new JButton("C");
        panel.add(clearButton);
        clearButton.addActionListener(actionButtons);

        return panel;
    }


    public class ActionButtons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
              if (e.getSource() == button0) {
                  System.out.println("Clicked button 0");
                  label.setText("Button 0");
            } if (e.getSource() == clearButton) {
                System.out.println("Clicked clear button");
                label.setText("Button ");
            }        
        }

    }
}
