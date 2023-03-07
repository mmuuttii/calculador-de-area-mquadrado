import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		
		double a,l,c,p,Total ;
		
		
		System.out.println("informe a largura: ");
		l = sc.nextDouble();
		System.out.println(l);
		
		System.out.println("informe o comprimento");
		c = sc.nextDouble();
		System.out.println(c);
		
		a = l* c;
		System.out.println("sua área é de : ");
		System.out.println(a);
		
		System.out.println("para saber o valor  da área total indique o valor o m quadrado");
		p = sc.nextDouble();
		
		Total = p*a;
		
		System.out.println("o valor total é " + Total);
	
		sc.close();
		
		
				
		
	
	}

}
