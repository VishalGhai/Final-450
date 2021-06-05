class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"fly","flight","flying"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(minlen>strs[i].length()) minlen = strs[i].length();
        }
        for(int i=0;i<minlen;i++){
            char c = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(c!=strs[j].charAt(i)) return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}