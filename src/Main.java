import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();

		customLinkedList.add(1);
		customLinkedList.add(2);
		customLinkedList.add(3);
		customLinkedList.add(4);
		customLinkedList.add(5);

		System.out.println(customLinkedList.getSize());
		System.out.println(customLinkedList.getFirst());
		System.out.println(customLinkedList.getLast());
		System.out.println(customLinkedList.toString());
		System.out.println(Arrays.deepToString(customLinkedList.toArray()));

	}

}
