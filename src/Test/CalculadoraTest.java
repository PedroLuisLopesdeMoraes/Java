package Test;

import model.Calculadora;

import java.util.Objects;
import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner num = new Scanner(System.in);

        String op = null;

        while (!Objects.equals(op, "@")) {
            System.out.println("Escolha a operação (+ - / * ^ ): ");
            op = num.nextLine();
            System.out.println("Digite um número: ");
            double n1 = num.nextDouble();
            System.out.println("Digite outro número: ");
            double n2 = num.nextDouble();

            switch (op) {
                case "+" -> c.soma(n1, n2);
                case "-" -> c.sub(n1, n2);
                case "/" -> c.div(n1, n2);
                case "*" -> c.mult(n1, n2);
                case "^" -> c.pot(n1, n2);
            }
            System.out.println("------------");

        }
    }
}
