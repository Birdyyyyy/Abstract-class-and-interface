public class test {
    public static void main(String[] args) {
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chicken chicken = new Chicken();
        float money = 0;
        int num = 0;
        for (int i = 0; i <= 100 / 5; i++) {
            for(int j = 0; j <= 100 / 3; j++) {
                for(int k = 0; k <= 100 * 3; k++) {
                    num = i+j+k;
                    money = i*cock.price() + j*hen.price() + k*chicken.price();
                    if (num == 100 && money == 100) {
                        System.out.println("cock num is:"+i+",hen num is:"+j+",chicken num is:"+k);
                    }
                }
            }
        }
    }
}
