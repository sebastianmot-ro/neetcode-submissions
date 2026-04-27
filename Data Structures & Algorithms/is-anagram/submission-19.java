
class Solution {
    public boolean isAnagram(String s, String t) {
        //cazul evident
        if (s.length() != t.length()){
            return false;
        }

        //doua HashMap-uri pt fiecare string

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Map<Character, Integer> aparitii_S = new HashMap<>();
        Map<Character, Integer> aparitii_T = new HashMap<>();
        //  sArr[i], aparitii

        //pot face un singur pass (pentru ca lungimile sunt egale pana aici)
        for (int i=0; i<s.length(); i++){
            if (aparitii_S.containsKey(sArr[i])){
            aparitii_S.put(sArr[i], aparitii_S.get(sArr[i]) + 1);
            } else aparitii_S.put(sArr[i], 1);

            if (aparitii_T.containsKey(tArr[i])){
            aparitii_T.put(tArr[i], aparitii_T.get(tArr[i]) + 1);
            } else aparitii_T.put(tArr[i], 1);
        }

        if (aparitii_S.equals(aparitii_T)){
            return true;
        }
        return false;
    }
}
