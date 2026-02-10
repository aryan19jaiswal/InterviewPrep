public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null)
        {
            return null; // If any list is empty, no intersection is possible
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b)
        {
            if (a == null)
            {
                a = headB;
            }
            else
            {
                a = a.next;
            }

            if (b == null)
            {
                b = headA;
            }
            else
            {
                b = b.next;
            }
        }

        return a;
    }
}