
/*public class Guesser {
    public static void guess() {
       LittleClass.isMySecret("thatILoveUnicorns");
    }
    public static void main(String[] args) {
		guess();
	}
}
*/
import java.lang.reflect.Field;

public class Guesser {
	public static void guess() {

		Field f = LittleClass.class.getDeclaredFields()[0];
		System.out.println(f);
		f.setAccessible(true);
		String yourSecret = null;
		try {
			yourSecret = (String) f.get(null);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(yourSecret);
		LittleClass.isMySecret(yourSecret);
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		guess();
	}
}