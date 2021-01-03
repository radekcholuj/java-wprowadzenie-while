public class Divisibility {
    public static void main(String[] args) {

        int i = 427;
        int j = 529;

        while (i <= j){
            if(i %3 == 0 && i % 5 == 0){
                System.out.println(i + ") TikTak");
            }else if(i % 3 ==0){
                System.out.println(i + ") Tik");
            }else if( i % 5 == 0){
                System.out.println(i + ") Tak");
            }

            i++;

        }
    }
}
