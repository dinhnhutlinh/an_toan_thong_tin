package caerer_cipher;

import key.VNCharacterUtils;

public class CaererCipher {

    public static String encryto(String input, int key) {
        input = VNCharacterUtils.removeAccent(input);
        String result = "";
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char c1 = encytoChar(c, key);
            result += c1;
        }
        return result;
    }

    public static String dencryto(String input, int key) {
        input = VNCharacterUtils.removeAccent(input);
        System.out.println(input);
        String result = "";
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char c1 = encytoChar(c, -key);
            result += c1;
        }
        return result;
    }

    public static char encytoChar(char c, int key) {
        int indexOf = -1;
        char[] vnCharacter = VNCharacterUtils.vnCharacter;
        for (int i = 0; i < vnCharacter.length; i++)
            if (c == VNCharacterUtils.vnCharacter[i]) {
                indexOf = i;
                break;
            }

        if (indexOf == -1) return c;
        return vnCharacter[(indexOf + 29 + key) % vnCharacter.length];
    }

    public static void main(String[] args) {
        CaererCipher c = new CaererCipher();
        String s = "nhà quê";
        String enc = c.encryto(s, 1);
        String den = c.dencryto(enc, 1);
        System.out.println(enc);
        System.out.println(den);
    }
}
