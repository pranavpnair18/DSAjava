

public class Coll {
    public static void main(String[] args) {
        int [] arr = {3,4,7,1,10,12,8,6,2,9};
        int len= arr.length;
        int prime=0;
        int index=0;
        int flag=0;
        for(int i =0;i<len-1;i++){
                for(int j=2;j<Math.sqrt(arr[i]);j++){
                    if(arr[i]==1){
                        continue;
                    }
                    else if(arr[i]%j==0){
                        break;
                    }
                    else{
                        prime =arr[i];
                        flag=1;
                        index = i;
                        System.out.println(index +" "+ prime);
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
        }
        for(int i=0;i<len-2;i++){
            for(int j=i;j<len-1;j++){
                if(arr[i]+arr[j]==prime){
                    System.out.println(index);
                    // flag=1;
                    break;
                }

            }
            // if(flag==1){
            //     break;
            // }
        }
        if(prime==0){
            System.out.println("prime not found");
        }
        
    }
}
