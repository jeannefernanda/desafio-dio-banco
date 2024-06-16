public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        Conta cc = new ContaCorrente(venilton);
        cc.depositar(100);
        Conta poupança = new ContaPoupanca(venilton);
        cc.transferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
