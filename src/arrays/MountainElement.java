package arrays;

public class MountainElement {
    public static void main(String[] args) {
        int[] arr={0,2,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in desc part of an array
                // this may be ans
                //this is why end != mid-1

                end = mid;
            } else {
                //you are in asc part of an array
                start = mid + 1; //because we know that mid+1 > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what checks say
        // more elaboration: at every point of time for start and end, they have the best possible ans till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;
    }
}
