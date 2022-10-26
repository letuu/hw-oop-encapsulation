package pro.sky.java.ds_3_0.task1_1;

import java.time.LocalDate;

public class Human {

    private static final String DEFAULT_STRING_VALUE = "\"Информация не указана\"";
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
       setName(name);
       setYearOfBirth(yearOfBirth);
       setTown(town);
       setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "\"Информация не указана\"");
//        this.name = ValidationUtils.validOrDefault(name, DEFAULT_STRING_VALUE); //или так
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
//        this.yearOfBirth = yearOfBirth >= 0 ? yearOfBirth : 0; // java предложила заменить на Math.max
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
            this.town = ValidationUtils.validOrDefault(town, DEFAULT_STRING_VALUE);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = ValidationUtils.validOrDefault(job, DEFAULT_STRING_VALUE);
    }

    public int getAgeInYears() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.yearOfBirth;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился (-лась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
