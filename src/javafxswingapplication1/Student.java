
package javafxswingapplication1;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<Student> studentzulvalist = new ArrayList<>();
    Universitaet unicik = new Universitaet();  
     
    String matrikelnummer = "1234567890" ;
    private String Semester = "1"  ;
    String angemeldeteLVA =" ";
    String angemeldeteLvaName = " ";
    int k;
    private String derszurStudent = " ";
  
    Student(String ad,String soyad,String ogrnum){
        this.name = ad;
        this.nachname = soyad;
        this.matrikelnummer = ogrnum;
    }
    
    Student(String matrikelNummer, String lvacode){
        this.matrikelnummer = matrikelNummer;
        this.angemeldeteLVA= lvacode;
    }
    
    Student (String ogrnum,String yıl,String yas,String bolum,String Mailadress ){
        this.Semester = yıl;
        this.alter= Integer.parseInt(yas) ;
        this.fachBereich = bolum ;
        this.eMail = Mailadress;
    }
 
    public String getMatNum(Student birisi){
        return birisi.matrikelnummer;
    }
    
    
    // die equals java.lang.Object Klasse (zwei Student Objekte die Matrikelnummern der beiden Objekte gleich sind) und
 
    @Override
    public boolean equals(Object o) {
              Student s = (Student) o;
                   if(this.matrikelnummer.equals(s.matrikelnummer)){
                        return true;
                   }  
                   else{
                       return false;
                   }
    }
    
    @Override
    public String toString(){
        
  
       this.nachname = nachname.toUpperCase();
       return matrikelnummer + " " + name + " " + nachname ;
    }
    
//toAngemeldetLVAs zeigen:
    public String toAngemeldeteLVAs(){
       // for(int p=0;p<unicik.lvalist.size();p++){
           // if(this.angemeldeteLVA.equals(unicik.lvalist.get(p).getLvaCode()) == true){
           //     this.angemeldeteLvaName = unicik.lvalist.get(p).getDers_ısım() ;
           // }
      //  }
        
        return  this.angemeldeteLVA + " " + this.angemeldeteLvaName ;
    }
    
    public static boolean CheckMatrikelNummer(String kontrol){
        if(kontrol.length() == 7){
            for(int i=0; i<kontrol.length() ;i++ ){
                if(false == Character.isDigit(kontrol.charAt(i))) {
                    return false;
               } 
            }
            return kontrol.charAt(0) != '0';
            
        }
            else{    
             return false;
           }
        
    }

    
    public void gehoertzurUni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
      public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

   

    public String getAngemeldeteLVA(Student bris) {
        return bris.angemeldeteLVA;
    }

    public void setAngemeldeteLVA(String angemeldeteLVA) {
        this.angemeldeteLVA = angemeldeteLVA;
    }
}
