package calcula;
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
}
