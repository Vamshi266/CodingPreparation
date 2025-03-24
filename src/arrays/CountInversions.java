package arrays;

import java.util.ArrayList;

public class CountInversions {
    static int merge(int arr[], int l, int mid, int r) {
	int left = l;
	int right = mid + 1;
	int count = 0;

	ArrayList<Integer> al = new ArrayList<>();

	while (left <= mid && right <= r) {
	    if (arr[left] <= arr[right]) {
		al.add(arr[left]);
		left++;
	    } else {
		al.add(arr[right]);
		count += (mid - left + 1);
		right++;
	    }
	}

	while (left <= mid) {
	    al.add(arr[left]);
	    left++;
	}

	while (right <= r) {
	    al.add(arr[right]);
	    right++;
	}

	for (int i = l; i <= r; i++) {
	    arr[i] = al.get(i - l);
	}

	return count;
    }

    static int mergeSort(int arr[], int l, int r) {
	if (l >= r)
	    return 0;

	int mid = (l + r) / 2;
	int count = 0;

	count += mergeSort(arr, l, mid);
	count += mergeSort(arr, mid + 1, r);

	count += merge(arr, l, mid, r);

	return count;
    }

    static int inversionCount(int arr[]) {

	return mergeSort(arr, 0, arr.length - 1);

    }

    public static void main(String[] args) {

	int arr[] = { 2, 4, 1, 3, 5 };

	int invCount = mergeSort(arr, 0, arr.length - 1);

	System.out.println("inversion Count = " + invCount);
    }
}
