
class Solution {
    public boolean isAnagram(String s, String t) {
        //primul caz din prima nu poate fi palindrom daca au lungimi diferite
        //apoi sortam string-urile (le facem array prima data pt a putea face asta)
        //si le comparam egalitatea ( cu .equals())
        if (s.length() != t.length())
            return false;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return (Arrays.equals(sArr,tArr));
    }
}
