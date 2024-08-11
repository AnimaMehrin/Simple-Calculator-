
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener {
  Calculator cal;
  JTextField input;

  GUI(Calculator p) {

    super("Calculator");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.cal = p;

    // Create the panels
    JPanel panneau1 = new JPanel();
    add(panneau1, BorderLayout.NORTH);
    JPanel panneau2 = new JPanel(new GridLayout(4, 4));
    add(panneau2, BorderLayout.CENTER);

    // Create the instruction text field
    input = new JTextField(25);
    panneau1.add(input);
    // Create the buttons
    String[] buttonLabels = { "9", "8", "7", "+", "-",
        "6", "5", "4", "*", "/",
        "3", "2", "1", "ln", "!",
        "C", "0", "=", "POW", "SQRT" };
    for (String label : buttonLabels) {
      JButton button = new JButton(label);
      panneau2.add(button);
      button.addActionListener(this);
    }
    pack();

  }

  public void actionPerformed(ActionEvent e) {

    String str = e.getActionCommand();
    switch (str) {
      case "+":

        cal.add();
        input.setText("");
        break;
      case "-":

        cal.subtract();
        input.setText("");
        break;
      case "*":
        cal.multiply();
        input.setText("");
        break;
      case "/":
        cal.divide();
        input.setText("");
        break;
      case "!":
        cal.factorial();
        input.setText("");
        break;
      case "POW":
        cal.pow();
        input.setText("");
        break;
      case "SQRT":
        cal.rootSquare();
        input.setText("");
        break;
      case "ln":
        cal.nepLog();
        input.setText("");
        break;
      case "=":
        cal.compute();
        input.setText(String.valueOf(cal.display()));
        break;

      case "C":
        cal.clear();
        input.setText("0");
        break;
      default:
        input.setText(input.getText() + str);
        cal.setSecond(Double.valueOf(input.getText()));
        break;
    }

  }

  public static void main(String arg[]) {
    GUI gui;
    gui = new GUI(new Calculator());
    gui.setVisible(true);
  }
}