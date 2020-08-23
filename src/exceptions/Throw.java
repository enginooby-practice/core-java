package exceptions;

import java.rmi.RemoteException;

public class Throw {
	public static void main(String[] args) throws RemoteException{
		System.out.println("Begining of the program...");
		throwsOne(); // terminate the program
		System.out.println("After throwing"); // not execute
	}
 
	public static void throwsOne() throws RemoteException{
		System.out.println("Before throwing");
		throw new RemoteException();
		
	}

}
