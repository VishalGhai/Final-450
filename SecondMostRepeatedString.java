import java.util.*;
class SecondMostRepeatedString
{
    static String secFrequent(String arr[])
    {
        // your code here
        Map<String,Integer> map = new HashMap<String,Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
                map.put(arr[i],map.get(arr[i])+1);
        }
        
        for(String k:map.keySet()){
            pq.add(map.get(k));
        }
        pq.poll();
        int ansind = pq.poll();
        String ans="";
        for(String k:map.keySet()){
            if(map.get(k)==ansind) ans = k;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(secFrequent(new String[]{"test", "test", "test", "test","best","best","next","next","next"}));
    }
}