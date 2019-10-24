public class CharArrayToString {

    public static void main(String args[]){
        char[] charArray = new char[]{'J','A','V','A',' ','I','S',' ','C','O','O','L','!'};

        /*
        To convert char array to String in Java use String(Char[] ch)
        constructor of Java String class
         */

        String str = new String(charArray);

        System.out.println("Char array converted to String: " + str);
    }
}
