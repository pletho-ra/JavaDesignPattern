package CollectionsQuestions;

public class Client {
    public static void main(String[] args) {
        CustomLinkedList<String> customList = new CustomLinkedList<>();

        customList.add("Apple");
        customList.add("Banana");
        customList.add("Cherry");
        customList.add("Date");
        customList.add("Elderberry");

        System.out.println("Original List: " + customList);

        customList.reverse();

        System.out.println("Reversed List: " + customList);
    }
}
