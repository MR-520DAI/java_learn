package if_else;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个整数: ");
        int number = input.nextInt();

        switch(number){
        case 1:
            System.out.println("周1");
            break;
        case 2:
            System.out.println("周2");
            break;
        case 3:
            System.out.println("周3");
            break;
        default:
            System.out.println("未知");
            break;
        }
        //关闭scanner对象
        input.close();
    }
}
