public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Shirt shirt = new Shirt("Calvin Klein");
        shirt.setColor("Blue");
        shirt.setPrice(10);

        Shirt shirt2 = new Shirt("Ralph Lauren");
        shirt2.setColor("Yellow");
        shirt2.setPrice(25);

        Shorts shorts = new Shorts("Catthart", "beige", 35);

        System.out.println("First shirt is " + shirt.getBrand() + " and has color " + shirt.getColor()+". It costs " + shirt.getPrice()+"€");
        System.out.println("Second shirt is " + shirt2.getBrand() + " and has color " + shirt2.getColor()+". It costs " + shirt2.getPrice()+"€");
        System.out.println("Shorts are " + shorts.getBrand() + " and has color " + shorts.getColor()+". It costs " + shorts.getPrice()+"€");



    }
}
