public class Developer extends Working {

    private String university ;
    private int graduationYear ;

    public void Developer(int staffNumber, String name,
                          String gender, int birthYear,
                          int salary, String password, String university,
                          int graduationYear){
        
        super.Working(staffNumber,name,gender,birthYear,salary,password);
        this.university = university;
        this.graduationYear = graduationYear;
        
    }

    public void showInfo(String university,int graduationYear){

        super.showInfo();
        System.out.println("university : " + university + "\n" + 
                           "graduationYear : " + graduationYear);
    }

    public void setUniversity(String university){

        this.university = university;
    }
    public String getUniversity(){

        return this.university;
    }

    public void setGraduationYear(int graduationYear){

        this.graduationYear = graduationYear;
    }
    public int  getGraduationYear(){

        return this.graduationYear;
    }


}