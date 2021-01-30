public class Constructor {
     //public static void main(String[] args) {}

        private int number;
        private String customerName;
        private String emailAddress;

        Constructor ( int number, String customerName ,String emailAddress){
            this.number =number;
            this.customerName = customerName;
            this.emailAddress = emailAddress;
            System.out.println("number:"+number);
            System.out.println("customerName :" + customerName);
            System.out.println("emailAddress : " + emailAddress);

        }

}
