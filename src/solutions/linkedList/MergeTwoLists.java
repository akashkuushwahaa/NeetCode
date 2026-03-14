package solutions.linkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){

        if(list1 != null && list2 != null){

            if(list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if(list1 == null)
            return list2;

        return list1;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode merged = mergeTwoLists(list1, list2);

        printList(merged);
    }
}
