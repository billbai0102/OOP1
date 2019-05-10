/*


 */
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

class GeneratingHash {
    private String data = "";

    /**
     * Class constructor
     *
     * @param data The data to be hashed.
     */
    public GeneratingHash(String data) {
        this.data = data;
    }

    /**
     * Creates, and returns hash.
     *
     * @param inputBytes The input to be hashed.
     * @return A hashed version of the input.
     */
    private String getHash(byte[] inputBytes) {
        String hashValue = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(inputBytes);
            byte[] digestBytes = md.digest();
            hashValue = DatatypeConverter.printHexBinary(digestBytes).toLowerCase(); // converts bytes to hexadecimal
        } catch (Exception e) {
        }
        return hashValue;
    }

    /**
     * Returns the hashed version of the data entered into the constructor.
     *
     * @return A String, containing the hash.
     */
    public String getHash() {
        String hash = "";
        byte[] dataInBytes = data.getBytes();
        hash = getHash(dataInBytes);
        return hash;
    }
}

