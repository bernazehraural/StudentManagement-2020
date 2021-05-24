
package javafxswingapplication1;

import java.util.ArrayList;

public class Universitaet {
    ArrayList<Student> studentlist = new ArrayList<>();
    ArrayList<Dozent> dozentlist= new ArrayList<>();
    ArrayList<LVA> lvalist= new ArrayList<>();
    
    private String name = " Türkisch-Deutsche Universitaet";
    private int kapazitaet = 100;
    
    public void getUni(String isim, int kapasite){
        this.name = isim;
        this.kapazitaet = kapasite;
        
       System.out.println(this.name + " : Diese Universitat hat Kapazitaet für "+ this.kapazitaet +"Studenten"); 
    }
    public void setName(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }
     
    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }
  
    public int getKapazitaet(){
        return this.kapazitaet;
    }
}
