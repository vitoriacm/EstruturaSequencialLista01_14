import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Peso");
        double peso = teclado.nextDouble();
        double excesso;
        double multa;

        if (peso > 50.0) {

            excesso = peso - 50;
            multa = excesso * 4.0;

            System.out.printf("Excesso de peso: %.2f kg\n", excesso);
            System.out.printf("Valor da multa a ser paga: R$ %.2f\n", multa);

        } else {

            System.out.println("Peso dentro do limite permitido.");
        }

    }
}
