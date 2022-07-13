class Quick{
public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
    public static int partion(int[] arr, int low , int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                // swapping 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if (low < high) {
            int pivot = partion(arr , low , high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }


    public static void main(String[] args) {
        int arr[] = {4,7,2,8,5,1};
        int n = arr.length;

        quickSort(arr,0,n-1);
        printArr(arr);

        
    }
}