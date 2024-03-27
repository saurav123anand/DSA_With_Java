import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        BST bst=new BST();
//        //bst.populate(new int[]{5,2,7,1,4,6,9,8,3,10});
//        bst.populatedSorted(new int[]{1,2,3,4});
//        bst.display();

//        AVL avl=new AVL();
//        for(int i=0;i<1000;i++){
//            avl.insert(i);
//        }
//        System.out.println(avl.height());

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
         tree.display();

        //System.out.println(tree.query(1, 6));
    }

}