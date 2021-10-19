package L3_2;

public class HW3_2_2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String string = "Первая строка";
        for (int i=0; i <=20000; i++) {
            string += "Вторая строка";
        }
        long finish = System.currentTimeMillis();
        long result1 = finish - start;
        System.out.println("Время выполнения при System.currentTimeMillis: " + result1);



        start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int j=0; j <=20000; j++) {
            str.append("Вторая строка");
        }

        finish = System.currentTimeMillis();
        long result2 = finish - start;
        System.out.println("Время выполнения при StringBuilder: " + result2);

        System.out.println("Разность между способами:" + (result1-result2));
    }
}
