package Veiculo;

public class CarroPasseio extends Veiculo {
	
	private String cor;
	
	private String modelo;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void MostrPass() {
		System.out.println("O carro "+getModelo()+" na cor "+getCor()+" pesa "+getPesoKg()+"Kg, seu preço é de R$"+getPrecoRs()+" e sua velocidade máxima é de "+getVelocMaxKmH()+"Km/H.");
		
	}
}
