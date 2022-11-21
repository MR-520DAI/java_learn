public class transfer {
    public static void setNum(int  num) {
		num  = 99;
    }
    public static void setPersonName(Person p) {
        p.setName("dai");
    }
    public static void main(String[]args)
    {
        int num = 10;
        setNum(num);
        System.out.println(num);

        Person person = new Person("Dai",27);
        setPersonName(person);
        System.out.println(person.name);
    }
}

class Person {
	String name ;
	int age ;
	
	Person(){
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public String toString() {
		return "姓名: "+name +",年龄:"+age;
	}
	
}