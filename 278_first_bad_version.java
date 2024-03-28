/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         if (n==1) return 1;
        int begin=1, end=n;
        while(begin<end){
            int mid=begin+(end-begin)/2;
            if (isBadVersion(mid)) end=mid;
            else if (!isBadVersion(mid) && isBadVersion(mid+1)) return mid+1;
            else begin=mid+1;
        }
        if (begin!=n && isBadVersion(begin)) return begin;
        return -1;
    }
}

//or

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int lo=1, hi=n;
            while(lo<hi){
                int mid= lo+(hi-lo)/2;
                if(isBadVersion(mid)){
                    hi=mid;
                }
                else{
                    lo=mid+1;
                }
            }
            return lo;
        }
    }