# include<stdio.h>
# include<stdlib.h>
struct Node
{
    int data;
    struct Node* link;
};
struct Node* head;
void insert(int val, int pos){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data=val;
    temp->link=NULL;
    if(pos = 1){
        
        temp->link=head;
        head = temp;
        return;
    }
struct Node* temp1 = head;
    for(int i=0;i<pos-2;i++){
        temp1=temp1->link; 
    }
    temp->link = temp1->link;
    temp1->link=temp;
    
    }
/* int print(){
    struct Node* temp = head;
    while(temp != NULL ){
        printf("%d", temp->data);
        temp=temp->link;
    }
    
}*/
int main(){

    insert(2,0);
 //   print();
    }

