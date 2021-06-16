import javax.crypto.Cipher;

public class Main {
    public static void main(final String[] arguments) {
        int number = 3;
        int[] numbers = {50, 2, 3, 4};
        //increment(number);
        //incrementArray(numbers);
        //System.out.println(cipher("abc", 1));
        //System.out.println(decipher("bcd", 1));
    }

    // public static void increment(int n) {
    //    System.out.println(n);
    //     n++;
    //     System.out.println(n);
    // }
    // public static void incrementArray(int[] array){
    //    int maisUm=1;
    //     array[0]=100;
    //     System.out.println(array[0]);
    // for (int i = 0; array.length > i; i++) {
    //     System.out.println(array[i]+1);
    //}
    //  }
    public static String cipher(String message, int offset) {
        String cipher = "";
        String decipher = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int code = (int) c;
            code += offset;
            char cx = (char) code;
            cipher += cx;
        }
        return cipher;
    }

    public static String decipher(String message, int offset) {
        String cipher = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int code = (int) c;
            code -= offset;
            char cx = (char) code;
            cipher += cx;
        }
        return cipher;
    }


}

