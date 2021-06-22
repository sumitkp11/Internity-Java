public class continueCase {
    public static void main(String[] args){
        //continue breaks one iteration in the loop
        for(int i =0; i<10; i++){
            if(i==4) {
                continue; //this skips value 4
            }
            System.out.println(i);
        }

    }
}
