public class SomaNumerosPar{
    public static void main(String args[]) {
        int x = 0;
        for (int i = 50; i < 151; i++){
            
          if (i % 2 == 0){
            x += i;
             
          }
          
        };
        System.out.println(x);  
      
    }
}