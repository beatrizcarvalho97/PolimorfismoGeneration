package Veiculo;

public abstract class Veiculo {

	private int pesoKg;
	private int velocMaxKmH;
	private int precoRs;
	
	public int getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	public int getVelocMaxKmH() {
		return velocMaxKmH;
	}
	public void setVelocMaxKmH(int velocMaxKmH) {
		this.velocMaxKmH = velocMaxKmH;
	}
	public int getPrecoRs() {
		return precoRs;
	}
	public void setPrecoRs(int precoRs) {
		this.precoRs = precoRs;
	}
	
	public void EntrVeic() {};
	
	public void MostrVeic() {};
	
}
