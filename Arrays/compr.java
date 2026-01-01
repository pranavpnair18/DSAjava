package Arrays;

public class compr {
    public static void main(String[] args) {
        String text="aaaabbbccccdddddd";
        check(text);
    }

    public static void check(String text)
    {
      int len = text.length();
      StringBuilder compress= new StringBuilder();
     int  count=0;
      for(int i=0;i<len;i++)
      {
        count++;
        if(i+1>=len || text.charAt(i)!=text.charAt(i+1))
        {
            compress.append(text.charAt(i));
            compress.append(count);
            count=0;
        }
      }
   System.out.println(compress+ "nice one");

    }
}
