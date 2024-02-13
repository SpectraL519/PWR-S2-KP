// Klasa watku
class DisplayMessage1 implements Runnable {
  private String message;
  public int counter;
  public DisplayMessage1(String message) {
    this.message = message;
  }
  // G��wna metoda watku
  public void run() {
    // Glowna petla watku. Watek konczy sie, gdy skonczy dzialanie petla while
    // counter==100
    while(true) {
      System.out.println(message + counter);
      counter++;
      if (counter==100)
      {
          System.out.println("Ending the " + message + "  thread...");
          return;
      }
    }
  }
}

public class RunnableDemo1 {
  public static void main(String [] args) {
      
    // Tworzenie i start w�tku 1
    System.out.println("Creating the hello thread...");
    DisplayMessage1 hello = new DisplayMessage1("Hello");
    Thread thread1 = new Thread(hello);
    System.out.println("Starting the hello thread...");
    thread1.start();
    
    // Tworzenie i start w�tku 2
    System.out.println("Creating the goodbye thread...");
    DisplayMessage1 bye = new DisplayMessage1("Goodbye");
    Thread thread2 = new Thread(bye);
    System.out.println("Starting the goodbye thread...");
    thread2.start();
    
    
  }
}

