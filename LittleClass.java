
public class LittleClass {
	private static String secret = "notVeryWellProtected";

    public static void isMySecret(String guess) {
        if (secret.equals(guess)) {
            System.out.println("How did you found my secret ?!?");
            GuesserTest.guessed = true;
        } else {
            System.out.println("Try again");
        }
    }

}
