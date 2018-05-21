import java.util.Scanner;

class HelloWorld
{
   public static void main(String[] args)
   {
      Scanner myVar = new Scanner(System.in);
      System.out.println("hello, " + myVar.nextLine());
      /* this is a
      multiline comment */
      /** This is a documentation comment */
      String name = "Kika";
      int age = 19;
      double score =15.9;
      char group = 'Z';
      boolean online = true;

      int test1 = 5;
      ++test1; // test is now 6

      int test2 = 5;
      --test2; // test is now 4

      int x = 7;
      if(x < 42) {
        System.out.println("Hi");
      }

      int age1 = 30;

      if (age1 < 16) {
        System.out.println("Too Young");
      } else {
        System.out.println("Welcome!");
      }

      // && and || or

      int day = 3;

      switch(day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        default:
          System.out.println("Weekday");
      }

      // for(int x = 1; x <=5; x++) {
      //   System.out.println(x);
      // }

      int z = 1;
      do {
        System.out.println(z);
        z++;
      } while(z < 0);

      String[ ] myNames = { "A", "B", "C", "D"};
      System.out.println(myNames[2]);

      int[ ] primes = {2, 3, 5, 7};

      for (int t: primes) {
         System.out.println(t);
      }

      int arr[ ] = new int[3];
      for (int i = 0; i < 3; i++) {
        arr[i] = i;
      }
      int res = arr[0] + arr[2];
      System.out.println(res);
   }
}
