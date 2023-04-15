import java.util.Scanner;

public class Flowers {

    public String countryOfOrigin;
    public static String name;
    public static String color;


    Flowers(String flName, String flColor, String country) {
        name = flName;
        color = flColor;
        countryOfOrigin = country;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter flower's name, color and country of origin");

        Flowers flower = new Flowers(scan.next(), scan.next(), scan.next());


        System.out.println("The " + flower.name + " is " + flower.color);
        System.out.println("The " + flower.color + " " + flower.name + " comes from " + flower.countryOfOrigin);

        if (name.equals("tulip") || color.equals("white")) {
            System.out.println("This is my fav flower");
        } else {
            System.out.println("The " + flower.name + " is " + flower.color);
        }

    }

}
