package DBS2.bad_jdbc;

import java.sql.*;

public class QuestionSeven extends QuestionRunner {

    public QuestionSeven(Connection iconn) {
        this.conn = iconn;
    }

    public void runCase() throws SQLException {

        Statement stmt = conn.createStatement();
        int noOfChildren = 0;

        ResultSet rs = stmt.executeQuery("select c.id " +
                "from mother m " +
                "join child c on m.id = c.motherid " +
                "where m.haircolor = 'blond' " +
                "and c.yearborn = 2012");

        while (rs.next()) {
            noOfChildren++;
        }

        rs.close();
        rs = null;
        stmt.close();
        stmt.close();

        System.out.println("7. number of children born in 2012 by blond mothers: " + noOfChildren);
    }
}