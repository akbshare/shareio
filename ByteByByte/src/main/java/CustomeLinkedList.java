public class CustomeLinkedList {
    public static void main(String[] args) {

        MyLiknedList mll = new MyLiknedList();
        mll = MyLiknedList.insert(mll,10);
        mll = MyLiknedList.insert(mll,20);
        mll = MyLiknedList.insert(mll,40);
        mll = MyLiknedList.insert(mll,70);
        mll = MyLiknedList.insert(mll,30);
        MyLiknedList.printList(mll);

    }

    static class MyLiknedList {
        Node head;

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public static MyLiknedList insert(MyLiknedList mll, int data) {
            Node new_node = new Node(data);
            new_node.next = null;
            if(mll.head == null) {
                mll.head = new_node;
            } else {
                Node last = mll.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
            return mll;
        }

        public static void printList(MyLiknedList mll) {
            Node currNode = mll.head;
            System.out.println("MyLinkedList : ...");
            while(currNode != null) {
                System.out.print(currNode.data + "  ");
                currNode = currNode.next;
            }
        }
    }
}
