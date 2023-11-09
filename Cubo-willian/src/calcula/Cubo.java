package calcula;

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
        int areaDiagonalFace = Math.sqrt(2) * lado;
        return areaDiagonalFace;
    }
    // diagonalinterna
    public int diagonalinterna(int lado){
        int diagonalinterna = Math.sqrt(3) * lado;
        return diagonalinterna;
    }
    // total aresta
    public int totalaresta(int lado){
        int totalaresta = 12 * lado;
        return totalaresta;
    }
}
