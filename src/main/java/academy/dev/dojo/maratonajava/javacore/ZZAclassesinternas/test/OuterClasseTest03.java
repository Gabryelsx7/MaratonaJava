package academy.dev.dojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClasseTest03 {
    private final String name = "Zoro";

    static class Nested {

        private final String lastaName = "One piece";

        void print() {

            System.out.println(new OuterClasseTest03().name + " " + lastaName);
        }
    }

    static void main(String[] args) {
        Nested nested = new Nested();

        nested.print();
    }
}
