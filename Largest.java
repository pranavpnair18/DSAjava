public class Largest {
    
    public static void main(String[] args) {
                
                int [] arr = {3,5,1,8,2,4,7,10,9};
                int n = arr.length;
                boolean flag;
                for(int i=0;i<n;i++){
                    flag= true;
                    for(int j=0;j<n;j++){
                        if(arr[i]+1==arr[j]){
                            flag= false;
                            break;
                        }
                        
                    }
                    if(flag== true){
                        System.out.println(arr[i]+1);
                        break;
                    }
                }


}
}