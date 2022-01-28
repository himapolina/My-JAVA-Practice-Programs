import java.util.*;
class MissingDetailsException extends Exception {
    MissingDetailsException(String s) {
        super(s);
    }
}
class Tourist {
    String name;
    String state;
    String famousSpot;

    Tourist(String name, String state, String famousSpot) {
        this.name = name;
        this.state = state;
        this.famousSpot = famousSpot;
    }
    String getState() {
        return state;
    }
    String getName() {
        return name;
    }
    public static Comparator<Tourist> StateComparator = new Comparator<Tourist>() {
        public int compare(Tourist t1, Tourist t2) {
            return (t1.getState().toLowerCase()).compareTo(t2.getState().toLowerCase());
        }
    };
}
public class q14{
    static void displayTouristSpot(String touristSpot, ArrayList<Tourist> tlist) throws MissingDetailsException {
        boolean found = false;
        for (Tourist t : tlist) {
            if (t.getName().contains(touristSpot)) {
                found = true;
                System.out.println(" Place: " + t.name + "\n State: " + t.state + "\n Tourist Spot: " + t.famousSpot);
            }
        }
        if (found == false)
            throw new MissingDetailsException("missing");
    }
    static void display(ArrayList<Tourist> tlist) {
        Collections.sort(tlist, Tourist.StateComparator);
        System.out.println("Details entered sorted acc to state are ");
        for (Tourist t : tlist) {
            System.out.println(" Place: " + t.name + "\n State: " + t.state + "\n Tourist Spot: " + t.famousSpot);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tourist places");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Tourist> tlist = new ArrayList<Tourist>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of tourist place " + i);
            System.out.println("Place Name");
            String name = sc.nextLine();
            System.out.println("State");
            String state = sc.nextLine();
            System.out.println("Famous spot");
            String famousSpot = sc.nextLine();
            System.out.println();
            Tourist ti = new Tourist(name, state, famousSpot);
            tlist.add(ti);
        }
        System.out.println();
        display(tlist);
        System.out.println("Enter tourist place name to search");
        String touristSpot = sc.nextLine();
        try {
            displayTouristSpot(touristSpot, tlist);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}