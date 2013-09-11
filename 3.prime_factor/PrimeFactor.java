public class PrimeFactor {
    public int largest = 0;
    public long someNum = 600851475143L;

    public static void main(String[] args) {
        new PrimeFactor();    
    }

    public PrimeFactor() {
        long index = 1;

        while (index <= this.someNum) {
            if (isPrime(index) && this.someNum%index == 0) {
                System.out.println(index+" is a factor\n");
                this.someNum /= index;
            }

            index++;
        }
    }

    public boolean isPrime(long someNum) {
        long index = someNum-1;

        while (index > 1) {
            if (someNum%index == 0) {
                return false;
            }

            index--;
        }

        return true;
    }
}