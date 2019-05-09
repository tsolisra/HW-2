class Solution {
    public int distributeCandies(int[] candies) {
        int numOfCandies = candies.length /2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < candies.length; i++){
            if(map.containsKey(candies[i])){
                map.put(candies[i], map.get(candies[i]) + 1);
            }
            else{
               map.put(candies[i],1);
            }
        }
        if(map.size() > numOfCandies){
            return numOfCandies;
        }
      //System.out.println(Arrays.asList(map)); 
      return map.size();  
    }
}
