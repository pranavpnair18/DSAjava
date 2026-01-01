public class Letterprob {
    public static void main(String [] args){
        String st = "Hey how are you ! how do you know .";
        String[] sa = st.trim().split("\\s+");
        int sentcounter = 0;
        for (String sa1 : sa) {
            System.out.println(sa1);
            if (sa1.equals(".")) {
                sentcounter=sentcounter+1;
            } else if (sa1.equals("!")) {
                sentcounter=sentcounter+1;
            }
        }
        System.out.println(sentcounter);

    }
}
