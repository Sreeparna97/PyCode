class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Parent extends Person {
    private int numChildren;

    public Parent(String name, int age, int numChildren) {
        super(name, age);
        this.numChildren = numChildren;
    }

    public void displayNumChildren() {
        System.out.println("I have " + numChildren + " children.");
    }
}

class Child extends Person {
    private String hobby;

    public Child(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public void displayHobby() {
        System.out.println("My hobby is " + hobby + ".");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent parent = new Parent("John", 40, 2);
        parent.introduce();
        parent.displayNumChildren();

        Child child = new Child("Emily", 10, "Painting");
        child.introduce();
        child.displayHobby();
    }
}

