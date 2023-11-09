package calcula;

import java.util.Scanner;

public class AreaDoCUbo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do LADO: ");
            int lado = scanner.nextInt();
            
            Cubo cubo = new Cubo();
            
            System.out.println("Volume do cubo: " + cubo.volume(lado) );
            System.out.println("Área de uma face do cubo: " + cubo.areaFace(lado));
            System.out.println("Área total do cubo: " + cubo.areaTotal(lado));
            System.out.println("Diagonal de uma face do cubo: " + cubo.areaDiagonalFace(lado) );
            System.out.println("Diagonal interna do cubo: " + cubo.diagonalinterna(lado));
            System.out.println("Comprimento total de arestas do cubo: " + cubo.totalaresta(lado) );
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}






//================================================================
// BY ramon Carneiro Senger !
// codigo vai ter varias classes com nome random para se alguem for copiar copiar e modificar ksksks
//================================================================