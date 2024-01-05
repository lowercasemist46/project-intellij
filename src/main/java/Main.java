public class Main {
    public static void main(String[] args) {
        printHeader();
        printMessage("Hello world!");
        printMessage("By: Timothy");
    }

    private static void printMessage(String message){
        System.out.println(message);
    }


    private static void printHeader(){
        System.out.println("**********************************");
    }
}
