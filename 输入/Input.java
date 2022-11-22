package 输入;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("输入一个整数: ");
        int number = input.nextInt();
        System.out.println("您输入 " + number);

        //关闭scanner对象
        input.close();
    }
}
