package Class;

/**
 * lamp
 */
class lamp {
    boolean isOn;

    void turnOn() {
        // 初始化值为true的变量
        isOn = true;
        System.out.println("点亮? " + isOn);

    }

    void turnOff() {
        //初始化值为false的变量
        isOn = false;
        System.out.println("点亮? " + isOn);
    }
}

public class ch1 {
    public static void main(String[] args) {
        //创建对象l1和l2
        lamp l1 = new lamp();
        lamp l2 = new lamp();
        l1.isOn = false;

        //调用方法turnOn()和shutdown ()
        l1.turnOn();
        l2.turnOff();
    }
}

