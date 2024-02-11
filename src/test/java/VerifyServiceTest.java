import org.example.VerifyService;
import org.example.VerifyServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class VerifyServiceTest {

    private VerifyService verifyService;
    @Test
    public void isValidBeginningTest() {
        verifyService = new VerifyServiceImpl("test");
        assertTrue(verifyService.isValidBeginning("test"));
        assertTrue(verifyService.isValidBeginning("testABC"));
    }

    @Test
    public void isNotValidBeginningTest() {
        verifyService = new VerifyServiceImpl("abc");
        assertFalse(verifyService.isValidBeginning("Test"));
        assertFalse(verifyService.isValidBeginning("abC"));
    }

}
