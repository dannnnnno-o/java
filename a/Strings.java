public class Strings {
    @SuppressWarnings("unused")
    
    public static void main(String[] args){
        // System.out.println("Hello World");

        String name = "Dannnn";
        
        /* int values */
        int length = name.length();
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("n");
        
        /* char values */
        char letter = name.charAt(2);

        /* string values */
        name = name.toUpperCase();
        name = name.toLowerCase();
        String sname = "    dan   "; //space name
        sname = sname.trim(); // output: dan
        sname = sname.replace(" ", "~"); // returns the string with replaced targets
        // System.out.println(sname);
        
        // boolean values
        /* 
        string.isEmpty();
        string.contains("") //accepts a string 
        string.equals("") //accepts a string
        string.equalsIgnoreCase("") // same as .equals() but ignores type casing
        
        */

        System.out.println(name.contains("dannnn"));
        



    }
}
