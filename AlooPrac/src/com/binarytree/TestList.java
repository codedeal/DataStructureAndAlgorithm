package com.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestList {
	static Scanner sc=new Scanner(System.in);
	public static Integer menuList()
	{
		System.out.println();
		System.out.println("0.Press 0 For Exit");
		System.out.println("1.Insert into BT");
		System.out.println("2.Entr Node from Back");
		System.out.println("3.Print Recursive");
		System.out.println("4.Level Order Travelsal");
		
		System.out.println("6.Print BTInorder_Plain");
		System.out.println("7.Print BTPreOrder_Plain");
		System.out.println("8.Print BTPostOrder_Plain");
		System.out.println("9.Find");
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
				   
				   op.insert(sc.nextInt());
				break;
	        case 2:
	        	System.out.println("Enter data to enter");
				   
				  
				break;
	        case 3:
	        	System.out.print("Preorder [");
	   	       op.preorderTree(); System.out.print("]");
	           System.out.println();
	           System.out.print("inorder [");
	           op.inorderTree(); System.out.print("]");
	           System.out.println();
	           System.out.print("Postorder [");
	           op.postorderTree(); System.out.print("]");
				break;
	        case 6:
	            op.inOrderPlain();
				break;
	        case 7:
	           op.preorderTreePlain();
				break;
	        case 8:
	            op.postorderTreePlain();
				break;
	        case 9:
	        	System.out.println("enter data");
	        	op.find(sc.nextInt());
	        case 4:
	        	//  op.levelOrder();
	        	  break;
	        case 10:
	        	//System.out.println("enter data");
	        	op.levelOrderTravesal();
			default:
				
			}
	   	}

	}

}
