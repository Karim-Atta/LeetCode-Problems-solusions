/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int minimumVersion = 1;
        int maxVersion = n;
     
        while(maxVersion >= minimumVersion){
            int half = (maxVersion - minimumVersion) / 2 + minimumVersion;
            if(isBadVersion(half)){
                maxVersion = half - 1;
            }else{
                minimumVersion = half + 1;
            }
        }
        return minimumVersion;
    }
}