import java.util.Locale;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("Abaixo coloque se nome, idade,salário e seu sexo");
		
		Scanner formu =  new Scanner(System.in);
		String nome;
		int idade;
		Double salario;
		char sexo;
		
		nome = formu.nextLine();
		idade = formu.nextInt();
		salario = formu.nextDouble();
		sexo = formu.next().charAt(0);
		System.out.println("Nome : " + nome);
		System.out.println("idade : " + idade);
		System.out.println("salário : "+ salario);
		System.out.println("sexo é : " + sexo);
				
		formu.close();
		
	}

}
