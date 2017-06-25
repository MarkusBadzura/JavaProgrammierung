package GUIProgrammierung;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Beispielprogramm für JPasswordField
 * @author Markus Badzura
 */
public class Bedien_JPasswordField extends JFrame
{
  public static void main(String[] args) {
    Bedien_JPasswordField jpf = new Bedien_JPasswordField();
    jpf.Bedien_JPasswordField();
  }
  public void Bedien_JPasswordField()
  {
    this.setSize(500,500);
    this.setTitle("Beispiel JTextField");   
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel pan = new JPanel();
    pan.setSize(this.getSize());
    JPasswordField pass = new JPasswordField("password");
    pass.setEchoChar('*');
    pass.setBounds(10,10,250,25);
    System.out.println(pass.toString());
    char[] passwort = pass.getPassword();
    for (int i = 0; i < passwort.length; i++)
    {
      System.out.print(passwort[i]);
    }
    pan.setLayout(null);
    pan.add(pass);
    this.add(pan);
    this.setVisible(true);
  }
}
