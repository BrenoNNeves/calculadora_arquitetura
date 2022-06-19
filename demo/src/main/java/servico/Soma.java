package demo.src.main.java.servico;
import demo.src.main.java.extend.extdCalc;
import demo.src.main.java.interfaces.interfaceCal;

public class Soma extends extdCalc implements interfaceCal
{
    double resultDiv;
    @Override
    public double cal() {
        resultDiv = n1+n2;
        return resultDiv;
    }
}

