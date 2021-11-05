package cesar;

public class Cesar {


    public String chiffrement(String string,int decalage){

        String[] stringSeparated = string.split("");
        String encryptedString = "";

        for(int i =0 ; i<string.length();i++){

            int element =(int) string.toLowerCase().charAt(i);
            element+=decalage;

            while (element>122){
                element = element - 122;
                element += 96;
            }
            encryptedString+=Character.toString((char)element);
        }
        return encryptedString;
    }

    public String dechiffrement(String string,int decalage){

        String[] stringSeparated = string.split("");
        String decryptedString = "";

        for(int i =0 ; i<string.length();i++){

            int element =(int) string.toLowerCase().charAt(i);
            element-=decalage;

            while (element<97){
                element = 97 -element;
                element = 123-element;
            }
            decryptedString+=Character.toString((char)element);
        }
        return decryptedString;
    }
}
