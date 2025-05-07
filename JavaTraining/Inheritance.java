package JavaTraining;

//single inheritance
class Animal{
    void eat(){
        System.out.println("Eatt");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barkk");
    }
}
//multilevel inheritance
class Puppy extends Dog{
    void cry(){
        System.out.println("cry");
    }
}
//hierarchial inheritance
class Cat extends Animal{
    void meow(){
        System.out.println("Meowww!!!");
    }
}

    public class Inheritance {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.cry();
        Cat obj1 = new Cat();
        obj1.meow();
    }
    
}
