package key;

import java.util.Arrays;

public class VNCharacterUtils {
    public static char[] vnCharacter = {'a', 'ă', 'â', 'b', 'c', 'd', 'đ', 'e', 'ê',
            'g', 'h', 'i', 'k', 'l', 'm', 'n', 'o', 'ô', 'ơ',
            'p', 'q', 'r', 's', 't', 'u', 'ư', 'v', 'x', 'y'};


    public static String removeAccent(String str) {

        str = str.replaceAll("á|à|ả|ã|ạ", "a");
        str = str.replaceAll("ắ|ằ|ẳ|ã|ặ", "ă");
        str = str.replaceAll("é|è|ẻ|ẽ|ẹ]", "e");
        str = str.replaceAll("ế|ề|ể|ễ|ệ", "ê");
        str = str.replaceAll("ó|ò|ỏ|õ|ọ", "o");
        str = str.replaceAll("ô|ố|ồ|ổ|ỗ|ộ", "ô");
        str = str.replaceAll("ớ|ờ|ở|ỡ|ợ]", "ơ");
        str = str.replaceAll("í|ì|ỉ|ĩ|ị", "i");
        str = str.replaceAll("ứ|ừ|ử|ữ|ự", "ư");
        str = str.replaceAll("ù|ứ|ủ|ũ|ụ", "u");
        str = str.replaceAll("ý|ỳ|ỷ|ỹ|ỵ", "");

        return str;
    }

    public static void main(String[] args) {
        String s = removeAccent("ắ à");
        System.out.println(s);
    }
}