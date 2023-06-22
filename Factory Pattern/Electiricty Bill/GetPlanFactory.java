public class GetPlanFactory {

    public Plan getPlan(String planType){

        if (planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }
        else if (planType.equalsIgnoreCase("Commercial")){
            return new CommercialPlan();
        }
        return null;
    }
}
