import org.example.Task2.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestMail {

    @Test
    public void testMailBox() {
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(new Client("Kyrylo", Gender.MALE, 19), new GiftMail()));
        Assertions.assertEquals(1, mailBox.infos.size());
    }

    @Test
    public void testMailInfo() {
        MailInfo mailInfo = new MailInfo(new Client("Kyrylo", Gender.MALE, 19), new GiftMail());
        Assertions.assertEquals("BLACK FRIDAY! Kyrylo receive  your discount right now", mailInfo.generate());
    }
}

