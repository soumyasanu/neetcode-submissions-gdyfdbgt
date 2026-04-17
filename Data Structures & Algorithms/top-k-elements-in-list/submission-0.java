class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap <>();
        for (int x:nums){
            hm.put(x , hm.getOrDefault(x,0)+1);
        }

        List<Integer> l = new ArrayList<>(hm.keySet());

        Collections.sort(l , (a,b)->hm.get(b)-hm.get(a));



        int [] ans = new int[k];

        for(int i =0;i < k ;i++){
            ans[i] = l.get(i);
        }

        return ans ;


         

        
    }
}
