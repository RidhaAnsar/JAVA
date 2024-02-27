import java.io.*;
class Complx
{
	float r;
	float i;
	public void read()
    {
        DataInputStream din=new DataInputStream(System.in);
        try{
            System.out.println("Enter the value of r:");
            r=Float.parseFloat(din.readLine());
            System.out.println("Enter the value of i:");
            i=Float.parseFloat(din.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
    public void disp(){
        System.out.println("r="+r+"i="+i);
    }
    public Complx mult(Complx q){
        Complx t=new Complx();
        t.r=r*q.r-i*q.i;
        t.i=r*q.i-i*q.r;
        return t;
    }
}
class MComplex{
    public static void main(String args[]){
        Complx p,q,r;
        p=new Complx();
        q=new Complx();
        p.read();
        q.read();
        r=p.mult(q);
        p.disp();
        q.disp();
        r.disp();
    }
}
