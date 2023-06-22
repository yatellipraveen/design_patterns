import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main (String args[]) throws IOException{
        String reiterate;
        do{
            System.out.println("Please enter one of the options from below\n");
            System.out.println("1. Commercial \n2. Domestic \n");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String planName=br.readLine();

            GetPlanFactory planFactory = new GetPlanFactory();
            Plan p = planFactory.getPlan(planName);

            if(p == null){
                System.out.println("Invalid Option");
                reiterate = "Y";
                continue;
            }

            System.out.print("Enter the number of units for bill will be calculated: ");
            int units=Integer.parseInt(br.readLine());

            System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
            p.getRate();
            p.calculateBill(units);

            System.out.println("Do you want to continue");
            reiterate = br.readLine();
        }while(reiterate.equalsIgnoreCase("Y"));

    }
}
