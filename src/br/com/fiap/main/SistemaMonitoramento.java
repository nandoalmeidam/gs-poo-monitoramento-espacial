package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.model.*;

public class SistemaMonitoramento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Dados da missão
		DadosMissao missao = new DadosMissao("Órbita Baixa Terrestre", 1234, 85.5, 4);

		// Sensores
		SensorTemperatura sensorTemp = new SensorTemperatura(1, "Sensor Temperatura", "Ativo");
		SensorPressao sensorPressao = new SensorPressao(2, "Sensor Pressão", "Ativo");
		SensorRadiacao sensorRadiacao = new SensorRadiacao(3, "Sensor Radiação", "Ativo");

		// propulsões
		PropulsaoQuimica propulsaoQuimica = new PropulsaoQuimica("Química", "Ativa", 80, 65);
		PropulsaoEletrica propulsaoEletrica = new PropulsaoEletrica("Elétrica", "Ativa", 70, 90);

		int opcao;

		do {
			System.out.println("\n=== MONITORAMENTO ESPACIAL ===");
			System.out.println("1 - Ler sensores");
			System.out.println("2 - Exibir dados da missão");
			System.out.println("3 - Exibir propulsão");
			System.out.println("4 - Verificar alertas");
			System.out.println("5 - Sair");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Sensor de Temperatura: " + sensorTemp.lerValor() + "°C");
				System.out.println("Sensor de Pressão: " + sensorPressao.lerValor() + "kPa");
				System.out.println("Sensor de Radiação: " + sensorRadiacao.lerValor() + "mSv");
				break;

			case 2:
				System.out.println("Digite o código de acesso: ");
				int codigo = scanner.nextInt();
				if (codigo == missao.getCodigoDeAcesso()) {
					System.out.println("Coordenada: " + missao.getCoordenadas(codigo));
					System.out.println("Combustível: " + missao.getNivelCombustivel() + "%");
					System.out.println("Quantidade de Tripulantes: " + missao.getNumeroTripulantes());
				}
				break;

			case 3:
				propulsaoQuimica.acelerar();
				System.out.println("Empuxo: " + propulsaoQuimica.calcularEmpuxoGerado() + "kN");
				System.out.println("Combustível: " + propulsaoQuimica.getNivelCombustivel() + "%");
				System.out.println();
				propulsaoEletrica.acelerar();
				System.out.println("Empuxo: " + propulsaoEletrica.calcularEmpuxoGerado() + "kN");
				System.out.println("Bateria: " + propulsaoEletrica.getNivelBateria() + "%");
				break;

			case 4:
				System.out.println("Alerta: ");
				if (sensorTemp.lerValor() > 50) {
					System.out.println("ATENÇÃO: Temperatura elevada!");
				}
				if (sensorPressao.lerValor() > 100) {
					System.out.println("ALERTA: Pressão elevada!");
				}
				if (sensorRadiacao.lerValor() > 500) {
					System.out.println("CRÍTICO: Radiação elevada!");
				}
				missao.verificarCombustivel();
				break;

			case 5:
				System.out.println("Sistema encerrado.");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 5);

	}

}
