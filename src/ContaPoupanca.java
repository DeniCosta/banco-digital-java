
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	protected static double saldo;
    protected static double taxa;
    protected static int tempo;

	public void rendimento() {
    }

    public void rendimento(double saldo, double taxa, int tempo) {
        ContaPoupanca.saldo = saldo;
        ContaPoupanca.taxa = taxa;
        ContaPoupanca.tempo = tempo;
    }
	
    public double getsaldo() {
        return saldo;
    }
	
    public void setSaldo(double saldo) {
        ContaPoupanca.saldo = saldo;
    }
	
    public double getTaxa() {
        return taxa;
    }
	
    public void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }
	
    public static int getTempo() {
        return tempo;
    }
	
    public void setTempo(int tempo) {
        ContaPoupanca.tempo = tempo;
    }
	
    public static double calcularRendimento(){
        return saldo* Math.pow(1+taxa,tempo);
    }
	
    public static double calcularJuros(){
        return (calcularRendimento()-saldo);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		System.out.println("Rendimento em ["+ContaPoupanca.getTempo()+"] dias: R$[" + ContaPoupanca.calcularJuros()+ "]");
		System.out.println("Saldo Total R$[" + ContaPoupanca.calcularRendimento() + "]");
        
	}
}
