import java.io.*;
import java.util.*;

public class crc {
    public static void main(String[] args) {
        String input = "1010101010";
        String key = "11001";
        String crc = calculateCRC(input, key);
        System.out.println("Message: " + input);
        System.out.println("Polynomial: " + key);
        System.out.println("CRC Checksum: " + crc);
    }

    public static String xor(String input, String key) {
        String result="";
        int n=input.length();
        int s=key.length();
        
        for(int i=1; i<n; i++) {
            if(input.charAt(i) == key.charAt(i))
                result += "0";
            else
                result += "1";
        }
        return result;
    }

    public static String calculateCRC(String input, String key) {
        int n = input.length();
        int s = key.length();
        input = input + "0000";

        StringBuilder crc = new StringBuilder(input.substring(0, s));

        for (int i = s; i < n + s - 1; i++) {
            if (crc.charAt(0) == '1') {
                for (int j = 0; j < s; j++) {
                    crc.setCharAt(j, (char) (crc.charAt(j) ^ key.charAt(j)));
                }
            }
            crc.deleteCharAt(0);
            crc.append(input.charAt(i));
        }

        return crc.toString();
    }
}
