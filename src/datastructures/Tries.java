package datastructures;
import java.util.*;

class TrieNode{
    HashMap<Character, TrieNode> children;
    boolean isWord;

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

    //Add a new string to the trie
    public void insert(String word){
        TrieNode current = root;
        //Change the input word into a character array and iterate through each character
        for(char ch : word.toCharArray()){
            //Add the character node if not already present
            current.children.putIfAbsent(ch, new TrieNode());
            //Moves current to the next node if character present or added
            current = current.children.get(ch);
        }
        //Sets end of word to true
        current.isWord = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            if (current.children.containsKey(ch)){
                current = current.children.get(ch);
            }else{
                return false;
            }
        }
        return current.isWord;
    }
}
