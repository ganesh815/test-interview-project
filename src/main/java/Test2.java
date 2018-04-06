public class Test2<T> {


    public static void main(String[] args) {

        //todo 1: Print a String using the print function.

        //todo 2: Print a instance of MyObject using the print function.

        //todo 3: Print the sum of two numbers
    }

    public void print(T t) {
        System.out.println("printing: " + t.toString());
    }

    public <T extends Number> Number add(T t1, T t2) {
        return t1.intValue() + t2.intValue();
    }

    public static class MyObject {

        private String attribute1;

        public MyObject(String attribute1) {
            this.attribute1 = attribute1;
        }

    }
}
