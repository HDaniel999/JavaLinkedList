package com.linkedlist.app;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.HashMap;

import java.util.Random;
import java.util.Iterator;

public class LinkedListApp {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS = 100;

		LinkedList<Byte> myList = new LinkedList<Byte>();
		ArrayList<Short> myList2 = new ArrayList<Short>();
		Stack<Integer> myStack = new Stack<Integer>();
		PriorityQueue<Double> myQueue = new PriorityQueue<Double>();
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
		
		Random numbers =new Random();
		
		myList.add((byte)5);
		myList.add((byte)10);
		myList.add((byte)20);
		myList.add((byte)30);
		myList.add((byte)40);
		myList.set(0, (byte)2); //This is slower than arraylist
		System.out.println(myList.get(1)); //This method is better in arraylist too
		System.out.println(myList);
		/*
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList);
		*/
		
		Byte number =2;
		System.out.println(myList.size());
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains(number));
		myList.clear();
		System.out.println(myList);
		
		for(int i=0;i<ELEMENTS;i++)
		{
			myList.add((byte) numbers.nextInt());
		}
		System.out.println(myList);
		
		Iterator myIterator = myList.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		for(Byte myNumber : myList)
		{
			System.out.println(myNumber);
		}
		
		/////////////////////////////////////////
		//MyList2 Array List
		
		myList2.add((short) 5);
		myList2.add((short) 10);
		myList2.add((short) 20);
		myList2.add((short) 30);
		myList2.add((short) 40);
		System.out.println(myList2);
		
		myList2.set(0, (short) 2);
		
		System.out.println(myList2.get(2));
		System.out.println(myList2);
		System.out.println(myList2.remove(2));
		System.out.println(myList2);
		
		myIterator = myList2.iterator();
		while(myIterator.hasNext())
		{
			System.out.println(myIterator.next());
		}
		
		for(Short myShort:myList2)
		{
			System.out.println(myShort);
		}
	}

}
