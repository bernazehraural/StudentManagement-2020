
package javafxswingapplication1;


public class LVA {
    String ders_ısım =" ";
    String LvaCode = "INF102";
    public boolean dogruluk = true;
    public int id ;
    static int s,ü,g;
    
    LVA(String codcreated,String lvaname) {
      this.ders_ısım = lvaname;
      this.LvaCode = codcreated;
}
      public static boolean CheckKuerzung(String kurzte){
        if(kurzte.length() == 6){
            for(int i=0; i<3 ;i++ ){
                if(true == Character.isDigit(kurzte.charAt(i))) {
                    return false;
               } 
    
                if(Character.isUpperCase(kurzte.charAt(i))== false){
                      return false;
                }
                
            }
             for(int k=3; k<6 ;k++ ){
                if(false == Character.isDigit(kurzte.charAt(k))) {
                    return false;
               } 
                
             }
        } 
        else{
            return false;
        }
           
        return true;
    }
    
    @Override
    public boolean equals(Object o) {
              LVA y = (LVA) o;
                   if(this.LvaCode.equals(y.LvaCode)){
                        return true;
                   }  
                   else{
                       return false;
                   }
    }
    
    @Override
    public String toString(){
        return this.LvaCode +" " + this.ders_ısım.toUpperCase();
    }
    
    public void setLvaCode(String LvaCode) {
        this.LvaCode = LvaCode;
    }

    public String getLvaCode() {
        return this.LvaCode;
    }
    
     public String getDers_ısım() {
        return this.ders_ısım;
    }

    public void setDers_ısım(String ders_ısım) {
        this.ders_ısım = ders_ısım;
    }
}
