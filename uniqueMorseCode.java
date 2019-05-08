class Solution {
    public int uniqueMorseRepresentations(String[] words) {
             int num = 0;
    String code = "";
          HashSet<String> h = new HashSet<String>(); 
     //Vector morseph = new Vector();  
        
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    for (int i = 0; i < words.length ; i++){
        code = "";
        for(int j = 0; j < words[i].length(); j++){
            //cout << words[i].length()<<endl;
            code = code + morse[(words[i].toCharArray())[j]-97];
        }
        System.out.println(code);
        h.add(code);
    }
        
     
    return h.size();
    
    }
}
