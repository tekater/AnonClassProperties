package anonCalculator;

public class CalculatorWrapper {
     Calculator anonymousCalculator = new Calculator() {
        @Override
        public long sum(long val1, long val2) {
            System.out.println(String.format("Сумма:\n" +"%d"+"+"+"%d"+"="+ (val1 + val2),val1,val2));
            return val1 + val2;
        }

        @Override
        public long subtraction(long val1, long val2) {
            System.out.println(String.format("Разность\n" +"%d"+"-"+"%d"+"="+ (val2 - val1),val2,val1));
            return (val2 - val1);
        }
    };

}
