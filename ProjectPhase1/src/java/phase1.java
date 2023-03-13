package java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class phase1
{
    public static void main(String[] args) 
    {
        Set<String> set = new HashSet<String>();
        while (true) 
        {
	        System.out.println("*****Welcome to Lockers Pvt. Ltd :)*****");
	        System.out.println(" Developed by Rashika");
	        System.out.println("Employee ID:10845");
	        System.out.println("******************");
	        System.out.println("Main Menu");
	        System.out.println("Please select one the following");
	        System.out.println("1.Retrieving the files in an Ascending Order");
	        System.out.println("2.Performing file operations:");
	        System.out.println("3.Exit");
	        System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);       
                  int a = sc.nextInt();
             switch (a) 
                {
                case 1:
                    if (set.isEmpty()) 
                    {
                        System.out.println("No files found. Please create a file.");
                    } else
                    {
                        Set<String> sortedSet = new TreeSet<String>(set);
                        System.out.println("Set is sorted in Ascending Order:" + sortedSet);
                    }
                    break;
                case 2: 
                     set=fileoperations(set);
                    break;
                case 3:
                	System.out.println("Have a nice day!! Thank You ");
                    System.exit(1);
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;
               }
            }
        }
   
    private static Set<String> fileoperations(Set<String> set)
    {
    	Scanner sc = new Scanner(System.in); 	
    	while(true){
    	System.out.println("*****File operations*****");
    	System.out.println("1. Add file");
    	System.out.println("2. Delete file");
    	System.out.println("3. Search file");
    	System.out.println("4. return to main menu");
    	System.out.println("Enter your choice");
        int name = sc.nextInt();
    	    switch (name) 
        {
        case 1: set = AddFile(set);
              System.out.println("File is added:"+set);
                break;
        case 2:
            set = DeleteFile(set);   
            System.out.println(set);
            System.out.println("File is deleted:"+set);
            break;
        case 3:
            Search(set);
            break;
        case 4:
        	return set;
        default:
            System.out.println("Oops!! please enter the valid number");
            break;
        }
    	
    	}
    	
	}	
	public static Set<String> AddFile(Set<String> set) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Add in set");
        String name = sc.nextLine();
        set.add(name);
        return set;
    }
    public static Set<String> DeleteFile(Set<String> set) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Remove in set");
        String name = sc.nextLine();
        set.remove(name);
        return set;
    }
    public static void Search(Set<String> set) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Search in set");
        String name = sc.nextLine();
        if (set.contains(name)) {
            System.out.println("Element Found in set");
         }
        else
         {
            System.out.println("Element Not Found in set");
          }
    }
}

