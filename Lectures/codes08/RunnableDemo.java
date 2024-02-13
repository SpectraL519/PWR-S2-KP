// Klasa w�tku
class DisplayMessage implements Runnable {
  private String message;
  public DisplayMessage(String message) {
    this.message = message;
  }
  // G��wna metoda w�tku
  public void run() {
    // P�tla niesko�czona. W�tek si� nie ko�czy  
    while(true) {
      System.out.println(message);
    }
  }
}

public class RunnableDemo {
  public static void main(String [] args) {
    
    // Tworzenie i start w�tku 1  
    System.out.println("Creating the hello thread...");
    DisplayMessage hello = new DisplayMessage("Hello");
    Thread thread1 = new Thread(hello);
    System.out.println("Starting the hello thread...");
    thread1.start();
    
    // Tworzenie i start w�tku 2    
    System.out.println("Creating the goodbye thread...");
    DisplayMessage bye = new DisplayMessage("Goodbye");
    Thread thread2 = new Thread(bye);
    System.out.println("Starting the goodbye thread...");
    thread2.start();
    
    // W�tki nie s� zsynchronizowane. Wypisywanie woadomosci Hello i Goodbye 
    // te� nie jest zsynchronizowane
  }
}

