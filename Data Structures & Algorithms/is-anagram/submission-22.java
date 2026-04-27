
class Solution {
    public boolean isAnagram(String s, String t) {
       //use two HashMaps to get the frequencies of each character for each String and then compare 
       //the Maps. if they are equal, return true else return false;

        if (s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            if (sMap.containsKey(s.charAt(i))) //daca a mai aparut litera
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);  //incrementam frecventa
            else sMap.put(s.charAt(i), 1);

            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
            else tMap.put(t.charAt(i), 1);
        }   
        return (sMap.equals(tMap));
    }
}
