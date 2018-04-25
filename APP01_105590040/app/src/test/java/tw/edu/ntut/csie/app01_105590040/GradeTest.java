package tw.edu.ntut.csie.app01_105590040;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class GradeTest {
    @Test
    public void  letterGrade(){
        Grade G = new Grade();
        String strResult="";
        strResult=G.letterGrade(8700);
        assertEquals(strResult,"X");

        strResult=G.letterGrade(98);
        assertEquals(strResult,"A");

        strResult=G.letterGrade(87);
        assertEquals(strResult,"B");

        strResult=G.letterGrade(78);
        assertEquals(strResult,"C");

        strResult=G.letterGrade(67);
        assertEquals(strResult,"D");

        strResult=G.letterGrade(30);
        assertEquals(strResult,"F");

        strResult=G.letterGrade(-999);
        assertEquals(strResult,"X");
    }
}
