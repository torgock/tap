class Tap {                         
                                        
    int on = 0;                    
    int temp = 0;                      
                                        
    void changeOn(int newValue) {  
         on = newValue;            
    }   

     void tempUp(int increment) {       
         temp = temp + increment;     
    }                                   
                                        
    void tempDown(int decrement) {   
         temp = temp - decrement;     
    }                                   
                                        
    void printStates() {                
         System.out.println("on/off: " + on + " hot/cold: " + temp);  
    }                                   
}          

class TapDemo {                                                      
    public static void main(String[] args) {
                                            
        // Create two different             
        // Bicycle objects                  
        Tap tap1 = new Tap();      
        Tap tap2 = new Tap();      
                                            
        // Invoke methods on                
        // those objects                    
        tap1.changeOn(1);            
        tap1.tempUp(100);
        tap1.printStates(); 
        
        tap2.changeOn(0);   
        tap2.tempDown(0); 
        tap2.printStates();
    }         
}                                  
                                
      
      
      
      



                                    
                                    