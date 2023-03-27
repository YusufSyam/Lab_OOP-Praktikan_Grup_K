public class Main {
    private String[] data;

    public Main(String[] data) {
        this.data = data;
    }

    public int findIndex(String text) {
        for(int i = 0; i < this.data.length; ++i) {
            if (this.data[i].equalsIgnoreCase(text)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] fruits = new String[]{"apple", "banana", "orange", "mango", "kiwi"};
        Main stringArray = new Main(fruits);
        System.out.println(stringArray.findIndex("banana"));
        System.out.println(stringArray.findIndex("Apple"));
        System.out.println(stringArray.findIndex("watermelon"));
    }
}