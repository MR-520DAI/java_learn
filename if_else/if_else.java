package if_else;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个整数: ");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("num > 0");
        }
        else{
            System.out.println("num < 0");
        }
        //关闭scanner对象
        input.close();
    }
}
