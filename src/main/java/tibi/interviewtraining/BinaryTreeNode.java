package tibi.interviewtraining;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mycomputericons on 7/1/2018.
 */
@Data
public class BinaryTreeNode<T extends Comparable, U> {

    private final T key;
    private final U value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
}
