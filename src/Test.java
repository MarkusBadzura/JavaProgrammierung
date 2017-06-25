import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
 
/**
 * @author zeja
 */
public class Test {

 
        
   public static void main(String[] args) {
        String input = "511";
        String result = "000" + input;
        int length = result.length();
        result = result.substring(length - 3, length);
        System.out.println(result);
    }

  
}