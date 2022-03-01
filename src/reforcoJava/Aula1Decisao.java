package reforcoJava;

import java.util.Scanner;

public class Aula1Decisao {
	public static void main (String args[]) {
		//saida de dados e entrada simples
		String varNome;
		int varIdade, corOpcao;
				
		//Orienta��o do tipo de dado para entrada
		System.out.println("Por favor, digite seu nome:");
		
		//declarar scanner para receber o valor digitado
		Scanner leia = new Scanner(System.in);
		
		varNome = leia.next();
		System.out.println("Por favor, digite sua idade:");
		varIdade = leia.nextInt();  
		
		
		System.out.println("******Escolha a sua cor preferida:*********");
		System.out.println("1 -> Digite 1 para Azul;");
		System.out.println("2 -> Digite 2 para Rosa;");
		System.out.println("3 -> Digite 3 para Vermelho;");
		System.out.println("4 -> Digite 4 para Roxo;");
		System.out.println("5 -> Digite 5 para Preto;");
		System.out.println("6 -> Digite 6 para Branco;");
		
		corOpcao = leia.nextInt();
		leia.close();
		//concatenar valores com sinal +
		System.out.println("O nome �: "+varNome+" a idade �: "+varIdade);
		
		//usando printf
		System.out.printf("A idade �: %d o nome � %s \n",varIdade,varNome);
		
		//if com apenas uma linha de resposta caso true, sem as chaves
		if(varIdade >= 17) System.out.println("Voc� j� tem mais de 17 anos");
		
		//if com as chaves-> bloco de instru��es com op��es de if else e else
		if(varNome.length() < 4 ) {
			System.out.println("O seu nome � bem curto, Possui apenas 3 letras");
		}
		else if(varNome.length() >=4 && varNome.length()<6) {
			System.out.println("O seu nome tem: "+ varNome.length() + " Caracteres");
		}
		else {
			System.out.println("O nome � bem longo e possui " + varNome.length() + " Caracteres");
		}
		
		
		switch (corOpcao) {
			case(1):
				System.out.println("Voc�s escolheu Azul");
				break;
			case(2):
				System.out.println("Voc�s escolheu Rosa");
				break;
			case(3):
				System.out.println("Voc�s escolheu Vermelho");
				break;
			case(4):
				System.out.println("Voc�s escolheu Roxo");
				break;
			case(5):
				System.out.println("Voc�s escolheu Preto");
				break;
			case(6):
				System.out.println("Voc�s escolheu Branco");
				break;
				
			default :
				System.out.println("Op��o de cor � inv�lida");
		}
		
		
	}

}
