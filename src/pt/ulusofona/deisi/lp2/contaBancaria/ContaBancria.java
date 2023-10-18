package pt.ulusofona.deisi.lp2.contaBancaria;



public class contaBancaria {
    private int saldo;

    public contaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposita(int valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean levanta(int valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String getSaldoComoString() {
        return String.valueOf(saldo);
    }

    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria(1000);
        System.out.println("Saldo Inicial: " + conta.getSaldoComoString());

        conta.deposita(500);
        System.out.println("Depósito de 500: Saldo Atual: " + conta.getSaldoComoString());

        boolean sucesso = conta.levanta(300);
        if (sucesso) {
            System.out.println("Levantamento de 300: Saldo Atual: " + conta.getSaldoComoString());
        } else {
            System.out.println("Não foi possível levantar 300. Saldo Atual: " + conta.getSaldoComoString());
        }
    }
}
