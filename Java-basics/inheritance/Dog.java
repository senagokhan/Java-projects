package inheritance;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("I am barking");
    }

    public void fetch(){
        System.out.println("fetch is so funny");
    }
}