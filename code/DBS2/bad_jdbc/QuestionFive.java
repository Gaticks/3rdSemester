package DBS2.bad_jdbc;

import java.sql.*;

public class QuestionFive extends QuestionRunner {

    public QuestionFive(Connection iconn) {
        this.conn = iconn;
    }

    public void runCase() throws SQLException {

        Statement stmt = conn.createStatement();
        int noOfChildren = 0;

        ResultSet rs = stmt.executeQuery("select m.hairColor, c.yearborn " +
                "from mother m " +
                "join child c on m.id = c.motherid");

        while (rs.next()) {
            if (rs.getString("hairColor").equals("blond") &&
                rs.getInt("yearBorn") == 2012)
            {
                noOfChildren++;
            }
        }

        rs.close();
        rs = null;
        stmt.close();
        stmt.close();

        System.out.println("5. number of children born in 2012 by blond mothers: " + noOfChildren);
    }
}