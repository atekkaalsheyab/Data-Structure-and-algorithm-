import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int num=0;
/*
        System.out.println("Enter the size of the array: ");
        num = input.nextInt();
*/
        //Integer[] numbers = new Integer[num];
        Integer[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        /*
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();
        }
*/
        System.out.println("The old array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("The new array with elements in reversed order is:  ");
        Integer[] reversedNumbers= new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i]=numbers[(numbers.length-1)-i];
        }

        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i]+" ");
        }
        System.out.println();
    }
}
