//1. Crie uma função chamada calculo, com retorno double/real e que receba dois parâmetros double/real. Quando num1 for maior que num2, ela deve retornar a multiplicação dos dois. Quando o num1 for menor que num2, deve-se retornar a divisão entre os dois. Quando eles forem iguais, deve-se retornar a soma deles.
import java.util.Scanner;
public class ex12BIM{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double val1, val2;
        System.out.println("Insira o primeiro valor: ");
        val1 = s.nextDouble();
        System.out.println("Insira o segundo valor: ");
        val2 = s.nextDouble();
        System.out.print("calculo: " + calculo(val1, val2));
    }
    public static double calculo(double num1, double num2){
        if(num1 > num2){
return num1*num2;
        }else if(num2 > num1){
return num1 / num2;
        }else{
return num1 + num2;
        }
    }
}

