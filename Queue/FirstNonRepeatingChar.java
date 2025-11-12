import java.util.*; 
//in this problem we print the first no repeating char of each character of a string
// ex. aabccxb  == a-1bbbxx
public class FirstNonRepeatingChar {
    public static StringBuilder firstNonRepeatingChar(String s){
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        char ch;
        int [] freq = new int [26];

        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                q.add(ch);
                
            }
            
                
            while(!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();

            }
            if(q.isEmpty()){
                sb.append("-1");
            }
            else{
            
            sb.append(q.peek());
            }
        }
        return sb;

    }


    public static void main(String[] args) {
        String s = "aabccxb";
        StringBuilder result = firstNonRepeatingChar(s);
        System.out.println(result);
        
    }
    
}
