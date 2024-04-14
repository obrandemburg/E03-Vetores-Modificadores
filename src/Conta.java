public class Conta {

    private Cliente informacoes_Cliente = new Cliente();

    Operacao[] operacoes = new Operacao[1000];
    private double saldo;
    private double limite;
    private int numero;
    //private String agencia; deixei comentado por não estar sendo usado
    private int indice_Operador = 0;

    public int getIndice_Operador(){

        return this.indice_Operador;
    }

    void setConta(String cliente_Info, double saldo, double limite, int numero){
        this.informacoes_Cliente.Nome = cliente_Info;
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }


    public void sacar(double valor){

        operacoes[indice_Operador] = new Operacao('s', valor);
        this.indice_Operador++;
        this.saldo -= valor;
    }
    public void depositar(double valor){

        operacoes[indice_Operador] = new Operacao('d', valor);
        this.indice_Operador++;
        this.saldo += valor;
    }

     void imprimir(){

        System.out.println("Nome do dono: " + informacoes_Cliente.Nome);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("\n");

    }

}
