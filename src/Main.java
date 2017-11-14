public class Main {
    public static void main(String[] args){
        String str;
        try{
            str = null;
            System.out.println(str.length());
            }catch (NullPointerException e){
            System.out.println("例外が発生しました。");
            System.out.println(e.getMessage());
        }
    }

}
