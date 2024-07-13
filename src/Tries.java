import java.util.*;

class TrieNode{
    private HashMap<Character, TrieNode> children;
    private boolean isWord;

    public TrieNode(){
        children = new HashMap<>();
        isWord = false;
    }
}

public class Tries {
    private TrieNode root;

    public Tries(){
        root = new TrieNode();
    }

    public void insert(){

    }
}
