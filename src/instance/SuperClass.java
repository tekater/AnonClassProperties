package instance;

abstract class SuperClass {
    public static void method1() {
        System.out.println("it`s a static method.");
    }
    public void method2() {
        System.out.println("it`s not a static method.");
    }
    public abstract void method3();
}
