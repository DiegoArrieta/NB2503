/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje4;

/**
 *
 * @author 15481567-8
 */
public class MetodosEje4 {
    public String Ordenamiento(int n1, int n2, int n3){
        String r="";
        int o1=0, o2=0, o3=0;
        int aux=0;
        if(n1>n2){
            if(n1>n3)
            {
                o3 = n1;
            }
        }
        if(n2>n1){
            if(n2>n3)
            {
                o3 = n2;
            }
        }
        if(n3>n2){
            if(n3>n1)
            {
                o3 = n3;
            }
        }
        
        if(n3>n2){
            if(n3>n1)
            {
                o3 = n3;
            }
        }
        
        
        r = "El orden es: "+o1+", "+o2+", "+o3;
        return r;
    }
    
}
