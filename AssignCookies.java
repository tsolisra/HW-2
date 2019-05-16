class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        for ( int i= 0;i < s.length && max < g.length; i++) 
            if (g[max] <= s[i]) max++;
        
        return max;
    }
}
