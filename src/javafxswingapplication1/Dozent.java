/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxswingapplication1;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Dozent extends Person {
    ArrayList<Dozent> dozentzulvalist = new ArrayList<>();
    String TcNummer ="";
    String zugewieseneLva =" ";
 
    Dozent(String is,String so,String tcnm){
        this.name=is;
        this.nachname=so;
        this.TcNummer = tcnm;
    }
    
    Dozent(String a, String b){
        this.zugewieseneLva =a;
        this.TcNummer=b;
    }
    
    public String getZugewieseneLva(Dozent a) {
        return a.zugewieseneLva;
    }

    public void setZugewieseneLva(String zugewieseneLva) {
        this.zugewieseneLva = zugewieseneLva;
    }
   
   
    public boolean equals(Object dozentprf){
         Dozent s = (Dozent) dozentprf;
                   if(this.TcNummer.equals(s.TcNummer) && this.zugewieseneLva.equals(s.zugewieseneLva)){
                        return true;
                   }  
                   else{
                       return false;
                   }
    }
    @Override
    public String toString(){
        
        return  nachname.toUpperCase() +" " + name + " " + TcNummer  ;
    }
    
    public String toZugewieseneLvas(){
        return this.zugewieseneLva  ;
    }
    public static boolean CheckTCNummer(String tc){
         if(tc.length() == 11){
            for(int i=0; i<tc.length() ;i++ ){
                if(false == Character.isDigit(tc.charAt(i))) {
                    return false;
               } 
            }
            return tc.charAt(0) != '0';
            
        }
            else{    
             return false;
           }
    }

    @Override
    public void gehoertzurUni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getTcNummer() {
        return this.TcNummer;
    }

    public void setTcNummer(String TcNummer) {
        this.TcNummer = TcNummer;
    }
}
