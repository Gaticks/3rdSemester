package DBS2.bad_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kenneth on 23-10-2017.
 */
public class QuestionFour extends QuestionRunner {


    public QuestionFour(Connection iconn) {

        this.conn = iconn;
    }

    public void runCase() throws SQLException {

        Statement stmtMother = conn.createStatement();
        Statement stmtChild = conn.createStatement();
        int noOfChildren = 0;

        ResultSet rsMother = stmtMother.executeQuery("select id, hairColor from mother where hairColor = 'blond'");

        while (rsMother.next()) {
            ResultSet rsChild = stmtChild.executeQuery("select id, yearBorn from child where motherID = " + rsMother.getInt("id") + " AND yearBorn = 2012");
                while (rsChild.next()) {
                        noOfChildren++;
            }
                rsChild.close();
                rsChild = null;
        }

        rsMother.close();
        rsMother = null;
        stmtMother.close();
        stmtChild.close();

        System.out.println("number of children born in 2012 by blond mothers: " + noOfChildren);

    }
}
