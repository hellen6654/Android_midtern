package tw.edu.ntut.csie.app01_105590040;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class Grade {
    public String letterGrade(int score)
    {
        String strGrade="";
        if (score > 100) strGrade="X";
        else if (score >=90 && score <=100) strGrade="A";
        else if (score >=80 && score <=89) strGrade="B";
        else if (score >=70 && score <=79) strGrade="C";
        else if (score >=60 && score <=69) strGrade="D";
        else if (score >=0 && score <=59) strGrade="F";
        else  strGrade="X";
        return strGrade;
    }
}
