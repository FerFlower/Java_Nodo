function Node(Value){
    this.left = null;
    this.right = null;
    this.Value = value;

}
const root = new Node(6);
const Nodo1 = new Node(1);
const Nodo2 = new Node(4);
const Nodo3 = new Node(5);
const Nodo4 = new Node(8);
const Nodo5 = new Node(9);

root.left = Nodo1;
root.right = Nodo4;

Nodo1.left = Nodo2;
Nodo1.right = Nodo3;
Nodo4.right = Nodo5;

function inorder(node){
    if(node == null){
        return;
    }
    inorder(node.left);
    console.log(node.value);
    inorder(node.right);

}

function preorder(node){
    return;

console.log(node.value);
preorder(node.left);
preorder(node.right);
}





