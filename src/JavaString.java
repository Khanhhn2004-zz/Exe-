import java.util.Arrays;
import java.util.Random;

public class JavaString {
    public static void ExeString() {
        String str = " Hello Java ";

//        //Viết chương trình Java để đếm số lượng ký tự trong một chuỗi.
//        System.out.println("Viết chương trình Java để đếm số lượng ký tự trong một chuỗi.\n");
//        System.out.println(countCharacters(str));
//        System.out.println(countCharactersSB(str));
//        System.out.println(countCharactersSb(str));
//
//        //Viết chương trình Java để kiểm tra xem một chuỗi có chứa một chuỗi con hay không.
//        System.out.println("Viết chương trình Java để kiểm tra xem một chuỗi có chứa một chuỗi con hay không.");
//        System.out.println(containsSubstring(str, "java"));
//        System.out.println(containsSubstringSB(str, "hele"));
//        System.out.println(containsSubstringSb(str, "Halo"));
//
//        //Viết chương trình Java để chuyển đổi một chuỗi thành chữ hoa.
//        System.out.println("//Viết chương trình Java để chuyển đổi một chuỗi thành chữ hoa.\n");
//        System.out.println(toUppercase(str));
//        System.out.println(toUpperCaseSB(str));
//        System.out.println(toUpperCaseSb(str));
//
//        //Viết chương trình Java để chuyển đổi một chuỗi thành chữ thường.
//        System.out.println("//Viết chương trình Java để chuyển đổi một chuỗi thành chữ thường.");
//        System.out.println(toLowercase(str));
//        System.out.println(toLowerCaseSB(str));
//        System.out.println(toLowerCaseSb(str));
//
//        //Viết chương trình Java để xóa khoảng trắng đầu và cuối chuỗi.
//        System.out.println("//Viết chương trình Java để xóa khoảng trắng đầu và cuối chuỗi.\n");
//        System.out.println(trimString(str));
//        System.out.println(trimSB(str));
//        System.out.println(trimSb(str));
//
//        //Viết chương trình Java để tách chuỗi thành một mảng các từ.
//        System.out.println("//Viết chương trình Java để tách chuỗi thành một mảng các từ.\n");
//        System.out.println(Arrays.toString(splitString(str)));
//        System.out.println(Arrays.toString(splitSB(str)));
//        System.out.println(Arrays.toString(splitSb(str)));
//
//        //Viết chương trình Java để lặp lại một chuỗi n lần.
//        System.out.println("//Viết chương trình Java để lặp lại một chuỗi n lần.\n");
//        repeat(str, 5);
//        repeatSB(str, 5);
//        repeatSb(str, 5);
//
//        //Viết chương trình Java để nối hai chuỗi với nhau.
//        System.out.println("//Viết chương trình Java để lặp lại một chuỗi n lần.");
//        concatSB(str,"jkhsjkfhw");
//        concatSb(str,"fwhfiuewh");
//
        repalaceAll(str);


    }


    //Viết chương trình Java để đếm số lượng ký tự trong một chuỗi.
    public static int countCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }

    public static int countCharactersSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.length();
    }

    public static int countCharactersSb(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.length();
    }

    //Viết chương trình Java để kiểm tra xem một chuỗi có chứa một chuỗi con hay không.
    public static boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }

    public static boolean containsSubstringSB(String str, String sub) {
        StringBuilder sb = new StringBuilder(str);
        return sb.indexOf(sub) != -1;
    }

    public static boolean containsSubstringSb(String str, String subStr) {
        StringBuffer sb = new StringBuffer(str);
        return sb.indexOf(subStr) != -1;
    }

    //Viết chương trình Java để chuyển đổi một chuỗi thành chữ hoa.
    public static String toUppercase(String str) {
        return str.toUpperCase();
    }

    public static String toUpperCaseSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static String toUpperCaseSb(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    //Viết chương trình Java để chuyển đổi một chuỗi thành chữ thường.
    public static String toLowercase(String str) {
        return str.toLowerCase();
    }

    public static String toLowerCaseSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static String toLowerCaseSb(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    //Viết chương trình Java để xóa khoảng trắng đầu và cuối chuỗi.
    public static String trimString(String str) {
        return str.trim();
    }

    public static String trimSB(String str) {
        StringBuilder sb = new StringBuilder(str.trim());
        return sb.toString();
    }

    public static String trimSb(String str) {
        StringBuffer sb = new StringBuffer(str.trim());
        return sb.toString();
    }

    //Viết chương trình Java để tách chuỗi thành một mảng các từ.
    public static String[] splitString(String str) {
        return str.split(" ");
    }

    public static String[] splitSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        String[] words = sb.toString().split(" ");
        return words;
    }

    public static String[] splitSb(String str) {
        StringBuffer sb = new StringBuffer(str);
        String[] words = sb.toString().split(" ");
        return words;
    }

    //Viết chương trình Java để nối hai chuỗi với nhau.
    public static String concatSB(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        return sb.toString();
    }

    public static String concatSb(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        return sb.toString();
    }

    //Viết chương trình Java để so sánh hai chuỗi.
    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean equalsSB(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        return sb1.toString().contentEquals(sb2);
    }

    public static boolean equalsSb(String str1, String str2) {
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        return sb1.toString().contentEquals(sb2);
    }

    //Viết chương trình Java để lặp lại một chuỗi n lần.
    public static void repeat(String str, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void repeatSB(String str, int n) {

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < n; i++) {
            System.out.println(sb);
        }
    }

    public static void repeatSb(String str, int n) {

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < n; i++) {
            System.out.println(sb);
        }
    }
    //Viết chương trình Java để thay thế tất cả các ký tự trong chuỗi bằng một ký tự khác.
    public static void repalaceAll(String str){
        StringBuilder sb = new StringBuilder(str);
        Random random = new Random();
        for (int i = 0; i < sb.length() ; i++) {
            sb.replace(0,sb.length() - 1,random.nextInt(1000) + " " );
        }
    }
}
