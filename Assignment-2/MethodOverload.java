// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Develop a Program that illustrate method overloading concept.
import java.util.Scanner;

public class MethodOverload {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaShape obj = new AreaShape();
        System.out.println("Enter radius :");
        float rad = sc.nextFloat();

        obj.printArea(rad);

        System.out.println("Enter length and width of the rectangle : ");
        float len = sc.nextFloat();
        float width = sc.nextFloat();

        obj.printArea(len, width);
    }
}