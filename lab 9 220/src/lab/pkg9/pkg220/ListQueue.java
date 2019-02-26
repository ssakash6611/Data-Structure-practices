/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.pkg220;
/**
 *
 * @author User
 */
public class ListQueue{
    public static int p;
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
//TO DO

     public boolean CanDoctorGoHome(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
     public void RegisterPatient(String o) throws QueueOverflowException{
         p++;
         Patient e=new Patient(o,p);
         Node mn=new Node(e,null);
         if(front==null){
             front=mn;
             rear=mn;
             size++;
             
         }
         else{
             rear.next=mn;
             rear=mn;
             size++;
         }
     }
     public Object ServePatient() throws QueueUnderflowException{
         Object v=null;
         Node o=null;
         if(size==0){
            throw new QueueUnderflowException();
                
            }
         else if(front==rear){
             v=front.pat.name;
             o=front;
             front=null;
             rear=null;
             size--;
     }
         else{
             v=front.pat.name;
             o=front;
             front=front.next;
             size--;
         }
          o.next=null;
          o.pat=null;
         return v;
     
}

     public void ShowAllPatient(){
 
         Patient []a=new Patient[size];
         int v=0;
         for(Node t=front;t!=null;t=t.next){
             a[v]=t.pat;
             //a[v].id=t.pat.id;
             v++;
         }
         
         
        for(int c=0;c<size;c++){
            for(int i=0;i<size-1;i++){
                if(a[i].name.compareTo(a[i+1].name)>0){
                    
                    Patient temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    
                }
            }
        }

        

         String j="[ ";
         for(int l=0;l<size;l++){
             j=j+" "+a[l].name+"["+a[l].id+"]";
         }
         j=j+" ]";
         System.out.println(j);
     }
     

     public void CancelAll(){
         front=null;
         rear=null;
         size=0;
     }     
}

