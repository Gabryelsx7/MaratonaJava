package academy.dev.dojo.maratonajava.javacore.ZZKjunit.dominio;

public class Developer extends Employee{
    private String mainLangague;

    public Developer(String id, String mainLangague) {
        super(id);
        this.mainLangague = mainLangague;
    }

    public String getMainLangague() {
        return mainLangague;
    }
}
