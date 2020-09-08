package day07;

import java.rmi.RemoteException;

public class ExcepDemo01 {
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }

    public void withdraw(double amount) throws RemoteException, Exception
    {
        // Method implementation
    }
    //Remainder of class definition
}

