import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

//constructor
public class HuffmanConverter{

        // ASCII number of characters
        public static final int NUMBER_OF_CHARACTERS = 256;

        private String contents;
        private HuffmanTree huffmanTree;
        private int count[];
        private String code[];

        // Construct using an input string.
        // Initialize count and code.
        public HuffmanConverter(String input) {
          this.contents = input;
          this.count = new int[NUMBER_OF_CHARACTERS];
          this.code = new String[NUMBER_OF_CHARACTERS];
        }

        // Record how often each character occurs and store in count.
        public void recordFrequencies() {
            char [] messageArr = contents.toCharArray();

            for (char element : messageArr) {
                count[(int) element] += 1;
            }

            for (int i=0; i < count.length; i++) {
                if (count[i] > 0) {
                    if ((char)i == '\n') {
                        System.out.print("<" + "\\n" + ", " + count[i] + "> ");
                    }
                    else {
                        System.out.print("<" + Character.toString((char)i) + ", " + count[i] + "> ");
                    }
                }
            }
            System.out.println();

        }

        // Construct a Huffman tree from count and 
        // store the tree in huffmanTree.
        public void frequenciesToTree() {
            int next = 0; //next available index
            HuffmanNode [] items = new HuffmanNode[next];

            for (int i = 0; i < count.length; i ++) { 
                if (count[i] > 0) { //only if freq > 0, add to items
                    HuffmanNode [] save = items;
                    items = new HuffmanNode[next +1];
                    for (int j=0; j< save.length; j++) { //make a new array with one more space
                        items[j] = save[j];
                    }

                    char n = (char) i;
                    items[next] = new HuffmanNode(String.valueOf(n), Double.valueOf(count[i]));
                    next++;
                } 
            }

            BinaryHeap<HuffmanNode> bheap = new BinaryHeap<>(items);

            huffmanTree = HuffmanTree.createFromHeap(bheap);
            
        }

        // Construct code from huffmanTree.
        public void treeToCode() {
            for (int i = 0; i < code.length; i++) {
                code[i] = "";
            }
            treeToCode(huffmanTree.root, "");
            huffmanTree.printLegend();
        }

        private void treeToCode(HuffmanNode t, String encoding) {
            if (t.left == null && t.right == null) { //if is leaf
                code[(int) t.letter.charAt(0)] = encoding;
            }
            else {
                if (t.right != null) {
                    treeToCode(t.right, encoding + "1");
                }
                if (t.left != null) {
                    treeToCode(t.left, encoding + "0");
                }
                
            }

        }

        // Encode content using code.
        public String encodeMessage() {
            String huffString = "";
            //int asciiSize = 0;
            //int huffSize = 0;
            char [] messageArr = contents.toCharArray();  //for every char, add huff code to huffstring
            for (char element: messageArr) {
                huffString += code[(int)element];
                //asciiSize++;
                //huffSize += code[(int)element].length();
            } 
            System.out.println("Huffman Encoding: ");
            return huffString;
        }
        
        // Decode a Huffman encoding.
        public String decodeMessage(String encodedStr) {
            String decoded = "";

            HuffmanNode node = huffmanTree.root;
            for (int i = 0; i < encodedStr.length(); i++) {
                if (node.left == null && node.right == null) {
                    decoded += node.letter;
                    node = huffmanTree.root;
                }

                if (encodedStr.charAt(i) == '0') {
                    node = node.left;
                }
                else if (encodedStr.charAt(i) == '1') {
                    node = node.right;
                }
                else {
                    System.out.println(encodedStr.charAt(i) + "invalid?");
                    break;
                }
            }
            
            return decoded;
        }

        // Read an input file.
        public static String readContents(String filename) {
            String temp = "";
            try {
                File file = new File(filename);
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    temp += sc.nextLine();
                    temp += "\n";
                }
                sc.close();
                return temp;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return "";
        }

        public static void main(String args[]) {
                String input = HuffmanConverter.readContents(args[0]);
                HuffmanConverter h = new HuffmanConverter(input);
                h.recordFrequencies();
                // Print a list of characters and frequencies here!
                h.frequenciesToTree();
                h.treeToCode();
                // Print the Huffman encoding here!
                String encoded = h.encodeMessage();
                System.out.println(encoded+"\n");
                System.out.println("Message size in ASCII encoding: "+h.contents.length()*8);
                System.out.println("Message size in Huffman coding: "+encoded.length()+"\n");
                System.out.println(h.decodeMessage(encoded));
        }

}
