class LongestString {
    public int longestString(int x, int y, int z) {
        int out = 0;
        if(x==y){
            out = (x+y+z)*2;
        }
        else if(y > x){
            out = (x+x+1+z)*2;
        }else{
            out = (z+y+y+1)*2;
        }
        return out;
    }
}
