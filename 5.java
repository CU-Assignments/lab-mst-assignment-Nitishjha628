class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            mp.put(nums2[i], i);
        }
        int[] finalAns = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int curr = nums1[i];
            int idx = mp.get(curr);
            int ans = -1;
            for(int j = idx + 1; j < nums2.length; j++){
                if(nums2[j] > curr){
                   ans = nums2[j];
                   break;
                }
            }
            finalAns[i] = ans;
        }
        return finalAns;
    }
}
