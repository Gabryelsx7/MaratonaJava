package academy.dev.dojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClasseTest02 {
    private final String name = "Midoriya";

    void print(final String parametro) {
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(parametro);
                System.out.println(name);
                System.out.println(name + " " + lastName);
            }
        }
    }

    public static void main(String[] args) {
        OuterClasseTest02 outerClasseTest02 = new OuterClasseTest02();

    }
}
