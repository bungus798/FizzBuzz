public class Reduce {
    static int reduceandcount(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n/2;
                count ++;
            }
            else {
                n--;
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Reduce.reduceandcount(1000));
    }
}