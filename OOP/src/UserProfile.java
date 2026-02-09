class User{
    String name;
    int age;

    public void sayHello(){
        System.out.println("Hi, my name is " + name + " , I'm " + age + " y.o.");
    }
}

public class UserProfile {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Ruslan";
        user1.age = 19;

        User user2 = new User();
        user2.name = "Aleksandra";
        user2.age = 17;


        user1.sayHello();
        user2.sayHello();
    }
}