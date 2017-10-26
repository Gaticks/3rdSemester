package DBS2.bad_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kenneth on 23-10-2017.
 */
public class QuestionTwo extends QuestionRunner {
    public QuestionTwo(Connection iconn) {

        this.conn = iconn;
    }

    public void runCase() throws SQLException {

        Statement stmtMother = conn.createStatement();
        Statement stmtChild = conn.createStatement();
        int noOfChildren = 0;


        ResultSet rsChild = stmtChild.executeQuery("select id, yearBorn, motherId from child");

        while (rsChild.next()) {
            if (rsChild.getInt("yearBorn") == 2012) {
                int motherID = rsChild.getInt("motherId");
                ResultSet rsMother = stmtMother.executeQuery("select id, hairColor FROM mother WHERE id = " + motherID);
                rsMother.next();
                if (rsMother.getString("hairColor").equalsIgnoreCase("blonde")) {
                    noOfChildren++;
                }
                rsMother.close();
            }
        }
        stmtMother.close();
        stmtChild.close();

        System.out.println("number of children born in 2012 by blond mothers: " + noOfChildren);

    }
}
