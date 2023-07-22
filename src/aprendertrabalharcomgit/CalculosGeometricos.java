package aprendertrabalharcomgit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcus
 */
public class CalculosGeometricos {
    
    
    public float areaQuadrado(float lado){
        
        return lado * lado;
    }
    
    public float areaTriangulo(float base, float altura){
        
        return base * altura / 2;
    }
    
    public float areaCiruclo(float raio){
        
        return (float) (raio * raio * 3.14);
    }
}
