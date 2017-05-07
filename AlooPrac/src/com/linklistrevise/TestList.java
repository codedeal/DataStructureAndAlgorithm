package com.linklistrevise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestList {
	static Scanner sc=new Scanner(System.in);
	public static Integer menuList()
	{
		System.out.println();
		System.out.println("0.Press 0 For Exit");
		System.out.println("1.Entr Node from Front");
		System.out.println("2.Entr Node from Back");
		System.out.println("3.Print Node");
		System.out.println("4.Reverse Link List");
		System.out.println("5.Reverse using Recurssion");
		System.out.println("6.Move elements");
		System.out.println("7.replace element");
		System.out.println("Enter your Choice");
		return sc.nextInt();
		
	}
	//public static List<Operations>li=new ArrayList<>();
	public static Operations op=new Operations();
	public static void main(String[] args) 
	{
       
	   	int count=0;
	   	while((count=menuList())!=0)
	   	{
	   		switch (count) {
	   		
			case 1:
				System.out.println("Enter data to enter");
				   
				   op.insertAtBegin(sc.nextInt());
				break;
	        case 2:
	        	System.out.println("Enter data to enter");
				   
				   op.insertAtLast(sc.nextInt());
				break;
	        case 3:
	        	   op.printAll();
				break;
	        case 4:
		         op.reverseTheList();
	        	break;
	        case 5:
		           op.intiate();
	        	break;
	        case 6:
	        	System.out.println("enter element to search");
	        	op.moveElementNode(sc.nextInt());
	        	break;
	        case 7:
	        	System.out.println("enter no and position");
	        	op.replaceElementAtgivenInput(sc.nextInt(), sc.nextInt());
	        	break;
			default:
				
				break;
			}
	   	}

	}

}
