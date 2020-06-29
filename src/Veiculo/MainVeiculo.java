package Veiculo;

public class MainVeiculo {

	public void EntrVeic(Veiculo veiculo) {
		veiculo.MostrVeic();
	}

	public void EntrPass(CarroPasseio veiculo) {
		veiculo.MostrPass();
	}

	public void EntrCam(Caminhao veiculo) {
		veiculo.MostrCam();
	}

	public static void main(String[] args) {		
		
		CarroPasseio passeio = new CarroPasseio();
		passeio.setCor("Prata");
		passeio.setModelo("Fiat Toro");
		passeio.setPesoKg(1606);
		passeio.setPrecoRs(100000);
		passeio.setVelocMaxKmH(190);
		
		Caminhao truck = new Caminhao();
		truck.setCargaMaximaTon(500);
		truck.setAlturaMax(4);
		truck.setComprimento(9);
		truck.setPesoKg(15000);
		truck.setPrecoRs(500000);
		truck.setVelocMaxKmH(60);
		
		MainVeiculo apresenta = new MainVeiculo();
		
		apresenta.EntrPass(passeio);
		System.out.println("\n --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n");
		apresenta.EntrCam(truck);

	}

}
