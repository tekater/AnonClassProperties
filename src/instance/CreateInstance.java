package instance;

public class CreateInstance {
    public static SuperClass create() {
        SuperClass instance = new SuperClass() {
            @Override
            public void method2() {
                System.out.println();
                method1();
                method2();
            }
            @Override
            public void method3() {
                System.out.println();
                method3();
            }
        };
        return instance;
    }
}

