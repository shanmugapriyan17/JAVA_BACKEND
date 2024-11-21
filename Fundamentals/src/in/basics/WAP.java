package in.basics;

public class WAP {
    public static void main(String[] args) {  
        int[] arr = {7, 1, 2, 6, 9, 8, 5,10};
        
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];  
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("First Maximum is: " + first);
        System.out.println("Second Maximum is: " + second);
    }
}
