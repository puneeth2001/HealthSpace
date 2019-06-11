# include<stdio.h>
# include<stdlib.h>
struct Node
{
    int data;
    struct Node* link;
};

struct Node* Insert(struct Node* head,int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->link = NULL;
    if(head==NULL){
        head=temp;
    }
    else{
        struct Node* temp1 = head;
        while(temp1->link!=NULL){
            temp1=temp1->link;
        }
            temp1->link=temp;
    }
    return head;
}
void Print(struct Node* po){
    if(po==NULL){
        return;
    }
    printf("%d", po->data);  //exchange 29 and 20 lines for printing reverse
    Print(po->link);
}
int main(){
    struct Node* head=NULL;
    head=Insert(head,2);
    head=Insert(head,3);
    head=Insert(head,4);
    Print(head);
}