package MaratonaJava.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serialNumeber;
    private String marca;

    public Smartphone(String serialNumeber, String marca) {
        this.serialNumeber = serialNumeber;
        this.marca = marca;
    }

    public String getSerialNumeber() {
        return serialNumeber;
    }

    public void setSerialNumeber(String serialNumeber) {
        this.serialNumeber = serialNumeber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferente de null, se x.equals(y) == true logo, y.equals(x)== true
    // Transitividade: para x, y, z diferente de null, se x.equals(y) == true logo, y.equals(z)== true
    // Consistente: x.equlas(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar falso
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumeber != null && serialNumeber.equals(smartphone.serialNumeber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumeber='" + serialNumeber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //se x.equals(y) == true, y.hascode() == x.hashcode()
    //y.hasCode() == x.hasCode não necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y) == false
    //y.hascode() != x.hascode x.equals(y) deverá ser falso.
    @Override
    public int hashCode() {
        return serialNumeber == null ? 0: this.serialNumeber.hashCode();
    }
}
