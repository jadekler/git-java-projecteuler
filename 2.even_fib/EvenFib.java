public class EvenFib {
    public static void main(String[] args) {
        int sum = 0;

        int x = 1;
        int y = 1;
        int z = x+y;

        while (z <= 4000000) {
            if (z%2 == 0) {
                sum += z;
            }

            x = y;
            y = z;
            z = x+y;
        }

        System.out.println(sum);
    }
}