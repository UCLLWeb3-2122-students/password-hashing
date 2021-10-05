import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashingExample {
	
	public static void main(String arg[]) throws Exception {
	    System.out.println(sha512("banana"));
	  }

	private static String sha512(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest crypt = MessageDigest.getInstance("SHA-512");
		crypt.reset();

		// encrypts
		crypt.update(password.getBytes("UTF-8"));

		//16 hexadecimal system the sixteen digits are "0–9" followed by "A–F".
		String hashedPassword = new BigInteger(1, crypt.digest()).toString(16);
		System.out.println(hashedPassword.length());
		return hashedPassword;
	}
	
}
