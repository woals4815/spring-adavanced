package hello.advanced.app.V0;

public class GenericBox<T> {
    private T data;

    public T getData() { return data; }

    public void setData(T data) { this.data = data; }

    public void test() {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.setData("string");

    }

    public static class NumberGenericBox<T> {
        private T data;

        public T getData() { return data; }

        public void setData(T data) { this.data = data; }

        public double average(NumberGenericBox<T> box) {
            return ((Double)this.data + (Double)box.getData()) / 2;
        }
    }
}
