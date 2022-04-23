package com.Coming.leetCode.offer;


import java.util.List;

/**
 * �ж��Ƿ��������
 * @author Coming
 * @date 2022/4/13 8:24
 */
//��������
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
        //ģ�ⴴ��һ������
        ListNode head = new ListNode(5);
        ListNode cur = head;
        for(int i=1;i<=5;i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        //��ӡ���
        System.out.println(isPalindrome(head));
    }
    //�ж��Ƿ��ǻ�������
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
