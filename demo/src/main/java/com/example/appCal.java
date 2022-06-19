package demo.src.main.java.com.example;
import java.util.Scanner;
import java.lang.Package;

import demo.src.main.java.servico.Divisao;
import demo.src.main.java.servico.Multiplica;
import demo.src.main.java.servico.Soma;
import demo.src.main.java.servico.Subtrai;


public class appCal
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        int n1,n2;
        int res = 0;
        String op = new String();


        System.out.println("Digite o primeiro número:");
        n1 = ler.nextInt();
        System.out.println("Digite a operacao (+, -, * ou /):");
        op = ler.next();
        System.out.println("Digite o segundo número:");
        n2 = ler.nextInt();

        switch (op)
        {
            case "+":
                Soma calc = new Soma();
                calc.n1 = n1;
                calc.n2 = n2;
                
            break;
            case "-":
                Subtrai calc = new Subtrai();
                calc.n1 = n1;
                calc.n2 = n2;
            break;
            case "*":
                Multiplica calc = new Multiplica();
                calc.n1 = n1;
                calc.n2 = n2;
            break;
            case "/":
                Divisao calc = new Divisao();
                calc.n1 = n1;
                calc.n2 = n2;
            break;
            default:
                System.out.println("Simbolo da operacao nao reconhecida.");
                System.exit(0);
                break;
        }

        System.out.println(res); 
        
    }    
}
