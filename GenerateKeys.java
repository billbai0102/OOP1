public class GenerateKeys{
    private String privateKey = "";
    private String publicKey = "";
    private boolean [] valueOfPosition = new boolean [64];
    private boolean keysGenerated = false;

    /**
     * Class constructor
     */
    public GenerateKeys (){
        if (keysGenerated == false) {
            getPrivateKey ();
        }
    }

    /**
     * Returns a random value between two numbers
     *
     * @param minValue Minimum number for the value.
     * @param maxValue Maximum value.
     * @return A random integer.
     */
    public int generateRandomValue (int minValue, int maxValue){
        return (int) (Math.random ()* maxValue) + minValue ;
    }

    /**
     * This method generates and returns a private key.
     *
     * @return A private key, in the form of an String.
     */
    public String getPrivateKey (){
        for (int a = 0; a < 64 ; a ++) {
            int randomValue =  generateRandomValue (0,15) ; // creates a random value from 0 - 15
            if (randomValue <= 9){
                privateKey += Integer.toString(randomValue); // converts the random value into a string, adds that value to PrivateKey
                valueOfPosition [a] = true; // stores the position of where that number is in the privateKey
            }
            else {
                valueOfPosition [a] = false ;
                switch (randomValue){ //finds the value and converts it into a letter
                    case 10 :
                        privateKey +="a";
                        break;
                    case 11 :
                        privateKey +="b";
                        break;
                    case 12 :
                        privateKey +="c";
                        break;
                    case 13 :
                        privateKey +="d";
                        break;
                    case 14 :
                        privateKey +="e";
                        break;
                    case 15 :
                        privateKey +="f";
                        break;
                } // ends switch statment
            } // ends else
        } // ends for

        return privateKey;
    } // ends method

    /**
     * A helper method used to change number to generate the private key.
     *
     * @param position The position of the number to be changed
     *
     * @return The changed number.
     */
    private char changeNumber (int position){
        char tempNumber = privateKey.charAt (position);
        switch (tempNumber) {
            case '0' : // goes forward 3 numbers
                tempNumber = '3';
                break;
            case '1' :
                tempNumber = '4';
                break;
            case '2' :
                tempNumber = '5';
                break;
            case '3' :
                tempNumber = '6';
                break;
            case '4' :
                tempNumber = '7';
                break;
            case '5' :
                tempNumber = '8';
                break;
            case '6' :
                tempNumber = '9';
                break;
            case '7' :
                tempNumber = '0';
                break;
            case '8' :
                tempNumber = '1';
                break;
            case '9' :
                tempNumber = '2';
                break;
        }
        return tempNumber;
    }

    /**
     * Changes character, used to generate the private key.
     *
     * @param position The position of the character
     * @return The changed character
     */
    public void idk(int w){
        System.out.println(this);
    }
    private char changeCharacter (int position){
        char tempChar = privateKey.charAt (position);
        switch (tempChar) {
            case 'a': // goes forward 3 letters
                tempChar = 'd';
                break;
            case 'b' :
                tempChar = 'e';
                break;
            case 'c' :
                tempChar = 'f';
                break;
            case 'd':
                tempChar = 'a';
                break;
            case 'e' :
                tempChar = 'b';
                break;
            case 'f' :
                tempChar = 'c';
                break;
        }
        return tempChar;
    }

    /**
     * Generates and returns a public key.
     *
     * @return The finalized public key.
     */
    public String getPublicKey () {
        if (keysGenerated == false) {
            for (int a = 0; a < 64 ; a ++) {
                if (valueOfPosition [a] == true) {
                    publicKey += Character.toString(changeNumber (a));
                }
                else {
                    publicKey += Character.toString(changeCharacter(a));
                }
            }
            //   System.out.println ("Your Private Key is " + privateKey);
            // System.out.println ("Your Public key is " + publicKey);
            keysGenerated = true;
        }
        return publicKey;
    }
}