class Solution {
    int count=0;
    public boolean isHappy(int n) {
        boolean flag= false;
        int number = 0;
        int total = 0;
        while(n > 0){
        number = n%10;
        n = n /10;
        System.out.println(number);
        total = total+(number *number);
       
        }
        System.out.println(total);
        
        if(total == 1){
            flag = true;
        }
        else if (count < 20){
            count++;
            flag =isHappy(total);
        }
        
        return flag;
    }
}
