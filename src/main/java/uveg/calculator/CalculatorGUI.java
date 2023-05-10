
package uveg.calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
        setPreferredSize(new Dimension(500, 500));
        pack();
        setVisible(true);
        setResizable(false);
        
        
    }
        private JPanel calculatorPanel() {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JTextField screen = new JTextField(20);
        screen.setPreferredSize(new Dimension(200, 50));
        panel.add(screen, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        button0 = new JButton("0");
        button0.setPreferredSize(new Dimension(50, 50));
        button0.addActionListener(actionButtons);
        buttonPanel.add(button0);
        
        panel.add(buttonPanel, BorderLayout.CENTER);

      button1 = new JButton("1");
        button1.setPreferredSize(new Dimension(50, 50));
        button1.addActionListener(actionButtons);
        buttonPanel.add(button1);
        
        button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(50, 50));
        button2.addActionListener(actionButtons);
        buttonPanel.add(button2);
        
        button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(50, 50));
        button3.addActionListener(actionButtons);
        buttonPanel.add(button3);
        
        button4 = new JButton("4");
        button4.setPreferredSize(new Dimension(50, 50));
        button4.addActionListener(actionButtons);
        buttonPanel.add(button4);
        
        button5 = new JButton("5");
        button5.setPreferredSize(new Dimension(50, 50));
        button5.addActionListener(actionButtons);
        buttonPanel.add(button5);
        
        button6 = new JButton("6");
        button6.setPreferredSize(new Dimension(50, 50));
        button6.addActionListener(actionButtons);
        buttonPanel.add(button6);
        
        button7 = new JButton("7");
        button7.setPreferredSize(new Dimension(50, 50));
        button7.addActionListener(actionButtons);
        buttonPanel.add(button7);
        
        button8 = new JButton("8");
        button8.setPreferredSize(new Dimension(50, 50));
        button8.addActionListener(actionButtons);
        buttonPanel.add(button8);
        
        button9 = new JButton("9");
        button9.setPreferredSize(new Dimension(50, 50));
        button9.addActionListener(actionButtons);
        buttonPanel.add(button9);
        
        addButton = new JButton("+");
        addButton.setPreferredSize(new Dimension(50, 50));
        addButton.addActionListener(actionButtons);
        buttonPanel.add(addButton);
        
        subtractButton = new JButton("-");
        subtractButton.setPreferredSize(new Dimension(50, 50));
        subtractButton.addActionListener(actionButtons);
        buttonPanel.add(subtractButton);
        
        multiplyButton = new JButton("x");
        multiplyButton.setPreferredSize(new Dimension(50, 50));
        multiplyButton.addActionListener(actionButtons);
        buttonPanel.add(multiplyButton);
        
        divideButton = new JButton("/");
        divideButton.setPreferredSize(new Dimension(50, 50));
        divideButton.addActionListener(actionButtons);
        buttonPanel.add(divideButton);
        
        equalsButton = new JButton("=");
        equalsButton.setPreferredSize(new Dimension(50, 50));
        equalsButton.addActionListener(actionButtons);
        buttonPanel.add(equalsButton);
        
        periodButton = new JButton(".");
        periodButton.setPreferredSize(new Dimension(50, 50));
        periodButton.addActionListener(actionButtons);
        buttonPanel.add(periodButton);
        
        clearButton = new JButton("C");
        clearButton.setPreferredSize(new Dimension(50, 50));
        clearButton.addActionListener(actionButtons);
        buttonPanel.add(clearButton);

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
