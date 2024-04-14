public class Main {

    public static void main (String[] args){

        Conta conta1 = new Conta();

        conta1.setConta("Matheus Brandemburg", 2090.90, 10000.00, 2023952594);


        Conta conta2 = new Conta();

        conta2.setConta("Ana Silva", 3500.75, 5000.00, 1029384756);

        conta1.depositar(100.00);
        conta1.depositar(1123.00);
        conta1.depositar(20.00);
        conta1.depositar(203.00);
        conta1.sacar(563.00);


        conta2.sacar(23.00);
        conta2.depositar(123.00);
        conta2.depositar(340.00);
        conta2.depositar(38.00);
        conta2.sacar(287.00);

        conta1.imprimir();
        conta2.imprimir();

        for (int i = 0; i < conta1.getIndice_Operador(); i++){
            conta1.operacoes[i].imprimir_Estrato();
        }
        System.out.println("\n");
        for (int i = 0; i < conta2.getIndice_Operador(); i++){
            conta2.operacoes[i].imprimir_Estrato();
        }


    }
}
