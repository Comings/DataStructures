package com.Coming.leetCode.offer;


import java.util.List;

/**
 * 判断是否回文链表
 * @author Coming
 * @date 2022/4/13 8:24
 */
//定义链表
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val = val;};
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Palindrome {

    private static ListNode frontPointer;

    public static void main(String[] args) {
        //模拟创建一个链表
        ListNode head = new ListNode(5);
        ListNode cur = head;
        for(int i=1;i<=5;i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        //打印结果
        System.out.println(isPalindrome(head));
    }
    //判断是否是回文链表
    public static boolean isPalindrome(ListNode head){
        frontPointer = head;
        return recursion(head);
    }
    public static boolean recursion(ListNode head){
        if(head!=null){
           if(!recursion(head.next)) return false;
           if(head.val != frontPointer.val) return false;
           frontPointer = frontPointer.next;
        }
        return true;
    }
}
