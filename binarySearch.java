package com.code;

public class binarySearch {

    public static void main(String[] args) {
      int[] arr = {-12, -2, 0, 2, 5, 17, 19, 23, 44, 89};
      int target =44;
      int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
               end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
