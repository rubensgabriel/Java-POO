package Entitites;
import java.util.ArrayList;

public class Candidatos{
    private String Name;
    private String Gender;
    private int Grade;
    public ArrayList<Candidates> GreaterThanSeventy = new ArrayList<>();

    // Gettter Setters
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }

    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }

    // Methods
    public int getCandidateGradesGreaterSeventy() {
        int g = 0; 
        if(getGrade() > 70) 
            g = getGrade();

        return g;
    }

    public String getCandidateNamesGreaterSeventy() {
        String n = ""; 
        if(getGrade() > 70) 
            n = getName();

        return n;
    }

    public double getWomansMedium() {
        double res = 0;
        int count = 0;
        if("M".equals(getGender()) ) {
            res += getGrade();
            count++;
        }

        return res/count;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\n" +
                "Gênero: " + getGender() + "\n" +
                "Pontuação: " + getGrade();
    }
}
