// space complexity - o(1)
    //time - o(log(n))
    //Ran on leeetcode successfully : Yes
    // Problem faced  : No
    //Approach : use binay search, if(number and index are equal move right else move left)
class FindFirstMissingNumberInAnSortedArray

public static void main(String[] args){
  //int[] arr = { 1,2,3,5,6,7,8};
  int[] arr = { 1,2,4,5,6,7,8,9};
  Solution s = new Solution();
  System.out.println(s.findFirstMissingNumberOptimised(arr));
}

public int findFirstMissingNumberOptimised(int[] arr){

      if(arr == null || arr.length == 0) return -1;

      int start = 0 ;
      int end = arr.length -1;
      int mid = start +( end - start)/2;
        while(start <= end){

          mid = start +( end - start)/2;

          if(start == end ) return start +1;

          if(arr[mid] != mid + 1){
            end = mid ;
          }
          else{
            start = mid + 1;
          }

        }
      return start + 1;
  }
