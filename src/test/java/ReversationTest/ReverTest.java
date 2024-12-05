package ReversationTest;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import tg.bot.Main;

public class ReverTest {
    @Test
    public void testReverseString() {
        assertEquals("!dlroW ,olleH", Main.reverseString("Hello, World!"));
    }
}
