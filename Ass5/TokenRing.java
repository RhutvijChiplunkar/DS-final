import java.util.*;

public class TokenRing{
    public static void main(String[] args) {
        //take no of nodes and print them
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of nodes in ring:");
        int n=sc.nextInt();

        System.out.println("Ring formed is as below");
        for(int i=0;i<n;i++){
            System.out.print(i + " ");
        }
        System.out.println("0");


        int ch=0;

        do{
            System.out.print("Enter sender:");
            int sender=sc.nextInt();

            System.out.print("Enter receiver:");
            int receiver=sc.nextInt();
            
            System.out.print("Enter data to send:");
            int data=sc.nextInt();

            int token=0;

            System.out.print("Token Passing");

            for(int i=token;i<sender;i++){
                System.out.print(" "+i + "->");
            }

            System.out.println(" "+sender);
            System.out.println("Sender " + sender + "is sending data "+ data);


        //for receiver's end
            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("Data "+data + " forwarded by "+i);
            }
            System.out.println("Receiver " + receiver + " received the data "+ data);

        token=sender;

        //continue loop or not
        System.out.println("Do you want to send again 1) Yes 2)No");
        ch=sc.nextInt();

        }while(ch==1);
    }
}