public class Borrow {
    public static void main(String []args){
        int num1 = 123;
        int num2 = 23;
        int borrcount=0;
        
        while(num1>0 || num2>0){
            int rem1 = num1%10;
            int rem2 = num2%10;
            if(rem1<rem2){
                borrcount = borrcount + 1;
            }
            else if(rem1==rem2){
                borrcount=borrcount+1;
            }
                num1=num1/10;
                num2=num2/10;
            }
             System.out.println(borrcount);
            
        }
      
       
    }
    

