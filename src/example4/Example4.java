package example4;

public class Example4 {
    public static void main(String[] args) {

        final String robotName = "MrRobot";
        final int robotAssemblyYear = 21;

        SpeakingEntity robot = new SpeakingEntity() {
            static final int MAGIC_CONSTANT = 10;
            private String name;
            private int assemblyYear;
            {
                name = robotName;
                assemblyYear = robotAssemblyYear;
            }
            @Override
            public void sayHello() {
                System.out.println("1010001" + MAGIC_CONSTANT);
            }

            @Override
            public void sayBye() {
                System.out.println("010111" + MAGIC_CONSTANT);
            }
        };

        robot.sayHello();
        robot.sayBye();
    }
}
