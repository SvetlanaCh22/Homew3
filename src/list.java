// Создаём двунаправленный список.
public class list {
    public class Node {
        int value;
        Node next;
        Node previous;
    }
    Node head;
    Node tail;

    // добавление в список
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
    }

    // разворот связного списка
    public void revert() {
        Node currentNode = head;

        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }

            currentNode = next;
        }
    }

    // вывод на экран
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        Node nd = head;
        while (nd != null) {
            temp.append(nd.value);
            temp.append(" ");
            nd = nd.next;
        }
        return temp.toString();
    }
}


    


