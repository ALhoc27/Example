package frameExample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GameFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;

    JTextField textField = new JTextField(15);
    JButton button = new JButton("Cдeлaть попытку");
    JLabel label = new JLabel(numGuesses + " попыток");

    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("Угадай число от 0 до 10");
        setSize(300, 100);
        add(textField);
        add(button);
        add(label);
        button.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String textFieldText = textField.getText();
        if (Integer.parseInt(textFieldText) == randomNumber) {
            button.setEnabled(false);
            textField.setText(textField.getText() + "  Ура! Угадал!");
            textField.setEnabled(false);
        } else {
            textField.setText("");
            textField.requestFocus();
        }
        numGuesses++;
        String guessWord = (numGuesses == 1) ? " попытка" : " попыток";
        label.setText(numGuesses + guessWord);

    }
}

public class index {
    public static void main(String[] args) {
        new GameFrame();
    }
}
