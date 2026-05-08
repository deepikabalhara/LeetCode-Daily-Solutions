<<<<<<< HEAD:Day_3.java/Rotate_List.c
//This code is in C language

=======
/*This code is in C language and it is a solution to the problem of rotating a 
linked list to the right by k places. The function takes in the head of the
 linked list and the number of places to rotate, and returns the new head 
 of the rotated linked list. The code first checks for edge cases,
  then calculates the length of the linked list, connects the last node
   to the head to form a circular linked list, and finally finds the new 
   tail and new head after rotation before cutting the circular link.
*/
>>>>>>> 1ee4d9f (Added Day 6 solution):Day_3.c/Rotate_List.c

 //Definition for singly-linked list.
struct ListNode {
     int val;
     struct ListNode *next;
};
 
struct ListNode* rotateRight(struct ListNode* head, int k) 
{
    if(head==NULL || head->next==NULL || k==0)
    {
        return head;

    }

    struct ListNode *cur=head;
    int length =1;

    while(cur->next!=NULL){
        cur=cur->next;
        length++;
    }

    cur->next=head;
    k=k%length;

    int stepstotail = length-k;

    struct ListNode *newtail =head;

    for(int i=1;i<stepstotail;i++){
        newtail = newtail->next;

    }
    struct ListNode *newhead = newtail->next;  //head can also be used instead of newhead
    newtail->next=NULL;   //cutting

    return newhead;
}
