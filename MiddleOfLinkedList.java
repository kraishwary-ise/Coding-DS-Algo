class Solution
{
    int getMiddle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
         // Your code here.
         return slow.data;
    }
}
