public class LeetCodeTest {

    /*public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode a = mergeTwoLists(l1, l2);
        ListNode b = a;
        for(int i=0; i<6; i++){
            System.out.println(b.val);
            b = b.next;
        }

    }*/

    public static void main(String[] args) {
        /*ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);*/
        ListNode last = null;
        if(last.next != null && last != null){
            System.out.println("aaa");
        }else{
            System.out.println("xxxx");
        }
        //last.next = l1;
        /*for(int i=0; i<6; i++){
            System.out.println(last.val);
            last = last.next;
        }*/
        /*ListNode a =  null;//这样的话，只能判断if(a == null)不能判断if(a==null && a.next==null),这样会报空指针异常
        if(a == null) System.out.println("aaa");
        ListNode b = new ListNode(1);
        if(b.next != null && b.next.next != null){
            System.out.println("bbb");
        }else{
            System.out.println("cccc");
        }*/
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode last = null;
        //因为这个才超时的，不确定这样写是否又问题

        if(l1 == null) return l2;
        if(l2 == null) return l1;
        //方法2把上面两行去掉了，因为它用了哑节点，且没有下面一行代码，去掉之后也不影响结果
        last = l1.val <= l2.val ? l1 : l2;
        ListNode first = last;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                last.next = l1;
                l1 = l1.next;
            }else{
                last.next = l2;
                l2 = l2.next;
            }
            last = last.next;
        }
        //if(l1 == null) last.next = l2;
        //if(l2 == null) last.next = l1;
        //上面这两行可以化简为一行：
        last.next = l1==null ? l2: l1;
        return first;
    }
}
