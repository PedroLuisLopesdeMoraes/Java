package model;

public class Calculadora {

    private double n1;
    private double n2;
    private double result;

    public double soma (double n1, double n2){
        result = n1 + n2;
        System.out.println("O resultado da soma é: "+ result);
        return result;
    }
    public double sub (double n1, double n2){
        result = n1 - n2;
        System.out.println("O resultado da subtração é: "+result);
        return result;
    }
    public double mult (double n1, double n2){
        result = n1 * n2;
        System.out.println("O resultado da multiplicação é: "+result);
        return result;
    }
    public double div (double n1, double n2){
        if (n2 == 0){
            System.out.println("Número inválido !! Digite novamente");
        } else{
            result = (n1/n2);
            System.out.println("O resultado da divisão é: "+result);
        }
        return result;
    }
    public  double pot (double n1, double n2){
        result = Math.pow(n1,n2);
        System.out.println("O resultado da potenciação é: " + result);
        return result;
    }
}