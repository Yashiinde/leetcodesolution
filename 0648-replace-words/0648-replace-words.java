class Solution {
    static class Node{
        Node children[]= new Node[26];
        boolean eow=false;
        Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    static Node root;
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static String substring1(String word){
        StringBuilder str=new StringBuilder("");
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null ){
                return word;
            }
            str.append(word.charAt(i));
            curr=curr.children[idx];
            if(curr.eow==true){
                return str.toString();
            }
        }
        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder str1=new StringBuilder("");
        root=new Node();;
        for(int i=0;i<dictionary.size();i++){
            insert(dictionary.get(i));
        }
        String[] words = sentence.split(" ");
        for(String word:words){
            str1.append(substring1(word));
            str1.append(" ");
        }
        return str1.toString().trim();
    }
}