package key;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KeyHelper {
    public static String genKey() {        char[] vnCharacter = VNCharacterUtils.vnCharacter.clone();
        Random random = new Random();
        for (int i = vnCharacter.length - 1; i > 1; i--) {
            int index = random.nextInt(i - 1);
            char temp = vnCharacter[i];
            vnCharacter[i] = vnCharacter[index];
            vnCharacter[index] = temp;
        }
        return new String(vnCharacter);
    }

    public static void main(String[] args) {
        System.out.println(genKey());
        System.out.println(genKey().length());
    }

    public static String loadKey(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (!file.exists() || file.isDirectory()) {
            throw new Exception(pathFile + " not file");
        }
        BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String content = "";
        String line;
        while ((line = bis.readLine()) != null) {
            content += line;
        }
        bis.close();
        return content;
    }
}
