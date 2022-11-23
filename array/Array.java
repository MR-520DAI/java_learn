package array;

public class Array {
    public static void setarray(int[][] arr, int n, int m){
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // 数组声明 + 初始化
        int[] arr1 = new int[5];
        for(int i = 0; i < 5; i++)
        {
            arr1[i] = i+1;
        }

        int[] arr2 = {1,2,3,4,5};
        // 遍历使用
        for (int i : arr2) {
            System.out.println(i);
        }

        // 多维数组
        int[][] arr = {{1,1},{1,1}};
        setarray(arr, 2, 2);
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
