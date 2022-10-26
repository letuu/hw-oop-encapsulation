package pro.sky.java.ds_3_0.task1_1;

import java.time.LocalDate;

public class HwOop211 {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 1987, "Минск", "Бренд менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "Методист образовательных программ");
        Human katya = new Human("Катя", 1994, "Калининград", "Продакт менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "Директор по развитию бизнеса");
        Human nullPerson = new Human(null, -1995, null, null);

        Human vladimir = new Human("Владимир", -10, null, "\"Сейчас нигде не работаю\"");

        //Можно распечатать с помощью переопределенного toString()
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(nullPerson);
        System.out.println();


        //Или можно распечатать с помощью метода printHuman()
//        printHuman(maxim);
//        printHuman(anya);
//        printHuman(katya);
//        printHuman(artem);
//        printHuman(nullPerson);

        System.out.println(vladimir);
        vladimir.setYearOfBirth(LocalDate.now().getYear() - 21);
        vladimir.setTown("Казань");
        System.out.println(vladimir);
        printHuman(vladimir);
    }

    public static void printHuman(Human person) {
        System.out.println("Привет! Меня зовут " + person.getName() + ". Я из города " + person.getTown() + ". Мне " + person.getAgeInYears() + " лет. Я работаю на должности " + person.getJob() + ". Будем знакомы!");
    }
}
