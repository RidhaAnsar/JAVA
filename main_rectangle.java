//define a class rectangle with member variables length and width.
//use appropriate member functions to calculate the perimeter of area and rectangle.
//define another member function int samearea(rectangle r) that has one parameter of type rectangle which returns 1 if the two rectangls have the same area and //returns 0 if //they dont.
//usee appropriate constructors to initialize the member  variables(use def and parametrized cons).
//write main function to creae 2 rectangle obj and display its area and perim,eter 
//chck whther the 2 rect have same area and print a msg indictaing the result(use the concept of this pointer)



//progran
import java.io.*;
class Rectangle {
   float length, width,area,perimeter;
   public Rectangle(int length , int width ) {   //parameterized constructor
   this.length=length;
   this.width=width;
   area=length*width;
   perimeter=2*(length+width);
   }
public boolean SameArea(Rectangle r) {
    if(r.area==area)  {
          return true;}
       else {
          return false; 
} 
} 
}
class main_rectangle {
   public static void main(String args[])  {
   Rectangle r1=new Rectangle(10,20);
   Rectangle r2=new Rectangle(10,20);
   System.out.println("AREA OF FIRST RECTANGLE:"+r1.area);
   System.out.println("AREA OF SECOND RECTANGLE:"+r2.area);
   if (r1.SameArea(r2)) 
   System.out.println("SAME");
   else 
   System.out.println("NOT SAME");
   }
 } 

   