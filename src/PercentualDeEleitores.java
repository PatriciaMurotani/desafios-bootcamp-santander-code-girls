/* Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcule e imprima o percentual que cada um representa em relação ao total de eleitores.

Exemplo 1
Entrada	              Saída
1000                   Brancos: 10%
100                    Nulos: 15%
150                    Validos: 75%
750

Exemplo 2
Entrada	               Saída
5000                    Brancos: 26%
1300                    Nulos: 10%
500                     Válidos: 64%
3200
 */

import java.util.Scanner;

public class PercentualDeEleitores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int habitantes = input.nextInt();
        int brancos = input.nextInt();
        int nulos = input.nextInt();
        int validos = input.nextInt();

        int pBrancos = (brancos * 100) / habitantes;
        int pNulos = (nulos * 100) / habitantes;
        int pValidos = (validos * 100) / habitantes;

        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");
    }
}
