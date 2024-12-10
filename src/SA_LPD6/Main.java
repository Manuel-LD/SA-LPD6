package SA_LPD6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String input = entrada.nextLine();

        StringBuilder inverso = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            inverso.append(input.charAt(i));
        }

        System.out.println("El texto invertido es: " + inverso);
        entrada.close();
    }
}
