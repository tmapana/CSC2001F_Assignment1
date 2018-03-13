// BinaryTreeNode program
// Tlotliso Mapana
// 12 March 2018

public class BinaryTreeNode<dataType>
{
   String data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;

   public BinaryTreeNode ( Dam d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d.toString();
      left = l;
      right = r;
   }

   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }

}
