public class Reverse_In_Array {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {5, 27, 11, 15, 22, 33, 54, 9};

        reverse(numbers);

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
