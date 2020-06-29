package Veiculo;

public class Caminhao extends Veiculo{

	private int CargaMaximaTon;
	
	private int AlturaMax;
	
	private int Comprimento;

	public int getCargaMaximaTon() {
		return CargaMaximaTon;
	}

	public void setCargaMaximaTon(int cargaMaximaTon) {
		CargaMaximaTon = cargaMaximaTon;
	}

	public int getAlturaMax() {
		return AlturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		AlturaMax = alturaMax;
	}

	public int getComprimento() {
		return Comprimento;
	}

	public void setComprimento(int comprimento) {
		Comprimento = comprimento;
	}
	
	public void MostrCam() {
		System.out.println("O caminhão Mercedez 4160 SLT pesa "+getPesoKg()+"Kg, pode transportar até "+getCargaMaximaTon()+"Toneladas, possui uma altura máxima de "+getAlturaMax()+"m, seu preço é de R$"+getPrecoRs()+" e sua velocidade máxima é de "+getVelocMaxKmH()+"Km/H.");
		
	}
}