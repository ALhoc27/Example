package FrameExample;

import javax.swing.JOptionPane;
class Authenticator {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username");
        String password =
                JOptionPane.showInputDialog("Password");
        if ((username != null && password != null) &&
                ((username.equals("r") && password.equals("2")) || (username.equals("hritter") && password.equals("preakston")))) {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
        }
    }
}
// если нужно извлечь число из строки возвращаемой методом JOptionPane.showInputDialog("");
// ножно преобразовать int numЬerOfBunnies = Integer.parseint (JOptionPane.showinputDialog("Cкoлькo кроликов ты купил?"));
// или в double с помощью метода parseDouble () в число с плавающей точкой