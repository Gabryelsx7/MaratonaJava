package academy.dev.dojo.maratonajava.javacore.Kenum.test;

import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipodePagamento;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipodePagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipodePagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipodePagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente1);
    }
}