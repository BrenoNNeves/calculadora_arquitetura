import java.util.Scanner;
import java.lang.Package;
import controler.Soma;
import controler.Subtrai;
import controler.Divisao;
import controler.Multiplica;


public class main {
    int n1,n2;
    String opera;
    Scanner ler = new Scanner(System.in);
    n1 = ler.nextInt();
    n2 = ler.nextInt();
    opera = ler.nexString();

    if (opera = '+'){
        Soma S = new Soma();
        S.somaNum(n1, n2);

        }else if(opera = '/'){
            Divisao D = new Divisao();
            D.divideNum(n1, n2);
        }else if(opera = '-'){
            Subtrai S = new Subtrai();
            S.subtraiNum(n1, n2);

        }else if(opera = '*'){
            Multiplica M = new Multiplica();
            M.multNum(n1, n2);

        }

    }
}
