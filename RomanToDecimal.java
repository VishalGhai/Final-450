public class RomanToDecimal {
    public static void main(String[] args) {
        System.out.println("V in decimal : "+romanToInt("V"));
    }
    public int romanToInt(String A) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1); 
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50);
        map.put('C', 100); 
        map.put('D', 500);
        map.put('M', 1000); 
        int sum = 0;
        int i = A.length()-1;
        while(i >= 0){
            char c = A.charAt(i);
            int val = map.get(c);
            sum += val;
            i--;
            while(i >= 0 && map.get(A.charAt(i)) < val){
                sum -= map.get(A.charAt(i));
                i--;
            }
        }
        return sum;
    }
}
