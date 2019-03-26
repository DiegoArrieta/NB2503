/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15481567-8
 */
public class MetodoTrabajador {
    public String calculoBono(int s, int a){
    String r=" ";
    if(s>=301000){
        if(a<1){
            r=" no tiene derecho a Bono.";
        }
        else{
            if(a>=1 & a<=5){
                r="$"+s*0.20;
            }
            else{
                if(a>=6 & a<=10){
                    r="$"+s*0.40;
                }
                else
                {
                    r="$"+s*0.60;
                }
            }
        }
    }
    else{
        r="El sueldo debe ser el minimo en Chile";
    }
    return r;
    }
    
}
