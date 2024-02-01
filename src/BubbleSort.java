public class  BubbleSort {
    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public void sort(){
        for(int i = 1; i< arr.length; i++){
            for(int j = 0;j< arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        new BubbleSort().sort();
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


