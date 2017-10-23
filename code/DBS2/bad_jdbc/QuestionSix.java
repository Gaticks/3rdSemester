package DBS2.bad_jdbc;

import java.sql.*;

public class QuestionSix extends QuestionRunner {

    public QuestionSix(Connection iconn) {
        this.conn = iconn;
    }

    public void runCase() throws SQLException {

        Statement stmt = conn.createStatement();
        int noOfChildren = 0;

        ResultSet rs = stmt.executeQuery("select c.yearborn " +
                "from mother m " +
                "join child c on m.id = c.motherid " +
                "where m.haircolor = 'blond'");

        while (rs.next()) {
            if (rs.getInt("yearBorn") == 2012)
            {
                noOfChildren++;
            }
        }

        rs.close();
        rs = null;
        stmt.close();
        stmt.close();

        System.out.println("6. number of children born in 2012 by blond mothers: " + noOfChildren);
    }
}