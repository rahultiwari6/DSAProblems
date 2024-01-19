public class SearchInString {
    public static void main(String[] args) {
    String str="Rahul";
    char target = 'u';
        System.out.println(Search(str,target));
    }
    static int Search(String str, char target){
        if(str.length()==0){
            return -1;
        }

        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return i;
            }
        }
        return -1;

    }
}
