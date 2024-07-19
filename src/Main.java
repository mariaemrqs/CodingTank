import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salariosBrutos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digitar o salário bruto do funcionário " + (i + 1) + ": ");
            salariosBrutos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            double salarioBruto = salariosBrutos[i];
            double inss;
            double impostoRenda;
            double salarioLiquido;

            if (salarioBruto <= 1212.00) {
                inss = salarioBruto * 0.075;
            } else if (salarioBruto <= 2427.35) {
                inss = salarioBruto * 0.09;
            } else if (salarioBruto <= 3641.03) {
                inss = salarioBruto * 0.12;
            } else {
                inss = salarioBruto * 0.14;
            }

            if (salarioBruto <= 1903.98) {
                impostoRenda = 0;
            } else if (salarioBruto <= 2826.65) {
                impostoRenda = salarioBruto * 0.075;
            } else if (salarioBruto <= 3751.05) {
                impostoRenda = salarioBruto * 0.15;
            } else if (salarioBruto <= 4664.68) {
                impostoRenda = salarioBruto * 0.225;
            } else {
                impostoRenda = salarioBruto * 0.275;
            }

            salarioLiquido = salarioBruto - inss - impostoRenda;

            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.printf("Salário Bruto: R$ %.2f", salarioBruto);
            System.out.println();
            System.out.printf("Desconto INSS: R$ %.2f", inss);
            System.out.println();
            System.out.printf("Desconto Imposto de Renda: R$ %.2f", impostoRenda);
            System.out.println();
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
            System.out.println();
        }

        sc.close();
    }
}