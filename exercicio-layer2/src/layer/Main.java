package layer;
import model.Conta;
import model.Operacao;
import service.OperacaoService;
import service.ContaService;
import model.Conta;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		OperacaoService serviceOperacao = new OperacaoService();
		ContaService service = new ContaService();
		Conta novaConta = new Conta();
		int indice;
		float valor;
		
		System.out.println("Digite seu nome: ");		
		novaConta.Nome = leitor.next(); 
		
		System.out.println("Digite seu CPF: ");
		novaConta.CPF = leitor.next();
		
		System.out.println("Digite sua agencia: ");
		novaConta.Agencia = leitor.nextInt();
		
		System.out.println("Digite sua conta: ");
		novaConta.Conta = leitor.nextInt();
		
		
		System.out.println("Conta adicionada com sucesso.");
		System.out.println("-------------------------");
		System.out.println("Infos da Conta.:  \nNome: "+ novaConta.Nome + "\nCPF: "+novaConta.CPF+"\nAgencia: "+novaConta.Agencia+"\nConta: "+novaConta.Conta+"\nSaldo: "+novaConta.Saldo);
		
		Operacao operacao = new Operacao();
		System.out.println("Digite o Indice Da conta Conta Destino:");
		operacao.IndiceDestino = leitor.nextInt();
		
		System.out.println("Digite o Indice Da conta Conta Origem:");
		operacao.IndiceOrigem = leitor.nextInt();
		
		System.out.println("Digite o Valor A ser Transferido:");
		operacao.Valor = leitor.nextDouble();
		
		
	}

}
