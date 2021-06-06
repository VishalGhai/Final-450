class Flip01 {
    public static int minFlips(String S) {
        // Code here
        return Math.min(getFlipWithStartingCharcter(S, '0'), getFlipWithStartingCharcter(S, '1'));
    }

    public static char flip(char ch) {
        return (ch == '0') ? '1' : '0';
    }

    // Utility method to get minimum flips when
    // alternate string starts with expected char
    public static int getFlipWithStartingCharcter(String str, char expected) {
        int flipCount = 0;
        for (int i = 0; i < str.length(); i++) {
            // if current character is not expected,
            // increase flip count
            if (str.charAt(i) != expected)
                flipCount++;

            // flip expected character each time
            expected = flip(expected);
        }
        return flipCount;
    }

    public static void main(String[] args) {
        System.out.println(minFlips("00010111"));
    }
}