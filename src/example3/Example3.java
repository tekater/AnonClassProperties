package example3;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int b = new java.util.Scanner(System.in).nextInt();

        Divider.divide(a, b, new Callback() {
            @Override
            public void calculated(int result) {
                //String textToPrint = String.format("Ваш результат:\n"+"%d / %d это %d", a, b, result);
                String textToPrint = String.format("Ваш результат:\n"+"%d\n" + "-" + " = %d\n" + "%d", a, result,b);
                print(textToPrint);
            }

            @Override
            public void failed(String errorMSG) {

            }
        });
    }
    public static void print(String result) {
        System.out.println(result);
    }
}

