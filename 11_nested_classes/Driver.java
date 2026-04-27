interface MyInterface {
    void myMethod();
}


class OuterClass {
    // Field in the outer class.
    public int data = 42;

    public void outerMethod() {
        System.out.println("Hello from the OuterClass!");
    }

    // Inner (non-static) class: it needs an OuterClass object to be created.
    class InnerClass {
        // Same field name as OuterClass.data to demonstrate shadowing.
        public int data = 24;

        public void innerMethod() {
            System.out.println("Hello from the InnerClass!");
            // this.data -> InnerClass.data
            System.out.println("Inner class data (this.data): " + this.data);
            // OuterClass.this.data -> OuterClass.data
            System.out.println("Outer class data (OuterClass.this.data): " + OuterClass.this.data);
        }
    } // non-static inner class

    public void someMethod() {
        // Local class: declared inside a method and used only here.
        class LocalClass {
            public void localMethod() {
                System.out.println("Hello from the LocalClass!");
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.localMethod();
    }

    public void anonymousClassExample() {
        // Anonymous class: one-time implementation of an interface.
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from the Anonymous Class!");
            }
        };

        myInterface.myMethod();
    }
}

class SomeClass {
    static int staticData = 100;
    public int someData;

    public void someMethod() {
        System.out.println("Hello from SomeClass!");
    }

    // Static nested class: can access only static members of SomeClass directly.
    static class StaticNestedClass {
        public void staticNestedMethod() {
            System.out.println("Hello from the StaticNestedClass!");
            System.out.println("Accessing static data from SomeClass: " + staticData);
            // System.out.println("Some User Pass Data" + someData);
        }
    }
}



public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello from the Driver class!");
        OuterClass outer = new OuterClass();
        // outer.outerMethod();

        // Local and anonymous class examples:
        // outer.someMethod();
        // outer.anonymousClassExample();

        // Creating a non-static inner class from an outer object.
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerMethod();

        // Creating a static nested class (no outer object needed):
        // SomeClass.StaticNestedClass someObj = new SomeClass.StaticNestedClass();
        // someObj.staticNestedMethod();
    }
}