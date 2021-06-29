import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */

		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		int i = 0;
		int qtd;
		int soma = 0, media;
		
		System.out.println("Quantos alunos existem nessa escola ? ");
		qtd = leitor.nextInt();
		
		while (i < qtd) {
			System.out.print("Digite a idade do aluno(" + (i + 1) + "�) : ");
			idade = leitor.nextInt();
			soma += idade;
			i++;
		}
		media = soma / qtd;

		System.out.println("A m�dia de idades dos alunos �: " + media);
		leitor.close();

	}

}
