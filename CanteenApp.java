import java.util.ArrayList;

public class CanteenApp{

    public static void main(String[] args) {
     
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        
        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Idli", 20));
        menu.add(new MenuItem("Filter Coffee", 15));

       
        OrderView view = new OrderView();

       
        OrderController controller = new OrderController(menu, view);

        System.out.println("\n----------------------------");
        System.out.println("  Welcome to Campus Canteen!");
        System.out.println("----------------------------\n");
        boolean running = true;


        while (running) {
            controller.showMenu();
            int choice = controller.readChoice();
            
            if (controller.isFinished(choice)) {
                controller.takeOrder(choice);
                
            } else {
                controller.printReceipt();
                running = false;
                
            }
        }
        System.out.println("\nThank you! Visit again.");
    }
}
