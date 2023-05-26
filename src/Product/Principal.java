package Product;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String chose, text, textLimpo;
        boolean tri;
        int sum;

        System.out.println("Bem-vindo ao Contador de Palavras:");
        System.out.println("Digite um texto e diremos quantas palavras existem!");
        System.out.println();

        sum = 0;

        while (true) {
            System.out.println("Deseja começar (s/n)?");
            chose = sc.next().toLowerCase();

            if (chose.equals("s") || chose.equals("sim")) {
                tri = false;
                sc.nextLine(); 

                System.out.println("Informe o texto:");
                text = sc.nextLine();

                textLimpo = text.trim().replaceAll("\\s+", " ");

                String[] palavras = textLimpo.split(" ");

                sum = palavras.length;
              
                break;
               
            } else if (chose.equals("n") || chose.equals("não") || chose.equals("nao")) {
                tri = false;
                System.out.println("Obrigado por particcipar :D");
                break;
            } else {
                System.out.println("Opção inválida. Informe 's' para começar ou 'n' para sair.");
                System.out.println("------------------");
            }
        }
        
        System.out.println("Número de palavras: " + sum);
        
        System.out.println("Você deseja continuar ? ");
        chose = sc.next();
        
        while (true) {
            System.out.println("Deseja começar (s/n)?");
            chose = sc.next().toLowerCase();

            if (chose.equals("s") || chose.equals("sim")) {
                tri = false;
                sc.nextLine(); 

                System.out.println("Informe o texto:");
                text = sc.nextLine();

                textLimpo = text.trim().replaceAll("\\s+", " ");

                String[] palavras = textLimpo.split(" ");

                sum = palavras.length;
                		
                break;
            } else if (chose.equals("n") || chose.equals("não") || chose.equals("nao")) {
                tri = false;
                System.out.println("Obrigado por particcipar :D");
                break;
            } else {
                System.out.println("Opção inválida. Informe 's' para começar ou 'n' para sair.");
                System.out.println("-----------------------");
            }
        }
    }
}
