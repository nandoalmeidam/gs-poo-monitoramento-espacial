package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.model.*;

//Classe principal responsável pela execução do sistema
public class SistemaMonitoramento {

	public static void main(String[] args) {
		// Objeto utilizado para leitura das opções do usuário
		Scanner scanner = new Scanner(System.in);

		// Criação dos dados da missão
		DadosMissao missao = new DadosMissao("Órbita Baixa Terrestre", 1234, 85.5, 4);

		// Criação dos sensores da missão
		SensorTemperatura sensorTemp = new SensorTemperatura(1, "Sensor Temperatura", "Ativo");
		SensorPressao sensorPressao = new SensorPressao(2, "Sensor Pressão", "Ativo");
		SensorRadiacao sensorRadiacao = new SensorRadiacao(3, "Sensor Radiação", "Ativo");

		// Criação dos sistemas de propulsão
		PropulsaoQuimica propulsaoQuimica = new PropulsaoQuimica("Química", "Ativa", 80, 65);
		PropulsaoEletrica propulsaoEletrica = new PropulsaoEletrica("Elétrica", "Ativa", 70, 90);

		// Variável utilizada para armazenar a opção escolhida
		int opcao;

		// Loop principal do sistema
		do {
			// Exibição do menu principal
			System.out.println("\n=== MONITORAMENTO ESPACIAL ===");
			System.out.println("1 - Ler sensores");
			System.out.println("2 - Exibir dados da missão");
			System.out.println("3 - Exibir propulsão");
			System.out.println("4 - Verificar alertas");
			System.out.println("5 - Sair");

			// Leitura da opção escolhida pelo usuário
			opcao = scanner.nextInt();

			// Controle das funcionalidades do sistema
			switch (opcao) {

			// Exibe os valores lidos pelos sensores
			case 1:
				System.out.println("Sensor de Temperatura: " + sensorTemp.lerValor() + "°C");
				System.out.println("Sensor de Pressão: " + sensorPressao.lerValor() + "kPa");
				System.out.println("Sensor de Radiação: " + sensorRadiacao.lerValor() + "mSv");
				break;

			// Exibe os dados da missão mediante código de acesso
			case 2:
				System.out.println("Digite o código de acesso: ");
				int codigo = scanner.nextInt();
				if (codigo == missao.getCodigoDeAcesso()) {
					System.out.println("Coordenada: " + missao.getCoordenadas(codigo));
					System.out.println("Combustível: " + missao.getNivelCombustivel() + "%");
					System.out.println("Quantidade de Tripulantes: " + missao.getNumeroTripulantes());
				}
				break;

			// Exibe informações das propulsões da nave
			case 3:
				propulsaoQuimica.acelerar();
				System.out.println("Empuxo: " + propulsaoQuimica.calcularEmpuxoGerado() + "kN");
				System.out.println("Combustível: " + propulsaoQuimica.getNivelCombustivel() + "%");
				System.out.println();
				propulsaoEletrica.acelerar();
				System.out.println("Empuxo: " + propulsaoEletrica.calcularEmpuxoGerado() + "kN");
				System.out.println("Bateria: " + propulsaoEletrica.getNivelBateria() + "%");
				break;

			// Verifica possíveis alertas da missão
			case 4:
				System.out.println("Alerta: ");
				// Verifica temperatura crítica
				if (sensorTemp.lerValor() > 50) {
					System.out.println("ATENÇÃO: Temperatura elevada!");
				}
				// Verifica pressão crítica
				if (sensorPressao.lerValor() > 100) {
					System.out.println("ALERTA: Pressão elevada!");
				}
				// Verifica radiação crítica
				if (sensorRadiacao.lerValor() > 500) {
					System.out.println("CRÍTICO: Radiação elevada!");
				}
				// Verifica combustível da missão
				missao.verificarCombustivel();
				break;

			// Encerra o sistema
			case 5:
				System.out.println("Sistema encerrado.");
				break;

			// Tratamento para opções inválidas
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 5);

	}

}
