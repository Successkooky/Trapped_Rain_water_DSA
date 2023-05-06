import java.lang.Math;
public class Dsa16 {
    //Most Important dsa question Trapped Rain Water
    public static int TrappedWater(int height[]){
        
        //Calculate Left max Boundary
        int n=height.length;
        int leftMax[]=new int[n];
        
        leftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
            
        }
        //Calculate Right max Boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
            
        }
        //Loop
        int Trapped=0;
        for (int i = 0; i <n; i++) {
            int waterlevel=Math.min(leftMax[i], rightMax[i]);
            Trapped+=waterlevel-height[i];
            
        }
        return Trapped;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappedWater(height));
        
    }
    
}
