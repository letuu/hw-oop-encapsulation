package pro.sky.java.ds_3_0.task1_1;

public class ValidationUtils {

    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

//    public static int validYearOrDefault(int year, int defaultYear) {
//        return year >= 0 ? year : defaultYear;
//    }
//
//    public static double validVolumeOrDefault() {
//        return 0;
//    }
}
