public class zhishu {
        public static void main(String args[]) {

            for (int i = 2;i<= 100;i++){
                boolean x = true;
                for (int n = 2; n < i; n++) {
                    if (i % n == 0) {
                        x = false;
                        break;
                    }
                }
                if(x){
                    System.out.println(i);
                }
            }
    }
}

