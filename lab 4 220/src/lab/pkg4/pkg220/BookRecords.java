/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.pkg220;
import java.util.Scanner;
/**
 *
 * @author Akash
 */
public class BookRecords {
    Scanner x=new Scanner(System.in);
    Scanner forint=new Scanner(System.in);
    int size=0;
    Book[]a=new Book[2];
    public void AddRecords(){
        if(size<=a.length-1){

        
        a[size]=new Book();
        System.out.println("Give me book's name");
        a[size].Name=x.nextLine();
        System.out.println("Give me book's id");
        a[size].ID=forint.nextInt();
        System.out.println("Give me book's author");
        a[size].Author=x.nextLine();
        System.out.println("Give me book's publisher");
        a[size].Publisher=x.nextLine();
        size++;
        }
        else{
                       a=reSize();
                       AddRecords();
                       
        }
        
    }
    public Book [] reSize(){
        Book[]b=new Book[a.length*2];
        for(int f=0;f<a.length;f++){
            b[f]=a[f];
        }
        return b;
    }
    public void Printrecords(){
        for(int c=0;c<size;c++){
            for(int i=0;i<size-1;i++){
                if(a[i].Name.compareTo(a[i+1].Name)>0){
                    Book temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    
                }
            }
            
        }
        for(int v=0;v<size;v++){
            System.out.println("Name: "+a[v].Name+" ID: "+a[v].ID+" author: "+a[v].Author+" Publisher"+a[v].Publisher);
        }
    }
    public void DeleteRecord(){
        System.out.println("give me the book's id to delete");
        int b=forint.nextInt();
        for(int d=0;d<size;d++){
            if(a[d].ID==b){
                for(int g=d;g<size;g++){
                    a[g]=a[g+1];
                }
                a[size-1]=null;
                size--;
               
            }
           
        }
    }
    public void EditRecord(){
        System.out.println("give me your book's id");
        int r=forint.nextInt();
        for(int l=0;l<size;l++){
            if(a[l].ID==r){
                System.out.println("give me new Book name");
                a[l].Name=x.nextLine();
                System.out.println("give me new Book's author's name");
                a[l].Author=x.nextLine();
                 System.out.println("give me new Book's publisher");
                 a[l].Publisher=x.nextLine();
            }
        }
        
    }
    
}
