public class HuffmanTree {
    
    HuffmanNode root;

    public HuffmanTree() {
        root = null;
    }

    public HuffmanTree(HuffmanNode huff) {
        this.root = huff;
    }
    
    private void printLegend(HuffmanNode t, String s) {
        if  (t.letter.length() > 1) {
            printLegend(t.left, s + "0");
            printLegend(t.right, s + "1");
        }
        else {
            if (t.letter.charAt(0) == '\n') {
                System.out.println("'\\n'"+"="+s);
            }
            else {
                System.out.println("'" + t.letter+"' = "+s);
            }
        }
        
    }
    public void printLegend() {
        printLegend(root, "");
    }

    public static BinaryHeap<HuffmanNode> legendToHeap(String legend) {
        String [] input = legend.split(" ");

        //for(String test : input) { //test
        //    System.out.print(test); //test
        //} //test

        HuffmanNode [] nodes = new HuffmanNode [input.length / 2];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new HuffmanNode (input[i*2], Double.parseDouble(input[(i*2)+1]));
        }

        return new BinaryHeap<HuffmanNode>(nodes);
    }

    public static HuffmanTree createFromHeap(BinaryHeap<HuffmanNode> b) {

        for (int i = 0; i < b.getSize()-1; i ++) {
            HuffmanNode left = b.deleteMin();
            //System.out.println(b.findMin()); //test
            HuffmanNode right = b.deleteMin();
            HuffmanNode temp = new HuffmanNode(right, left);
            b.insert(temp);
        }

        return new HuffmanTree((HuffmanNode) b.findMin());
    }


    /*
    public static void main(String[] args) {
        String legend = "A 20 E 24 G 3 H 4 I 17 L 6 N 5 O 10 S 8 V 1 W 2";

        //String legend = "a 1 b 1 c 2 d 3 e 5 f 8 g 13 h 21"; //test

        BinaryHeap<HuffmanNode> bheap = legendToHeap(legend);
        bheap.printHeap();

        //System.out.println(bheap.findMin()); //test

        HuffmanTree htree = createFromHeap(bheap);
        htree.printLegend();

    }
     */

}