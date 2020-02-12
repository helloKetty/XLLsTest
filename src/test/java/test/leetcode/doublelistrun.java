package test.leetcode;

import org.junit.Test;

public class doublelistrun {
    @Test
    public void run(){
        ListNode l1=new ListNode(1) ;
        System.out.println("初始化类型"+l1.next==null);
        ListNode l2=new ListNode(2) ;
        ListNode l11=l1;
        ListNode l22=l2;
        for(int i=4;i<7;i++){
            ListNode l=new ListNode(i);
            l11.next=l;
            l11=l11.next;
            l22.next=l;
            l22=l22.next;
        }
        ListNode ls=l1;
        while(ls.next!=null){
            System.out.println(ls.val);
            ls=ls.next;
        }
        ListNode res=addTwoNumbers(l1,l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3=null;
        ListNode l4=null;
        int flag=0;
        while (l1 != null || l2 != null||flag!=0){
            int i=l1!=null?l1.val:0;
            int j=l2!=null?l2.val:0;
             l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
            int sum=i+j+flag;
            if(l3==null) {
                l3=new ListNode((sum)%10);
                l4=l3;
                flag=sum/10;
            }else{
                l4.next=new ListNode((sum)%10);
                l4=l4.next;
                flag=sum/10;
            }
        }
        return l3;
    }
}
