
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

    char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();

     Map<Character, Integer> mapS = new HashMap<>();
     Map<Character, Integer> mapT = new HashMap<>();

     for (int i=0; i<s.length(); i++){
        char c1 = s1[i];
        char c2 = t1[i];

        if (mapS.containsKey(c1)){
            mapS.put(c1, mapS.get(c1) + 1);
        } else mapS.put(c1, 1);
        if (mapT.containsKey(c2)){
            mapT.put(c2, mapT.get(c2) + 1);
        } else mapT.put(c2, 1);
     }
       return mapS.equals(mapT);
    }
}
