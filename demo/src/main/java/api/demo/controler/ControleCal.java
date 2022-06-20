package demo.src.main.java.api.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.src.main.java.operacao.Divisao;
import demo.src.main.java.operacao.Multiplica;
import demo.src.main.java.operacao.Soma;
import demo.src.main.java.operacao.Subtrai;

@RestController
@RequestMapping(value = "/api/calculo")
public class ControleCal {
    
    

    @GetMapping("/subitrair/{n1}/{n2}")
    public double CalculaSub(@PathVariable(value = "n1") double n1,
                              @PathVariable(value = "n2") double n2){
        
        Subtrai calc = new Subtrai();
        calc.n1 = n1;
        calc.n2 = n2;
        
        return calc.cal();
    }

    

    @GetMssapping("/divisao/{n1}/{n2}")
    public double CalculaDiv(@PathVariable(value = "n1") double n1,
                              @PathVariable(value = "n2") double n2){
        
        Divisao calc = new Divisao();
        calc.n1 = n1;
        calc.n2 = n2;
        
        return  calc.cal();

    }

    @GetMapping("/soma/{n1}/{n2}")
    public double CalculaSoma(@PathVariable(value = "n1") double n1,
                              @PathVariable(value = "n2") double n2){
        
        Soma calc = new Soma();
        calc.n1 = n1;
        calc.n2 = n2;
        
        return calc.cal();
    }
    
    @GetMapping("/multiplicar/{n1}/{n2}")
    public double CalculaMult(@PathVariable(value = "n1") double n1,
                              @PathVariable(value = "n2") double n2){
        
        Multiplica calc = new Multiplica();
        calc.n1 = n1;
        calc.n2 = n2;
        
        return calc.cal();
    }
    
}
