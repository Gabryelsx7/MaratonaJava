package academy.dev.dojo.maratonajava.javacore.ZZAclassesinternas.test;


class Animal {
    public void walk() {
        System.out.println("ANIMAL WALKING");
    }
}

public class AnonymosClassesTest01 {
    static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
