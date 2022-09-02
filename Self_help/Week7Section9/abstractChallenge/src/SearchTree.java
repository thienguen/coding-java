public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) 
    {   // the list was empty, so this item is the new head, one Node
        if (this.root == null) 
        {   // the new tree
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) 
        {   // comparisonto gave us teh value se we know 
            // where the item will be in the list
            int comparison = (currentItem.compareTo(newItem));

            if (comparison < 0) 
            {   // newItem is greater, move right
                if (currentItem.next() != null) 
                {   // go to the right of the list
                    currentItem = currentItem.next();
                } 
                else 
                {   // we reach the end of the list, add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } 
            else if (comparison > 0) 
            {   // newItem is less, insert before, move left?
                if (currentItem.previous() != null) 
                {   // if we are at the middle of the list,
                    // and the next node is greater than us
                    currentItem = currentItem.previous();
                } 
                else 
                {   // this is where we actually add the list
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } 
            else 
            {   // equal so don't need to
                System.out.println(newItem.getValue() + " is already present, not added.\n");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) 
    {   // check for null
        if (item != null) 
        {
            System.out.println("Deleting item " + item.getValue() + "\n");
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) 
        {   // cpmraison gave us the value se we know what to do
            int comparison = (currentItem.compareTo(item));

            if (comparison < 0) 
            {
                parentItem  = currentItem;
                currentItem = currentItem.next();
            } 
            else if (comparison > 0) 
            {
                parentItem  = currentItem;
                currentItem = currentItem.previous();
            } 
            else 
            {   // we remove it here
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) 
    {   // remove item from the tree
        if (item.next() == null) 
        {   // no right tree, so make parent point to the left tree
            if (parent.next() == item) 
            {   // item is right child of its parent
                parent.setNext(item.previous());
            } 
            else if (parent.previous() == item) 
            {   // item is left child of its parent
                parent.setPrevious(item.previous());
            } 
            else 
            {   // parent must be item, root of the tree
                this.root = item.previous();
            }
        } 
        else if (item.previous() == null) 
        {   // no left tree so make parent point to the right tree
            if (parent.next() == item) 
            {   // item is right child of its parent
                parent.setNext(item.next());
            } 
            else if (parent.previous() == item) 
            {   // item is left child of its parent
                parent.setPrevious(item.next());
            } 
            else 
            {   // parentItem must be item, root of the tree
                this.root = item.next();
            }
        } 
        else 
        {   // neither left nor right are null, deleteion
            // From the right sub-tree, find the smallest value
            ListItem current = item.next();
            ListItem leftMostParent = item;

            while (current.previous() != null) 
            {   // find the left most node
                leftMostParent = current;
                current = current.previous();
            }

            // now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            
            // and delete the smallest
            if (leftMostParent == item) 
            {   // there was no leftmost node,
                item.setNext(current.next());
            } 
            else 
            {   // set the smallest
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) 
    {   // recursive method
        if (root != null) 
        {   
            traverse(root.previous());
            System.out.print(root.getValue() + " --> ");
            traverse(root.next());
        }
    }
}
