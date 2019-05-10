import java.security.PublicKey;

public class BlockTwo extends GenesisBlock {

    private int transactionsMade;
    private String previousHash;

    /**
     * Class constructor
     *
     * @param transactionID The transaction ID
     * @param transactionAmount The transaction ammount
     * @param senderRawKey The sender's public key
     * @param receiverRawKey The receiver's public key
     * @param senderKey The sender's ley
     * @param receiverKey The receiver's key
     * @param previousHash The previous hash
     */
    public BlockTwo(int transactionID, double transactionAmount, PublicKey senderRawKey, PublicKey receiverRawKey,
                    String senderKey, String receiverKey, String previousHash) {
        super(transactionID, transactionAmount, senderRawKey, receiverRawKey, senderKey, receiverKey); //This calls superclass constructor
        transactionsMade = 0;
        this.previousHash = previousHash;
    }

    /**
     * Class constructor
     *
     * @param transactionID The transaction ID
     * @param senderRawKey The sender's public key
     * @param receiverRawKey The receiver's public key
     * @param senderKey The sender's ley
     * @param receiverKey The receiver's key
     * @param previousHash The previous hash
     */
    public BlockTwo(int transactionID, PublicKey senderRawKey, PublicKey receiverRawKey,
                    String senderKey, String receiverKey, String previousHash) {
        super(transactionID, senderRawKey, receiverRawKey, senderKey, receiverKey); //This calls superclass constructor
        transactionsMade = 0;
        this.previousHash = previousHash;
    }

    /**
     * This adds a certain amount of transactions
     *
     * @param transactionsMade Transactions made
     */
    public void addTransaction(int transactionsMade) {
        this.transactionsMade += transactionsMade;
    }

    /**
     * Returns transactionsMade
     *
     * @return An int, containing number of transactions made.
     */
    public int getTransactionsMade() {
        return transactionsMade;
    }

    /**
     * The compiled data, in a String.
     *
     * @return A String containing the compiled data.
     */
    public String data() {
        String data = "";
        data += blockNumber + 1;
        data += transactionID;
        data += transactionAmount;
        data += senderKey;
        data += receiverKey;
        data += previousHash;
        return data;
    }

}