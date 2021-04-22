public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    static String countAndSay(int A) {
        if (A < 0)
            return "";
        String result = "1";
        while (A > 1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < result.length(); i++) {
                int count = 1;
                while (i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(count).append(result.charAt(i));
            }
            result = sb.toString();
            A--;
        }
        return result;
    }

}
