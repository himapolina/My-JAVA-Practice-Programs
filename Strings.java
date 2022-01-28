import java.util.*;
public class Strings{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter the html code: ");
            String line = scan.nextLine();
            
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            System.out.println("Content Extracted: ");
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
    }
}