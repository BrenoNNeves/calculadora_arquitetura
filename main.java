import java.util.Scanner;
import java.lang.Package;
import controler.Soma;
import controler.Subtrai;
import controler.Divisao;
import controler.Multiplica;


public class Main
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
                Soma S = new Soma();
                res = S.somaNum(n1, n2);
            break;
            case "-":
                Subtrai Su = new Subtrai();
                res = Su.subtraiNum(n1, n2);
            break;
            case "*":
                Multiplica M = new Multiplica();
                res = M.multNum(n1, n2);
            break;
            case "/":
                Divisao D = new Divisao();
                res = D.divideNum(n1, n2);
            break;
            default:
                System.out.println("Simbolo da operacao nao reconhecida.");
                System.exit(0);
                break;
        }

        System.out.println(res); 
        
    }    
}
