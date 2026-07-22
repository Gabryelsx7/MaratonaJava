package academy.dev.dojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private final String name;
    private final TipoCliente tipoCliente;
    private final TipodePagamento tipodePagamento;

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
