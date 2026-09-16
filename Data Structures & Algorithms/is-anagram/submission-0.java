class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap <>();

        for(int i = 0; i< s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), 1);
            }else{
                int newValue = hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i), newValue);
            }
        }

        for(int i = 0; i< t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                int newValue = hm.get(t.charAt(i))-1;
                hm.put(t.charAt(i), newValue);
            }else{
                return false;
            }
        }

        for(int i: hm.values()){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
