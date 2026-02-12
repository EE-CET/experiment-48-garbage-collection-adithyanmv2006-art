class GarbageDemo {

    @SuppressWarnings("removal")
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

public class GarbageCollection {
    public static void main(String[] args) {

        GarbageDemo obj = new GarbageDemo();
        obj = null;      // eligible for GC

        System.gc();     // request garbage collection

        // give JVM some time (still not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
