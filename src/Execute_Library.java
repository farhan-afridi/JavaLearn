import java.util.*;
class Execute_Library
{
    public static void main (String[] args)
    {
        Scanner in =new Scanner (System.in);
        String s ="";
        
        Library l = new Library();
        
        System.out.println ("Press..... \n 1 to Issue Book \n 2 to Add Book \n 3 to Return Book");
        int a = in.nextInt();
        l.showAvailableBooks();
        
        if(a==1)
        {
            System.out.println ("Enter Book Name to Issue");
            s = in.next();
            l.issueBook(s);
        }
        else if (a==2)
        {
            System.out.println ("Enter Book Name to Add");
            s = in.next();
            l.addBook(s);
        }
        else if (a==3)
        {
            System.out.println ("Enter Book Name to Return");
            s = in.next();
            l.returnBook(s);
        }
        l.showAvailableBooks();
    }
}

class Library
{
    String[] bookAvail = {"Breaking Bad", "Game of Thrones", "Jack_Sparrow", "Sons of Anarchy","Mr. Robot", "Better call Saul", "Django Unchained","Wolf Street","Harry Potter"," "};
    String[] bookIssue = {" "," "," "," "," "," "," "," "," "," "};  

    public void addBook(String s)
    {
        int i ; 
        for (i = 0 ; i<10 ; i++)
        {
            if (bookAvail[i]==" ")
            {
                bookAvail[i] = s ;
            }
        }
    }
    public void issueBook(String q)
    {
        int i ,c=0;
        for (i = 0 ; i<10 ; i++)
        {
            if (bookIssue[i]==" " && c==0)
            {
                bookIssue[i] = q ;
                c++;
            }
        }
        System.out.println ("Issued List");
        for ( i = 0 ; i<10 ; i++)
        {
            System.out.println ((i+1)+") "+bookIssue[i]);
        }
        for(i = 0 ;i<10 ; i++)
        {
            if (bookAvail[i].equals(q))
            {
                bookAvail[i]="";
            }
        }
    }
    public void returnBook(String w)
    {
        int i ; 
        for (i = 0 ; i<10 ; i++)
        {
            if (bookAvail[i]==" ")
            {
                bookAvail[i] = w ;
            }
        }
    }
    public void showAvailableBooks()
    {
        int i ; 
        for ( i = 0 ; i<10 ; i++)
        {
            System.out.println ((i+1)+") "+bookAvail[i]);
        }
    }
}