# include<stdio.h>
# include<stdlib.h>
struct Node
{
    int data;
    struct Node* link;
};
struct Node* head;
int Insert(int val){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data=val;
    temp->link=head;
    head=temp;
}
int Print(){
    struct Node* temp = head;
    while(temp != NULL){
        printf("%d", temp->data);
        temp=temp->link;
    }
}
int Reverse(){
    struct Node *current,*next,*prev;
    current=head;
    prev=NULL;
    while(current !=NULL){
        next=current->link;
        current->link=prev;
        prev = current;
        current = next;
    }
}
int main(){
    int n,val;
    scanf("%d", &n);
    for(int i=0;i<n;i++){
        scanf("%d", &val);
        Insert(val);
    }
    Print();
    Reverse();
    Print();
}