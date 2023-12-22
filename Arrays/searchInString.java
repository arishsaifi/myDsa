// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = "haris";
        char target = 'i';
        System.out.println(SearchChar(name,target));
    }
    static int SearchChar(String name,char target){
        if(name.length() == 0){
            return -1;
        }
        for(int i = 0;i<=name.length();i++){
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}