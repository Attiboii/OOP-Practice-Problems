

public class Trees{

    Node root;
    public void addNode(int key, String name){

        Node newNode = new Node(key, name);
        if (root == null){
            root = newNode;
        }

        else{

            Node focusNode = root;

            Node parent;
            while(true){

                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode ==null){

                        parent.leftChild = newNode;
                        return;

                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;

                    }

                }

            }
        }

    }

    public void inOrderTraverse(Node focusNode){

        if(focusNode !=null){
            inOrderTraverse(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverse(focusNode.rightChild);

        }

    }

    // public void preOrderTraverse(Node focusNode){

    //     System.out.println(focusNode);

    //     preOrderTraverse(focusNode.leftChild);
        
    //     preOrderTraverse(focusNode.rightChild);



    // }
    
    // public void postOrderTraverse(Node focusNode){

        

    //     postOrderTraverse(focusNode.leftChild);
        
    //     postOrderTraverse(focusNode.rightChild);

    //     System.out.println(focusNode);


    // }

    public static void main(String[] args){
        
        Trees tree = new Trees();

        tree.addNode(50, "Boss");
        tree.addNode(25, "VP");
        tree.addNode(15, "Manager");
        tree.addNode(30, "sales");
        tree.addNode(75, "Sales Manager");
        tree.addNode(85, "Secretary");

        tree.inOrderTraverse(tree.root);


    }




}
class Node{


    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name){

        this.key = key;
        this.name = name;

    }
    public String toString(){


        return name + " has a key " + key;

    }

}