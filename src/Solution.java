import java.util.Objects;


class BinaryTree {
    BinaryTree left;
    BinaryTree right;
    Integer value;

    public void add(int value) {
        if (Objects.isNull(this.value)) {
            this.value = value;
        } else {
            if (value >= this.value) {
                if (right == null) {
                    right = new BinaryTree();
                    right.value = value;
                } else {
                    right.add(value);
                }
            } else {
                if (left == null) {
                    left = new BinaryTree();
                    left.value = value;
                } else {
                    left.add(value);
                }
            }
        }
    }
}
public class Solution {

    public static void main(String[] args) {
//        define list of names
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(4);
        binaryTree.add(3);
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(6);
        binaryTree.add(5);

        BinaryTree binaryTree2 = new BinaryTree();

        BinaryTree binaryTree3 = new BinaryTree();
        binaryTree3.add(1);

        int level = 3;
//        call sort method
        int result = calculate(binaryTree, level);
//        print result
        System.out.println(result);

    }

    private static int calculate(BinaryTree tree, int level) {
        // check if level equals 1 and our tree is not empty then return 1 else 0
        if (level == 1) {
            return tree.value != null ? 1 : 0;
        }
        // return sum calls method calculate for left and right nodes with level + 1
        return calculate(tree.right, 2, level) + calculate(tree.left, 2, level);
    }

    private static int calculate(BinaryTree tree, int currentLevel, int level) {
        // check node is empty, if it's empty then return 0
        if (Objects.isNull(tree) || Objects.isNull(tree.value)) {
            return 0;
        }
        // check if it's level that we need, then return 1
        if (level == currentLevel) {
            return 1;
        }
        // else return sum calls calculate for left and right nodes with level + 1
        return calculate(tree.right, currentLevel + 1, level) + calculate(tree.left, currentLevel + 1, level);
    }
}
