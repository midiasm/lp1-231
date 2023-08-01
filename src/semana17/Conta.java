package semana17;

public class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public Conta(int numero, LocalDate dataAbertura){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        saldo = 1000;
        tarifa = 10;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void calcularTarifa(double){
        return tarifa;
    }
}


