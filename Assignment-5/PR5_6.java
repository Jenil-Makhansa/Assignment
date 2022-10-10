/*
 * Name: Jenil Makhansa
 * Id  : 21ce065
 * Aim : WAP to demonstrate methods of wrapper class.
 */
public class PR5_6 {
    public static void main(String[] args) {
        // input from command line arguments
        //parsing string to Float object.
        float a = Float.parseFloat(args[0]);
        // converting float to wrapper class object. 
        Float object = Float.valueOf(a*100);
        System.out.println("Value of object is : "+object);
    }
}
