class Solution {
    public boolean isAnagram(String s, String t) {
        int arr [] = new int [256];

        for(char c: s.toCharArray()){
            arr[c]++;
        }


        for(char c: t.toCharArray()){
            arr[c]--;
        }


        for(int x:arr){
            if(x!=0){
                return false;
            }
        }

        return true;


    }
}
