public class seniorCitizon {
    public static int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++ ){
            String s = details[i].substring(11, 13);
            int n = Integer.parseInt(s);
            if(n>60){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String details[] = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        System.out.println(countSeniors(details));
    }
}