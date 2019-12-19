import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC5ef872f6da5a21de157d80997a64bd33";
  public static final String AUTH_TOKEN = "your_auth_token";
  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message
      .creator(new PhoneNumber("+16518675309"), new PhoneNumber("+14158141829"),
        "Tomorrow's forecast in Financial District, San Francisco is Clear")
      .setMediaUrl("https://climacons.herokuapp.com/clear.png")
      .create();
    System.out.println(message.getSid());
  }
}