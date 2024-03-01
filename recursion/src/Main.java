public class Main {
    public boolean canTraverseAllPairs(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;i<nums.length;i++){
                if(i==j){
                    continue;
                }
                if(findGCD(nums[i],nums[j])<=1){
                    return false;
                }

            }
        }
        return true;
    }

    public int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}