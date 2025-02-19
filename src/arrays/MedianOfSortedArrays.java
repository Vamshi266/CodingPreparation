package arrays;

public class MedianOfSortedArrays {

	
	//Time Complexity = O(n)
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = (n1+n2);

        int idx2 = n/2;
        int idx1 = n/2 - 1;

        int idxe1 = -1;
        int idxe2 = -1;
        int count = 0;

        while(i < n1 && j < n2)
        {
            if(nums1[i] < nums2[j])
            {
                if(count == idx1) idxe1 = nums1[i];
                if(count == idx2) idxe2 = nums1[i];
                count++;
                i++;
            }
            else
            {
                if(count == idx1) idxe1 = nums2[j];
                if(count == idx2) idxe2 = nums2[j];
                count++;
                j++;
            }
        }
            while(i < n1)
            {
                if(count == idx1) idxe1 = nums1[i];
                if(count == idx2) idxe2 = nums1[i];
                count++;
                i++;
            }

            while(j < n2)
            {
                if(count == idx1) idxe1 = nums2[j];
                if(count == idx2) idxe2 = nums2[j];
                count++;
                j++;
            }


        if(n % 2 == 1)
             return idxe2;
            else
             return (double)(idxe1+idxe2)/2;


    }
	
	
}
