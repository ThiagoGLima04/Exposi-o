package projetoswing.licoesdeula;
import java.util.Scanner;

	int opcao;
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o primeiro numero")
	   int num1 = scanner.nextInt();
	   System.out.println("Digite o segundo numero")
	   int num2 = scanner.nextInt();

public class IfElse {
	public static void menu(String[] args){
        System.out.println("calculara diferenciada");
        System.out.println("1. soma");
        System.out.println("2. subtrair");
        System.out.println("3. multiplicao");
        System.out.println("4. divisao");
	System.out.println("Digite a opcao de 1 a 4:");
		
            menu();
            opcao = entrada.nextInt();
			
			 switch(opcao){
            case 1:
                soma();
                break;
                
            case 2:
                subtrair();
                break;
                
            case 3:
                multiplicacao();
                break;
                
            case 4:
			 divisao();
			 break;
			 
		     default:
             System.out.println("Opção inválida.");
            }
	    while(opcao != 0);
		}
		
		
		{if (opcao == 1);
			 System.out.println("resultado" + (num1 + num2));
			 
			 if (opcao == 2);
			 System.out.println("resultado" + (num1 - num2));
			 
			 if (opcao == 3);
			 System.out.println("resultado" + (num1 * num2));
			 
			 if (opcao == 4);
		System.out.println("resultado" + (num1 / num2));
  
			 
}			 