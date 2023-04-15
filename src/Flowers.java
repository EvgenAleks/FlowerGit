import java.util.Scanner;

public class Flowers {

    public static String name;
    public static String color;

    Flowers(String flName, String flColor) {
        name = flName;
        color = flColor;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter name and color of the flower");

        Flowers flower = new Flowers(scan.next(), scan.next());

        if (name.equals("tulip") || color.equals("white") ){
            System.out.println("This is my fav flower");
        }else{
            System.out.println("The " + flower.name + " is " + flower.color);
        }
    }

}
