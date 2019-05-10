import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypto {

    public void hash(String string) {
        long h = 1125899906842597L; // prime
        int len = string.length();

        for (int i = 0; i < len; i++) {
            h = 31*h + string.charAt(i);
        }
        System.out.println(h);
    }

    public static void main (String args[]) throws NoSuchAlgorithmException {
        String input = "SHA-256";
        MessageDigest objSHA256 = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA256 = objSHA256.digest(input.getBytes());
        BigInteger intNumSHA256 = new BigInteger(1, bytSHA256);
        String hcSHA256 = intNumSHA256.toString(16);
        while (hcSHA256.length() < 64) {
            hcSHA256 = "0" + hcSHA256;
        }
        System.out.println(hcSHA256);
    }
}
