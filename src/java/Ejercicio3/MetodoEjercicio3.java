/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author 15481567-8
 */
public class MetodoEjercicio3 {
    public int calculo(int n1, int n2, String t){
        int r=0;
       
            if(t.equals("suma")){
                r=n1+n2;
            }
            else{
                if(t.equals("resta")){
                r=n1-n2;
            }
                else{
                     if(t.equals("multiplicacion")){
                        r=n1*n2;
                    }
                     else{
                         r=n1/n2;
                     }
                }
            }
        
        
        return r;
    }
    int acum=0;
    public void SumaSucesiva(int a)
        {
            
            acum = acum+a;
        }
    public int ObtieneSuma()
        {
            
            return acum;
        }
    public int elevado(int a, int b){
    return a^b;
    }
    public String numMayor(int a, int b){
        String mayor="";
        if(a>b){
            mayor =a+" es mayor que "+b;
        }
            else{
                if(a==b){
                    mayor = "los numeros ingresados son iguales";
                }
                else{
                    mayor = b+" es mayor que "+a;
                }
                    }
        
    return mayor;
            }
}
