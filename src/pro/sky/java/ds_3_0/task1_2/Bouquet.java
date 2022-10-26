package pro.sky.java.ds_3_0.task1_2;

public class Bouquet {

    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }
//    public Bouquet(Flower... flowers) { //можно так определить и тогда не требуется создавать массива - можно передать несколько аргументов через запятую и джава их сама соберет в массив
//        this.flowers = flowers;
//    } //это метод вараргс

    public float getCost() {
        float sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }

//        //До преобразования for в foreach
//        public int getLifeSpan() {
//            int minLifeSpan = Integer.MAX_VALUE;
//            for (int i = 0; i < flowers.length; i++) {
//                Flower flower = flowers[i];
//                if (flower != null && flower.getLifeSpan() < minLifeSpan) {
//                    minLifeSpan = flower.getLifeSpan();
//                }
//            }
//            return minLifeSpan;
//        }


}
