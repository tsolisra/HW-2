class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       //List<Integer> myList = new ArrayList<Integer>(); 
        HashSet<Integer> A = new HashSet<Integer>();
        HashSet<Integer> B = new HashSet<Integer>();
        //set<Integer> B = new HashSet<>(Arrays.asList(numsw));
        for (int i = 0 ; i < nums1.length ; i++){
            A.add(nums1[i]);
        }
        for (int i = 0 ; i < nums2.length ; i++){
            B.add(nums2[i]);
        }
        
        //find intersection ------------
        B.retainAll(A);
        //-----------------------------
        //Initialize int array
        int [] num = new int[B.size()];
        
        
        //Convert Integer set to int Array---------------
        Iterator<Integer> i =  B.iterator(); 
        int j =0;
        while (i.hasNext()){
            num[j] = i.next();
            j++;
        } 
        //-------------------------------
        
       return num;
    }
}
