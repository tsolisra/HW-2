class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        List<String> myList = new ArrayList<String>();
        String lala= A +" "+B;
        //String[] words =ObjectArrays.concat(A.split("\\s+"),B.split("\\s+"));
        String[] words =lala.split("\\s+");
        //String[] secondSentence = B.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
                                                 
        for (int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }
            else{
               map.put(words[i],1);
            }
        }
        
        for (int i = 0; i < words.length; i++){
            if(map.get(words[i]) == 1){
            myList.add(words[i]);
            }
        }
        
        System.out.println(Arrays.asList(map));
         return myList.toArray(new String[myList.size()]);
    }
}
