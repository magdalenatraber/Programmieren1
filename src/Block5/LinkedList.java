package Block5;

public class LinkedList {
    Node first;
    Node last;

    public void add(int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null) {
            first = newWagon;
            last = newWagon;
        }
        last.next = newWagon;
        last = newWagon;
    }

    public void printAllNodes() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
    }

    // suche
    public int containsValue(int value) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public Node getAt(int position) {
        Node current = first;
        int index = 1;
        while (current != null) {
            if (position == index) {
                return current;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    // löschen
    public void deleteAt(int position) {
        // 37 auf 58
        Node current = first;
        int index = 1;
        position = position - 1;
        if (position == 0) {
            first = first.next;
            current.next = null;
        } else {
            while (current != null) {
                if (position == index) {
                    Node deleteNode = current.next;
                    current.next = current.next.next;
                    deleteNode.next = null;

                    if (deleteNode == last) {
                        last = current;
                    }
                    break;
                }
                current = current.next;
                index++;
            }
        }
    }

    public void addElement(int position, int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null){
            newWagon = first;
            newWagon = last;
            return;
        }


        Node current = first;
        int index = 1;
        position = position - 1;
        if (position == 0) {
            first = newWagon;
            newWagon.next = current;
        } else {
            while (current != null) {
                if (position == index) {
                    Node next = current.next;
                    current.next = newWagon;
                    newWagon.next = next;
                    if (last == next) {
                        last = newWagon;
                    }
                    break;
                }
                current = current.next;
                index++;
            }
        }
    }

    public void changeValue(int position, int newValue){

        Node current = first;
        int index = 1;
        while (current != null){
            if (position == index){
                current.value = newValue;
                break;
            }
            current = current.next;
            index++;
        }
    }



}
