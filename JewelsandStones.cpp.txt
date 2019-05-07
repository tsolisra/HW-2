class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int total=0;
        
        cout<< J.length()<<endl;
        cout << S.length() <<endl;
        
        for(int i = 0 ; i < J.length() ; i++){
            for(int s = 0 ; s < S.length() ; s++){
                if (J[i] == S[s]){
                    total++;
                }
            }
        }
        
        
        return total;
    }
};