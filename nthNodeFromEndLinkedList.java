class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
        int count=0;
        Node second=head;
        Node first=head;
        while(count<n)
        {
            if(second==null)
            return -1;
            count++;
            second=second.next;
            
        }
        while(second!=null)
        {
            second=second.next;
            first=first.next;
        }
        return first.data;
        
        
    	// Your code here	
    }
}