public class Constructor {
    public static void main(String[] args) {


        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.color = "Белая";


        Flower flower2 = new Flower("Роза","Красная" );
        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower2.name + " " + flower2.color);
    }

}
