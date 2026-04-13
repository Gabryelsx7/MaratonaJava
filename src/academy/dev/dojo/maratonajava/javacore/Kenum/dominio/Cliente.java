package academy.dev.dojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String name;
    private TipoCliente tipoCliente;
    private TipodePagamento tipodePagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.valor +
                ", tipodePagamento=" + tipodePagamento +
                '}';
    }

    public Cliente(String name, TipoCliente tipoCliente, TipodePagamento tipodePagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipodePagamento = tipodePagamento;


    }
}
