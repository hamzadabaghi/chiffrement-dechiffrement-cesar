package cesar;

public class Main {
    public static void main(String[] args) {

        Cesar cesar = new Cesar();
        String string = "ayzef";
        System.out.println("chaine à chiffrer : "+string);
        String encryptedString = cesar.chiffrement(string,15);
        String decryptedString = cesar.dechiffrement(encryptedString,15);
        System.out.println("chiffrement : "+ encryptedString +"\n" +"dechiffrement : " + decryptedString);

    }

}
