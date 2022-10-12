package defaultPackage;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Amy");
        name.add("Tom");
        name.add("Amy");
        name.add("Billy");
        name.add("Tom");
        name.add("Robert");
        name.add("Amy");
        name.add("Robert");
        name.add("Robert");

        System.out.println("Names before checking for duplicates:");
        for (String str:name){
            System.out.print(str + " ");

        }
        System.out.println();
        int current = 0;
        while (current < name.size()){
            //looping index to check for duplicates
            int j  = 0;
            // set up flag to keep track of occurence of duplicate elements
            boolean isRemoved = false;
            while (j < current) {
                 if (name.get(current).equals(name.get(j))){
                     name.remove(current);
                     isRemoved= true;
                     break;
                 }
                 //loop over to next element to check for duplicates
                else j++;
            }
            // if no element is removed change current index
            if(!isRemoved) current ++;
        }
        System.out.println("Names after checking for duplicates:");
        for(String str: name) {
            System.out.print(str + " ");
        }
    }

}
