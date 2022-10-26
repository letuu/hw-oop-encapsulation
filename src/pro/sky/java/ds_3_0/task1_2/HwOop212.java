package pro.sky.java.ds_3_0.task1_2;

public class HwOop212 {
    public static void main(String[] args) {

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f, -1);
        Flower hriz = new Flower("Хризантема", "", 15f, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9f, 1);
        Flower hipsofila = new Flower("Гипсофила", "Турция", 19.5f, 10);

        System.out.println(rose);
        System.out.println(hriz);
        System.out.println(pion);
        System.out.println(hipsofila);
        System.out.println();

        Bouquet bouquet1 = new Bouquet(new Flower[]{rose, rose, rose, hriz, hriz, hriz, hriz, hriz, hipsofila});
//        Bouquet bouquet1 = new Bouquet(rose, rose, rose, hriz, hriz, hriz, hriz, hriz, hipsofila); //это передача через метод вараргс (три точки в конструкторе)

        System.out.println("Стоимость букета bouquet1: " + String.format("%.2f", bouquet1.getCost()));
        System.out.println("Срок стояния букета bouquet1: " + bouquet1.getLifeSpan());
    }
}
