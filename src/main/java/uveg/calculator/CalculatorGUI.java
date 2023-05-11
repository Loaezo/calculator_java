
package uveg.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
        
        screen = new JTextField(20);
        screen.setPreferredSize(new Dimension(200, 100));
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        screen.setCaretColor(Color.WHITE);
        screen.setFont(new Font("Courier New", Font.BOLD, 104));
        screen.setText("0");
        screen.setEditable(false);
        panel.add(screen, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        
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
        
        button0 = new JButton("0");
        button0.setPreferredSize(new Dimension(50, 50));
        button0.addActionListener(actionButtons);
        buttonPanel.add(button0);
        
        periodButton = new JButton(".");
        periodButton.setPreferredSize(new Dimension(50, 50));
        periodButton.addActionListener(actionButtons);
        buttonPanel.add(periodButton);
        
        JPanel operationsPanel = new JPanel();
        operationsPanel.setLayout(new BoxLayout(operationsPanel, BoxLayout.PAGE_AXIS));
                
        clearButton = new JButton("C");
        clearButton.setPreferredSize(new Dimension(50, 50));
        clearButton.addActionListener(actionButtons);
        operationsPanel.add(clearButton);
        
        addButton = new JButton("+");
        addButton.setPreferredSize(new Dimension(20, 100));
        addButton.addActionListener(actionButtons);
        operationsPanel.add(addButton);
        
        subtractButton = new JButton("-");
        subtractButton.setPreferredSize(new Dimension(20, 100));
        subtractButton.addActionListener(actionButtons);
        operationsPanel.add(subtractButton);
        
        multiplyButton = new JButton("x");
        multiplyButton.setPreferredSize(new Dimension(20, 100));
        multiplyButton.addActionListener(actionButtons);
        operationsPanel.add(multiplyButton);
        
        divideButton = new JButton("/");
        divideButton.setPreferredSize(new Dimension(20, 100));
        divideButton.addActionListener(actionButtons);
        operationsPanel.add(divideButton);
        
        equalsButton = new JButton("=");
        equalsButton.setPreferredSize(new Dimension(20, 100));
        equalsButton.addActionListener(actionButtons);
        operationsPanel.add(equalsButton);
        
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(operationsPanel, BorderLayout.EAST);
        return panel;
    }


    public class ActionButtons implements ActionListener{
        private String input = "";
        private String operator = "";
        private double number1 = 0;
        private double number2 = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            button0.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            addButton.setEnabled(true);
            subtractButton.setEnabled(true);
            multiplyButton.setEnabled(true);
            divideButton.setEnabled(true);
            equalsButton.setEnabled(true);
            periodButton.setEnabled(true);
          if (e.getSource() == button0) {
              if (Integer.parseInt(screen.getText()) == 0) {
                  screen.setText("0");
              } else {
                  input += "0";
                  screen.setText(input);
              }
            } else if (e.getSource() == button1) {
                  input += "1";
                  screen.setText(input);
            } else if (e.getSource() == button2) {
                  input += "2";
                  screen.setText(input);
            } else if (e.getSource() == button3) {
                  input += "3";
                  screen.setText(input);
            } else if (e.getSource() == button4) {
                  input += "4";
                  screen.setText(input);
            } else if (e.getSource() == button5) {
                  input += "5";
                  screen.setText(input);
            } else if (e.getSource() == button6) {
                  input += "6";
                  screen.setText(input);
            } else if (e.getSource() == button7) {
                  input += "7";
                  screen.setText(input);
            } else if (e.getSource() == button8) {
                  input += "8";
                  screen.setText(input);
            } else if (e.getSource() == button9) {
                  input += "9";
                  screen.setText(input);
            } else if (e.getSource() == periodButton) {
                  if (!input.contains(".")) {
                      input += ".";
                  };
                  screen.setText(input);
            } else if (e.getSource() == clearButton) {
                input = "";
                operator = "";
                number1 = 0;
                number2 = 0;
                screen.setText("0");
            } else if (e.getSource() == addButton) {
                number1 = Double.parseDouble(input);
                input = "";
                operator = "+";
                screen.setText("+");
            } else if (e.getSource() == subtractButton) {
                number1 = Double.parseDouble(input);
                input = "";
                operator = "-";
                screen.setText("-");
            } else if (e.getSource() == multiplyButton) {
                number1 = Double.parseDouble(input);
                input = "";
                operator = "*";
                screen.setText("*");
            } else if (e.getSource() == divideButton) {
                number1 = Double.parseDouble(input);
                input = "";
                operator = "/";
                screen.setText("/");
            } else if (e.getSource() == equalsButton) {
                number2 = Double.parseDouble(input);
                double result = 0;
                if (operator.equals("+")){
                    result = number1 + number2;
                    if (result % 1 == 0) {
                        int intResult = (int) result;
                        screen.setText(Integer.toString(intResult));
                    } else {
                        screen.setText(Double.toString(result));
                    }
                } else if (operator.equals("-")){
                    result = number1 - number2;
                    if (result % 1 == 0) {
                        int intResult = (int) result;
                        screen.setText(Integer.toString(intResult));
                    } else {
                        screen.setText(Double.toString(result));
                    }
                } else if (operator.equals("*")){
                    result = number1 * number2;
                    if (result % 1 == 0) {
                        int intResult = (int) result;
                        screen.setText(Integer.toString(intResult));
                    } else {
                        screen.setText(Double.toString(result));
                    }
                } else if (operator.equals("/")){
                    if (number2 != 0) {
                        result = number1 / number2;
                        if (result % 1 == 0) {
                            int intResult = (int) result;
                            screen.setText(Integer.toString(intResult));
                        } else {
                            screen.setText(Double.toString(result));
                        }
                    } else {
                        screen.setText("Error");
                        result = 0;

                        button0.setEnabled(false);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        addButton.setEnabled(false);
                        subtractButton.setEnabled(false);
                        multiplyButton.setEnabled(false);
                        divideButton.setEnabled(false);
                        equalsButton.setEnabled(false);
                        periodButton.setEnabled(false);
                    }

                }
                    input = screen.getText();
            }

        }
    }
}
