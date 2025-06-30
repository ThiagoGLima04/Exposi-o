class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$" + valor);
    }
}

class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorIngressoVIP() {
        return valor + valorAdicional;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do ingresso: " + localizacao);
    }
}

class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValorIngressoCamaroteSuperior() {
        return getValorIngressoVIP();
    }
}

public class TesteIngresso {
    public static void main(String[] args) {
        Normal ingressoNormal = new Normal(50.0);
        ingressoNormal.imprimeValor();
        ingressoNormal.imprimeTipo();
        System.out.println();

        CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 50.0, "Setor A");
        camaroteInferior.imprimeValor();
        System.out.println("Valor do ingresso do camarote inferior: R$" + camaroteInferior.getValorIngressoVIP());
        camaroteInferior.imprimeLocalizacao();
        System.out.println();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 100.0);
        camaroteSuperior.imprimeValor();
        System.out.println("Valor do ingresso do camarote superior: R$" + camaroteSuperior.getValorIngressoCamaroteSuperior());
    }
}