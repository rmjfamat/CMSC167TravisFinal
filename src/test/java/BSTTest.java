import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mmcalvarez on 5/13/2019.
 */
public class BSTTest {
    BST tree = new BST();

    @Test
    public void testRemoveNonExistent() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("krishia");
        try {
            tree.remove("ruffa");
        }catch (Exception e){
            assertEquals(e.getMessage(), "Item to be removed does not exist!");
        }
    }

    @Test
    public void testAdd() throws Exception{
        tree.add("ruffa");
        tree.add("wina");
        try {
            tree.add("ruffa");
        }catch (Exception e){
            assertEquals(e.getMessage(), "Item is already in the tree");
        }
    }

    @Test
    public void testRemoveOneChild() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("krishia");
        tree.remove("mary");
        assertFalse(tree.contains("mary"));
        assertTrue(tree.contains("sab"));
        assertTrue(tree.contains("krishia"));
    }

    @Test
    public void testAddMany() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("krishia");
        tree.add("chez");
        tree.add("uye");
        assertEquals(tree.toString(), "chez krishia mary sab uye ");
    }

    @Test
    public void testContains() throws Exception {
        tree.add("mary");
        tree.add("sab");
        tree.add("chez");
        tree.add("krishia");
        tree.add("dianne");
        assertTrue(tree.contains("mary"));
        assertFalse(tree.contains("cza"));
        assertEquals("Tree is ...", "chez dianne krishia mary sab ", tree.toString());
    }
}
