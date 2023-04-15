import java.util.Scanner;

public class Flowers {

    public String name;
    public String color;

    Flowers(String flName, String flColor) {
        name = flName;
        color = flColor;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter name and color of the flower");

        Flowers flower = new Flowers(scan.next(), scan.next());

        System.out.println("The " + flower.name + " is " + flower.color);
    }

}
