class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineHashMap = new HashMap();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            int counterCount = magazineHashMap.getOrDefault(c, 0);
            magazineHashMap.put(c, counterCount + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            int counterCount = magazineHashMap.getOrDefault(c, 0);
            if (counterCount == 0)
                return false;
            magazineHashMap.put(c, counterCount -1);
        }
        return true;
    }
}