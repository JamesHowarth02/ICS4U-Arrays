package SamplePrograms.ArrayMethods;

public class IceCreamSurvey {

    public static void main(String[] args) {
        String survey[][] = {
            {"StudentA", "FlavourA"},
            {"StudentB", "FlavourB"},
            {"StudentC", "FlavourB"},
            {"StudentD", "FlavourC"},
            {"StudentE", "FlavourA"}
        };
        
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j == 0? "Name" : "Flavour");
                System.out.println("\t" + survey[i][j]);
            }
        }
        
        String anames[] = getList(survey, "FlavourA");
        String bnames[] = getList(survey, "FlavourB");
        String cnames[] = getList(survey, "FlavourC");
        
        for (int i = 0; i < anames.length; i++) {
            System.out.println(anames[i]);
        }
        
    }
    
    public static String[] getList(String data[][], String flav) {
        String names = "";
        for (int i = 0; i < data.length; i++) {
            if(flav.equals(data[i][1])) {
                names+=data[i][0];
            }
        }
        return names.split(",");
    }
    
}
