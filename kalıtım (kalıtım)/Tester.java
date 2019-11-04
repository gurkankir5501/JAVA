public class Tester extends Working {

    private String profession;

    public void Tester(int staffNumber, String name,
                       String gender, int birthYear,
                       int salary, String password,
                       String profession){
        
        super.Working(staffNumber,name,gender,birthYear,salary,password);
         
        this.profession = profession;
        
    }

    public void showInfo(String profession){

        super.showInfo();

        System.out.println("profession : " + profession);
    }

    public void setProfession(String profession){

        this.profession = profession;    
    }
    public String getProfession(){

        return this.profession;
    }
}