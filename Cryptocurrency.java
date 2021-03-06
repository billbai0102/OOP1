/*
Bill Bai, Juan-Diego Castano
Ms K
This Program is the main class for running other programs
*/

public class Cryptocurrency {
    static String[] previousHash = new String[3];
    static int[] transactionNumber = new int[4];
    static double[] transactionAmount = new double[4];

    /**
     * This method sets the transactions amounts, and gives a brief explanation.
     *
     * @param senderKey   The sender's key.
     * @param receiverKey The receiver's key.
     */
    public void firstBlock(String senderKey, String receiverKey) {
        System.out.println("Juan is sending Bill 20 dollars");
        System.out.println("Juan is otherwise known as " + senderKey);
        System.out.println("And Bill is otherwise known as " + receiverKey);
        System.out.println(" ");
        transactionAmount[0] = 20;
        transactionNumber[0] = 1;
    }

    /**
     *This method sets the transactions amounts, and gives a brief explanation.
     *
     * @param senderKey   The sender's key.
     * @param receiverKey The receiver's key.
     */
    public void secondBlock(String senderKey, String receiverKey) {
        System.out.println("Jim is sending Josh 5000 dollars");
        System.out.println("Jim is otherwise known as " + senderKey);
        System.out.println("And Josh is otherwise known as " + receiverKey);
        System.out.println(" ");
        transactionAmount[1] = 5000.175;
        transactionNumber[1] = 2;
    }

    /**
     * The application's entry point.
     */
    public static void main(String[] args) {
        Cryptocurrency crypto = new Cryptocurrency();
        GenKeyPairs juan = new GenKeyPairs();
        GenKeyPairs bill = new GenKeyPairs();
        GenKeyPairs jim = new GenKeyPairs();
        GenKeyPairs josh = new GenKeyPairs();

        crypto.firstBlock(juan.getHexaPublicKey(), bill.getHexaPublicKey());
        GenesisBlock genBlock = new GenesisBlock(transactionNumber[0], transactionAmount[0], juan.getRawPublicKey(), bill.getRawPublicKey(), juan.getHexaPublicKey(), bill.getHexaPublicKey());
        previousHash[0] = genBlock.generateBlock(juan.getRawPrivateKey());
        System.out.println(" ");
        crypto.secondBlock(jim.getHexaPublicKey(), josh.getHexaPublicKey());
        BlockTwo secondBlock = new BlockTwo(transactionNumber[1], transactionAmount[1], jim.getRawPublicKey(), josh.getRawPublicKey(), jim.getHexaPublicKey(), josh.getHexaPublicKey(), previousHash[0]);
        previousHash[1] = secondBlock.generateBlock(jim.getRawPrivateKey());
        System.out.println(" ");

    }
}