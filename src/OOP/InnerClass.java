package OOP;

class InnerClass {
     static class TestClass{ //if it is not static you will need another object for initialising the test class

        String name;
        TestClass(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
       TestClass one = new TestClass("nihar");
       TestClass two = new TestClass("blah");
        System.out.println(one.name);
        System.out.print(two.name);

    }
}
