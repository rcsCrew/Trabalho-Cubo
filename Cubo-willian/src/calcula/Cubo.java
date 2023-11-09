package calcula;

//================================================================
// BY: Ramon Carneiro Senger !
// GITHUB: https://github.com/rcsCrew/Trabalho-Cubo/tree/main
//================================================================

import java.lang.Math;
public class Cubo {
    // int volume : declara o valor (volume) que retorna o valor int que recebe valor lado do package calcula > AreaDoCUbo!
    public int volume(int lado){
        // declara volume com int para realizar o calculo do volume do cubo.
        int volume = lado * lado * lado;
        // retorna o valor somado
        return volume;
    } 
    // area face 
    public int areaFace(int lado){
        int areaFace = lado * lado;
        return areaFace;
    }
    // area total
    public int areaTotal(int lado){
        int areaTotal = 6 * lado * lado;
        return areaTotal;
    }
    // area diagonalFace
    public int areaDiagonalFace(int lado){
        double areaDiagonalFace = Math.sqrt(4) * lado;
        return (int)areaDiagonalFace;
    }
    // diagonalinterna
    public int diagonalinterna(int lado){
        double diagonalinterna = Math.sqrt(12) * lado;
        return (int) diagonalinterna;
    }
    // total aresta
    public int totalaresta(int lado){
        int totalaresta = 6 * lado;
        return totalaresta;
    }
}
