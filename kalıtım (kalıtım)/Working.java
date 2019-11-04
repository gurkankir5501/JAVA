public class Working {

    private int staffNumber ;
    private String name ;
    private String gender;
    private int birthYear;
    private int salary;
    private String password;

    public void Working(int staffNumber, String name, String gender, int birthYear,int salary,String password){

        this.staffNumber = staffNumber;
        this.name = name;
        this.gender = gender;
        this.birthYear = birthYear;
        this.salary = salary;
        this.password = password;
    }

    public void showInfo(){

        System.out.println("staffnumber : " + staffNumber + "\n" +
                           "name : " + name + "\n" + 
                           "gender : " + gender + "\n" +
                           "birthyear : " + birthYear + "\n" +
                           "salary : " + salary );
    }

    public void setStaffNumber(int staffnumber){

        this.staffNumber = staffnumber;
    }
    public int getStaffNumber(){

        return this.staffNumber;
    }

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return this.name;
    }

    public void setGender(String gender){

        this.gender = gender;
    }
    public String getGender(){

        return this.gender;
    }

    public void setBirthYear(int birthYear){

        this.birthYear = birthYear;
    }
    public int getBirthYear(){

        return this.birthYear;
    }

    public void setSalary(int salary){

        this.salary = salary;
    }
    public int getSalary(){

        return this.salary;
    }

    public void setPassword(String password){

        this.password = password;
    }
    public String getPassword(){

        return this.password;
    }


}