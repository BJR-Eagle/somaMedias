import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declarando o scanner
        Scanner scanner = new Scanner(System.in);

        //Declarar variaveis da primeira media
        System.out.print("Digite o valor de m1: ");
        double m1 = scanner.nextDouble();

        System.out.print("Digite o valor de m2: ");
        double m2 = scanner.nextDouble();

        System.out.print("Digite o valor de m3: ");
        double m3 = scanner.nextDouble();

        //Calculando a primeira media
        double media1 = (m1+m2+m3)/3;

        //Declarar variaveis da segunda media
        System.out.print("Digite o valor de m4: ");
        double m4 = scanner.nextDouble();

        System.out.print("Digite o valor de m5: ");
        double m5 = scanner.nextDouble();

        System.out.print("Digite o valor de m6: ");
        double m6 = scanner.nextDouble();

        //Calculando a segunda media
        double media2 = (m4+m5+m6)/3;

        //Soma das medias
        double sm = media1 + media2;

        //Imprimir os resultados em tela
        System.out.println("Persian diz que a media 1 é "+media1);
        System.out.println("Persian diz que a media 2 é "+media2);
        System.out.println("Persian diz que a soma das medias 1 e 2 é "+(sm));
    }

    
}