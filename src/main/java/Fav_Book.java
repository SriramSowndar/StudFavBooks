import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.*;

public class Fav_Book {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<String>();
        List<String> bookNames = new ArrayList<String>();
        System.out.println("Enter the Number of Students");
        Scanner scanner = new Scanner(System.in);
        int numberOfStuds = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i< numberOfStuds; i++) {
            System.out.println("Enter Name ");
            String name=scanner.nextLine();
            studentNames.add(name);
        }

        System.out.println("Enter the Number of Books");
        int numberOfBookss = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i< numberOfBookss; i++) {
            System.out.println("Enter Book Name ");
            String name=scanner.nextLine();
            bookNames.add(name);
        }


        Map<String, List<String>> favourtieBookMapping = new HashMap<String, List<String>>();
        for(String studName :studentNames) {
            List<String> favBooks = new ArrayList<String>();
            System.out.println("Enter the Fav Books " + studName);
            String favStr = scanner.nextLine();
            String[] strSpt = favStr.split(",");
            for ( int i=0; i < strSpt.length ; i++){
                favBooks.add(bookNames.get(i));
            }
            favourtieBookMapping.put(studName, favBooks);
        }

        System.out.println("Enter Student Name:" );
        String studentName=scanner.nextLine();
        scanner.close();
        System.out.println(studentName + " Fav Book:") ;
        System.out.println(favourtieBookMapping.get(studentName));
    }
}



