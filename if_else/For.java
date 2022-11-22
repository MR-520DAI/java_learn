package if_else;

public class For{
    public static void main(String[] args){
        for(int i = 0; i < 10; i++)
        {
            System.out.println("time: " + i);
        }
        // for each
        int[] numbers = {1, 2, 5, 6, 8, 9, 10};
        for(int number : numbers)
        {
            System.out.println(number);
        }
    }
}