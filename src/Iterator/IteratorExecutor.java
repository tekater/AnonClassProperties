package Iterator;

public class IteratorExecutor {
    static void performIterationsWithCallback(int numberOfIterations,LoopCallback callback) {
        for(int i = 0; i < numberOfIterations; i++){
            callback.onNewIteration(i);
        }
    }
    static void startIterations(int numberOfIteration) {
        LoopCallback callback = new LoopCallback() {
            @Override
            public void onNewIteration(int iteration) {
                for(int j = 0; j < iteration; j++){
                    System.out.println("*");
                }
            }
        };
    }
}
interface LoopCallback {
    void onNewIteration(int iteration);
}
