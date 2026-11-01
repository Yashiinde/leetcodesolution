class MyLinkedList {

    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head;
    public node tail;
    public int size;
    public MyLinkedList() {
        size = 0;
    }
    public int get(int index) {

        if(index < 0 || index >= size) {
            return -1;
        }
        node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        node newnode = new node(val);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addAtTail(int val) {
        node newnode = new node(val);
        size++;
        if(head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }
        node newnode = new node(val);
        node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
            return;
        }

        node temp = head;

        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node deleteNode = temp.next;
        temp.next = deleteNode.next;

        if(index == size - 1) {
            tail = temp;
        }

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */