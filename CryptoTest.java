public class CryptoTest {
    public static void main(String[] args) {
        String toHash = "my name is bill";
        String hash = "";
        toHash += ".ran"; //Idk I guess i added this just incase the length of the String is too small
        for(int x = 0; x < toHash.length();x++){
            hash+=Integer.toBinaryString(toHash.charAt(x));
        }
        Long h1 = Long.parseLong(hash.substring(hash.length()-32,hash.length()-16));
        Long h2= Long.parseLong(hash.substring(hash.length()-16,hash.length()));

        System.out.println(hash);
        System.out.println(h1);
        System.out.println(h2);
        String hashed = Long.toHexString(h1) + Long.toHexString(h2);
        System.out.println(hashed);
    }
}
