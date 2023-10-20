import java.util.HashSet;
public class uniquesequ {
    public static void unique(String a,int idx,String newstr,HashSet<String> map){
        if(idx == a.length()){
        if(map.contains(newstr)){
            return;
        }else{
            System.out.println(newstr);
            map.add(newstr);
            return;
        }}
        char currchar = a.charAt(idx);
        unique(a, idx+1, newstr+currchar,map);
        unique(a, idx+1, newstr,map);
    }
    public static void main(String args[]){
        String g = "aaa";
        HashSet<String> map = new HashSet<>();
        unique(g, 0, "",map);
    }
}
