public class While
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
       int i = 0;
       do {
           System.out.println("i is " + i + " but is less than 15");
           i += 1;
       } while (i < 15);
       
       int k = 10;       
       do {
           System.out.println("k is " + k + " but is greater than 5");
           k -= 1;
       } while (k > 5);
       
       int a = 5;
       int b = 15;
       do {
           System.out.println("a is " + a + " but is less than 10 and b " + b + " but is less than or equal to 20");
           a += 1;
           b += 1;
       } while (a < 10 && b <= 20);
    }
    
    public static void main(String[] args) {
        While hw = new While();
        hw.run();
    }
}