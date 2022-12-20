package model;

public class Calculadora {

    private double n1;
    private double n2;
    private double result;

    public double soma (){
        return (n1+n2);
    }
    public double sub (){
        return (n1-n2);
    }
    public double mult (){
        return (n1*n2);
    }
    public double div (){
        if (n2 == 0){
            System.out.println("Número inválido !! Digite novamente");
        } else{
            result = (n1/n2);
        }
        return result;
    }
    public  double pot (){
        return Math.pow(n1,n2);
    }

}