package MaratonaJava.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClasseTest01 {
    private String  name =  "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClasseTest01.this);// Objeto mais Interno
        }
    }
    public static void main(String[] args) {
        OuterClasseTest01 outerClasseTest01 = new OuterClasseTest01();
        Inner inner1 = outerClasseTest01.new Inner();
        Inner inner2 = new OuterClasseTest01().new Inner();
        inner1.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
