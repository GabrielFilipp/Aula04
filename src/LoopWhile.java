import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual é a melhor forma de
		 * calcular essa média?
		 */

		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		int i = 0;
		int qtd;
		int soma = 0, media;
		
		System.out.println("Quantos alunos existem nessa escola ? ");
		qtd = leitor.nextInt();
		
		while (i < qtd) {
			System.out.print("Digite a idade do aluno(" + (i + 1) + "º) : ");
			idade = leitor.nextInt();
			soma += idade;
			i++;
		}
		media = soma / qtd;

		System.out.println("A média de idades dos alunos é: " + media);
		leitor.close();

	}

}
