public class GuesserTest {
    public static boolean guessed = false;

    public void test() {
        new Guesser().guess();
        //org.junit.Assert.assertTrue(guessed);
    }
}