package triângulo;

public class CaracterísticasTriângulo {
    
    private float ladoA;
    
    private float ladoB;
    
    private float ladoC;
    
    public float getLadoA(){
        return ladoA;
    }
    
    public void setLadoA(float lado1){
        ladoA=lado1;
    
    }
    public float getLadoB(){
        return ladoB;
    }
    
    public void setLadoB(float lado2){
        ladoB=lado2;
    
    }public float getLadoC(){
        return ladoC;
    }
    
    public void setLadoC(float lado3){
        ladoC=lado3;
    
    }
    
    private boolean éTriângulo(){
        return (ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoB+ladoC>ladoA);
    }
    
    public String tipo(){
        String tipo = "";
        if (éTriângulo () == false){
            tipo="Não é um triângulo";
        }
        else if (ladoA==ladoB && ladoB==ladoC){
            tipo="Equilátero";
        }
        else if (ladoA==ladoB || ladoA==ladoC || ladoB==ladoC){
            tipo="Isóceles";
        }
        else{
            tipo="Escaleno";
        }
        return tipo;
    }
}
