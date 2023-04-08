package CADASTRO_DE_PESSOAS;

import java.util.Scanner;

public class Teste_Cadastro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean verificaMenu = false;
		Cadastro_Pessoas cp = new Cadastro_Pessoas(1);
		
		
		do {
			menu();
			int menu  = scanner.nextInt();
			switch (menu) {
			case 1: 
				System.out.println("Digite o nome, idade e data de nascimento");
				Pessoas p = new Pessoas(scanner.next(),scanner.nextInt(),scanner.next());
				cp.add(p);
				break;
			case 2:
				System.out.println("digite o numero da pessoa que deseja excluir");
				cp.excluir(scanner.nextInt());
				break;
			case 3:
				
				System.out.println("Digite o nome, idade e data de nascimento");
				Pessoas p1 = new Pessoas(scanner.next(),scanner.nextInt(),scanner.next());
				System.out.println("digite o index da pessoa");				
				cp.editar(scanner.nextInt(), p1);
				break;
			case 4: 
				cp.exibir();
				break;
			case 5:
				System.out.println("...");
				verificaMenu = true;
			default:
				System.out.println("Invalido");
				
			}
			
			
		}while(verificaMenu != true);
		
		
	}
	public static void menu() {
		System.out.println("1 - Add pessoa");
		System.out.println("2- excluir");
		System.out.println("3 - editar");
		System.out.println("4 - listar");
		System.out.println("5 - sair");
	}
}
