public class Main {
    public static void main(String[] args) {
                result(25, 15);
                result(18,25);
                result(50,5);
                result(30, -15);
                result(40, 36);


       // System.out.println(checkOutdoorActivity( 35, 23));
    }

    public static void result(int age, int temperature) {
        String result = activity(age, temperature);
        System.out.println(":" + age + ", :" + temperature + " - " + result);
    }
    public static String activity(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
        (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age  > 45 && temperature >= -10 && temperature <= 25)){
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }
}
