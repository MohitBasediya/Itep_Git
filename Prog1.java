//1)WAP to set marks of 5 subjects manually and print it by indexing, for loop, while loop, do while loop and for each loop separately.
public class Prog1 {
    int arr[];
    Prog1() {
        int arr[] = {87,90,85,65,99};
        this.arr = arr;
    }

    void prinMrks() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Marks of subject " + (i + 1) + " is " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Prog1 obj = new Prog1();
        obj.prinMrks();
    }
}