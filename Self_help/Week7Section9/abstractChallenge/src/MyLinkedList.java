public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) 
        {   // the list was empty, so this item
            // becomes the head of the list
            this.root = newItem;
            return true;
        }

        // traverse the list until we reach the end
        ListItem currentItem = this.root;

        while (currentItem != null) 
        {   // check the first ListItem,
            int comparison = (currentItem.compareTo(newItem));
            
            if (comparison < 0) 
            {   // newItem is greater, move right if possible
                // would likely happen if newItem is the new tail for if else statement
                if (currentItem.next() != null) 
                {
                    currentItem = currentItem.next();
                } 
                else 
                {   // we reach the end of the list, insert here
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } 
            else if (comparison > 0) 
            {   // newItem is less, insert before, move left?
                // would happen if newItem is in the middle
                if (currentItem.previous() != null) 
                {   // insert in the middle of the list
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } 
                else 
                {   // the newItem is the new root or the new head
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } 
            else 
            {   // newItem is equal to currentItem
                System.out.println(newItem.getValue() + " is already present, not added.\n");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) 
    {   // check if it's null
        if (item != null) 
        {   // message
            System.out.println("Deleting item " + item.getValue() + "\n");
        }

        ListItem currentItem = this.root;

        while (currentItem != null) 
        {   // check the first ListItem, this return 0, >=1, and <=-1
            int comparison = currentItem.compareTo(item);

            if (comparison == 0) 
            {   // if the value is the root/head, we skip it
                if (currentItem == this.root) 
                {   // skip the root by go next
                    this.root = currentItem.next();
                }
                else
                {   // if the value is somewhere in the middle of the list
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) 
                    {   // we rewire, but the currentItem is still the node we
                        // not yet delete
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } 
            else if (comparison < 0) 
            {   // not it, move to the right
                currentItem = currentItem.next();
            } 
            else 
            {   // not exist, comparison > 0, mean item still pass 
                // the currentItem, mean we didn't find anything in the list
                return false;
            }
        }
        // we have reached the end of the list, 
        return false;
    }

    @Override
    public void traverse(ListItem root) 
    {   // check empty list
        if (root == null)
        {   // empty
            System.out.println("\nYOU SHALL NOT PASS! SINCE THERE IS NOTHING HERE DUMBASS\n");
        } 
        else 
        {
            while (root != null) 
            {   // output and display the list as we traverse
                System.out.print(root.getValue() + " --> ");
                root = root.next();
            }
            System.out.println("\n");
        }
    }
}
