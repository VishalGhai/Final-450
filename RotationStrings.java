public class RotationStrings {
    public static void main(String[] args) {
        System.out.println("string "+"ABCD"+" is a rotation of "+"CDAB"+" : "+areRotations("ABCD","CDAB"));
    }

    static boolean areRotations(String str1, String str2) {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
}
