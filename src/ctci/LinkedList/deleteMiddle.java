package ctci.LinkedList;

public class deleteMiddle {



    public void deleteMid(Node n){

        if(n == null || n.next == null){
            return;
        }

        Node newMid = n.next;
        n.data = newMid.data;
        n.next = newMid.next;

    }


    public static void main(String[] args){





    }

}
