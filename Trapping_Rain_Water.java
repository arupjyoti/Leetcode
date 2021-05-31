class Main {
  public static void main(String[] args) {
    System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }

  public static int trap(int[] height) {
        int len = height.length;

        if(len<3) return 0;
        int maxL = height[0], maxR = height[len-1], cur = 0, total = 0, i = 0, j = len-1;

        for(; i<(j-1) ;) {
          if(maxL <= maxR) {
            cur = i + 1;
            if(maxL > height[cur]) {
              total += maxL - height[cur];
              maxL = height[cur];
            }
             
            i++;
            continue;
          }

          cur = j - 1;
          if(maxR > height[cur]) {
              total += maxR - height[cur];
              maxR = height[cur];
            }
             
          --j;
        }
        
        return total;
    }
}
