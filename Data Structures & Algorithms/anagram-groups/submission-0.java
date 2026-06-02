public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            int [] count =new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String sCount=Arrays.toString(count);
            if(!map.containsKey(sCount)){
                map.put(sCount,new ArrayList<>());
            }
            map.get(sCount).add(s);
        }

        return new ArrayList<>(map.values());

    }
}