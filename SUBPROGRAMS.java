
public class SUBPROGRAMS
{
    
        public void methodA() {
        System.out.println("Hello from A");
        methodB();
        System.out.println("Hello from A again");
        methodC();
    }

    public void methodB() {
        methodC();
        System.out.println("Hello from B");
    }

    public void methodC() {
        System.out.println("Hello from C");
    }
    
    public void methodD() {
        SAMPLECLASS myClass;
        myClass = new SAMPLECLASS();
        myClass.sampleMethod();
    }
    
}
