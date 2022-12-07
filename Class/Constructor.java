package Class;

class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int GetAge(){
        System.out.println("age is " + this.age);
        return age;
    }

    public String GetName(){
        System.out.println("name is " + this.name);
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person dai = new Person(27, "daizhongyu");

        int age = dai.GetAge();
        String name = dai.GetName();

        System.out.println("get age is " + age);
        System.out.println("get name is " + name);
    }
}
