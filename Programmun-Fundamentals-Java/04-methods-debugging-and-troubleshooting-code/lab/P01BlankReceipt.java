public class P01BlankReceipt {

    public static void main(String[] args){
       PrintBlankReceipt();
    }

    static void PrintBlankReceipt(){
        Header();
        Body();
        Footer();
    }

    static void Header(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    static  void Body(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    static void Footer(){
        System.out.println("------------------------------");
        System.out.println("© SoftUni");
    }
}
