import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean run = true;
    // Ask the user here
    Stable s = new Stable();

    System.out.println("What is the address of the stable?");
    Scanner scanner = new Scanner(System.in);
    s.address = scanner.nextLine();
    do {
      System.out.println("Do you wish to add a horse to the stable?");
      char input = scanner.next().charAt(0);
      scanner.nextLine();
      if (input == 'y') {
        Horse h;
        System.out.println("What is the name of the horse?");
        String hn = scanner.nextLine();
        System.out.println("What is the weight of the horse?");
        double w = scanner.nextDouble();
        System.out.println("Enter true if the horse is tame or false if it is not.");
        boolean t = scanner.nextBoolean();
        h = new Horse(hn, w, t);
        s.addHorse(h);
      } // testing goodest 4
      else {
        break;
      }
    } while (run);
    // Display the info here
    // You code here!
   
    for (int i = 0; i < s.h.size(); i++) {
     System.out.print("Horse #" + (i + 1) + " " + s.h.get(i).toString() + "\n");
    }
    run = false;
   
  }

}
