package controler;
public class Subtrai
{
    int result;
    public int subtraiNum(int n1, int n2){
        if (n1>n2){
            result = n1 - n2;
        }else{
            result = n2 - n1;
        }
        return result;
    }


}