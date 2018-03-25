package test11;

//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
public class Linklists {

	private static ListNode head;
	private ListNode tail;
	private int size; 
	
	public static void main(String [] args)
	{
		//Scanner scanner = new Scanner(System.in);
		Linklists listi = new Linklists();
		listi.createlinklist(12);
		listi.createlinklist(14);
		listi.createlinklist(18);
		ListNode a = listi.createlinklist(19);
		for(Integer number : listi.printListnode(a))
		{
			System.out.println(number);
		}
		listi.FindKthToTail(head,2);
		
	}
	
	
	public ListNode createlinklist(int num)
	{
		
		if( head == null)
		{
			head = new ListNode(num,null);
			tail = head;
		}else {
			
			ListNode node = new ListNode(num,null);
			tail.next = node;
			tail = node;
		}
		
		return head;
	}
	
	
	public ListNode FindKthToTail(ListNode head,int k)
	{
		if(k < 1 || head == null)
		{	
			return null;
		}
		ListNode firstPointer = head; 
		for(int i = 0; i < (k-1); ++i)
		{
			if(firstPointer.next != null)
			{
				firstPointer = firstPointer.next;
			}
			else
			{
				return null;
			}
		}
		
		while(firstPointer.next != null )
		{
			head = head.next;
			firstPointer = firstPointer.next;
		}

		return head;
	}
	
	
	
	
	public ArrayList<Integer> printListnode(ListNode listNode)
	{
		Stack<Integer> stack = new Stack<>();
		while(listNode != null)
		{
			stack.push(listNode.value);
			listNode = listNode.next;   //move to next node
		}
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 	
	
		while(!stack.empty())
		{
			list.add(stack.pop());
		}		
			return list;
		}
	
	

}
