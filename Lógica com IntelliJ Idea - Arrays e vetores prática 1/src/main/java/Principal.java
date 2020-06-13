import java.lang.reflect.Array;

/**
 * @author matheus lippert
 */
public class Principal {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "vitor";
        nomes[1] = "fernanda";
        nomes[2] = "murilo";

//        for (int indice = 0 ; indice < nomes.length ; indice++) {
//            System.out.println(nomes[indice]);
//        }
//
//        for(String nome : nomes) {
//            System.out.println(nome);
//        }

        String[] nomess = {"nilza", "mauricio", "paulo"};
//
//        for(int indice = 0 ; indice < nomess.length ; indice++) {
//            System.out.println(nomess[indice]);
//        }

        Array.set(nomess, 2, "paulinho");
//
//        for(String nome : nomess) {
//            System.out.println(nome);
//        }

        int[] numeros = new int[3];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 50;

//        System.out.println("primeira posicao: " + numeros[0]);

//        for(int indice = 0 ; indice < numeros.length ; indice++) {
//            System.out.println(numeros[indice]);
//        }
//
//        for (int numero : numeros) {
//            System.out.println(numero);
//        }

        int[] [] matriz = new int [3] [3];

        matriz[0] [0] = 1;
        matriz[0] [1] = 1;
        matriz[0] [2] = 1;

        matriz[1] [0] = 2;
        matriz[1] [1] = 2;
        matriz[1] [2] = 2;

        matriz[2] [0] = 3;
        matriz[2] [1] = 3;
        matriz[2] [2] = 3;

//        for(int linha = 0 ; linha < 3 ; linha++) {
//            for(int coluna = 0 ; coluna < 3 ; coluna++) {
//                matriz[linha][coluna] = 0;
//            }

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                if(linha == coluna) {
                    matriz[linha][coluna] = 1 ;
                } else  {
                matriz[linha][coluna] = 0 ;
            }
            System.out.println("\n");