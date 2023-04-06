import java.util.Random;

public class RandomNumberGenerator {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    System.out.println("Your random number is: " + randomNumber);
  }
}
