import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
/**
 * This program is designed to recap the basics of ArrayLists and be a guide to easily refer back to
 *
 */
class List {

    public static void main(String[] args) {
        ArrayList<String> hobbies = new ArrayList<String>(); //creates new arraylist

        //add items to array list
        hobbies.add("art");
        hobbies.add("coding");
        hobbies.add("exploring");
        hobbies.add("crafting");

        //print items in array list
        System.out.println(hobbies);

        //accessing size of arraylist
        System.out.println("Hobbies length: " + hobbies.size());

        //find item by index using get
        System.out.println(hobbies.get(2));

        //change value of item using set
        hobbies.set(3, "exercising");

        //print items in array list
        System.out.println(hobbies);

        //remove item using remove()
        hobbies.remove(3);

        //retrieve index of item using indexOf()
        System.out.println(hobbies.indexOf("art"));

        //print items in array list
        System.out.println(hobbies);
    }

}
