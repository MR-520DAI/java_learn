package Class;

public class method {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        float c = 10.5F;
        float d = 20.5F;

        ADD add = new ADD();
        int e = add.Add(a, b);
        float f = add.Add(c, d);
        System.out.println(e);
        System.out.println(f);
    }

}

class ADD{
    int Add(int a, int b)
    {
        return a + b;
    }
    float Add(float a, float b)
    {
        return a + b;
    }
}