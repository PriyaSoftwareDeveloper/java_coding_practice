package javaPracticeDaily_w3School;

public class break_loop {
    public static void main(String[] args) {
        for (int i=0 ; i<10; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }
}