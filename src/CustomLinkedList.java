
public class CustomLinkedList<R> {

	int size;
	Node<R> first;
	Node<R> last;

	public CustomLinkedList() {
		this.size = 0;
	}

	public void add(R value) {
		Node<R> node = new Node<R>();
		if (this.first == null) {
			this.first = node;
			this.last = node;
		} else {
			this.last.setNext(node);
			this.last = node;
		}
		node.setValue(value);
		node.setPrev(this.last);
		node.setNext(node);
		this.size++;
	}

	public int getSize() {
		return size;
	}

	public R getFirst() {
		return this.first.getValue();
	}

	public R getLast() {
		return this.last.getValue();
	}

	public String toString() {
		if (this.size == 0) {
			return "empty";
		}
		String string = "[";
		Node<R> node = this.first;
		for (int i = 0; i < this.size; i++) {
			if (i == this.size - 1) {
				string += node.getValue() + "]";
				continue;
			}
			string += node.getValue() + ", ";
			node = node.getNext();
		}
		return string;
	}

	public R[] toArray() {
		if (this.size == 0) {
			return null;
		}
		Object[] arr = new Object[this.size];
		Node<R> node = this.first;
		for (int i = 0; i < this.size; i++) {
			arr[i] = node.getValue();
			node = node.getNext();
		}
		return (R[]) arr;
	}
}

class Node<R> {
	private R value;
	private Node<R> prev;
	private Node<R> next;

	public R getValue() {
		return this.value;
	}

	public void setValue(R value) {
		this.value = value;
	}

	public Node<R> getPrev() {
		return this.prev;
	}

	public void setPrev(Node<R> prev) {
		this.prev = prev;
	}

	public Node<R> getNext() {
		return this.next;
	}

	public void setNext(Node<R> next) {
		this.next = next;
	}

	public Node() {
	}
}