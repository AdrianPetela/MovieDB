package com.pl.dbUtils;

import com.pl.dbObjects.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CallableStatementParameter {

    public Connection getDBConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MovieDB", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return conn;
        }
    }

    // FILMY
    public List<Movie> listMovie(String year) throws SQLException {
        List<Movie> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "";

        if (year.equals("Wszystkie")) {
            query = "SELECT MOV_TITLE, MOV_YEAR, MOV_TIME, MOV_LANG, MOV_DT_REL, MOV_REL_COUNTRY FROM MOVIE";
        } else {
            query = "SELECT MOV_TITLE, MOV_YEAR, MOV_TIME, MOV_LANG, MOV_DT_REL, MOV_REL_COUNTRY FROM MOVIE WHERE MOV_YEAR =  " + year + ";";
        }

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                Integer MOV_YEAR = rs.getInt("MOV_YEAR");
                Integer MOV_TIME = rs.getInt("MOV_TIME");
                String MOV_LANG = rs.getString("MOV_LANG");
                String MOV_DT_REL = rs.getString("MOV_DT_REL");
                String MOV_REL_COUNTRY = rs.getString("MOV_REL_COUNTRY");
                arrayList.add(new Movie(MOV_TITLE, MOV_YEAR, MOV_TIME, MOV_LANG, MOV_DT_REL, MOV_REL_COUNTRY));
            }

        } catch (SQLException e) {
            System.out.println("Error! widokHoteli");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    // LISTA LAT
    public List<String> listYear() throws SQLException {
        List<String> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "SELECT MOV_YEAR FROM MOVIE";

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_YEAR = rs.getString("MOV_YEAR");
                arrayList.add(MOV_YEAR);
            }

        } catch (SQLException e) {
            System.out.println("Error! widokLat");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }


    // LISTA TYTULOW
    public List<String> titleMovie() throws SQLException {
        List<String> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "SELECT MOV_TITLE FROM MOVIE";

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                arrayList.add(MOV_TITLE);
            }

        } catch (SQLException e) {
            System.out.println("Error! titleMovie");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    public List<Role> listRole(String title) throws SQLException {
        List<Role> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        if (title.equals("Wszystkie")) {
            query = "SELECT M.MOV_TITLE, A.ACT_FNAME, A.ACT_LNAME, MC.ROLE\n" +
                    "FROM MOVIE M, ACTOR A, MOVIE_CAST MC\n" +
                    "WHERE M.MOV_ID = MC.MOV_ID\n" +
                    "AND MC.ACT_ID = A.ACT_ID;";
        } else {
            query = "SELECT M.MOV_TITLE, A.ACT_FNAME, A.ACT_LNAME, MC.ROLE\n" +
                    "FROM MOVIE M, ACTOR A, MOVIE_CAST MC\n" +
                    "WHERE M.MOV_ID = MC.MOV_ID\n" +
                    "AND MC.ACT_ID = A.ACT_ID\n" +
                    "AND M.MOV_TITLE = '" + title + "';";
        }

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                String ACT_FNAME = rs.getString("ACT_FNAME");
                String ACT_LNAME = rs.getString("ACT_LNAME");
                String ROLE = rs.getString("ROLE");
                arrayList.add(new Role(MOV_TITLE, ACT_FNAME, ACT_LNAME, ROLE));
            }

        } catch (SQLException e) {
            System.out.println("Error! widokTopUslug");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    public List<topMovie> topMovie(int count) throws SQLException {
        List<topMovie> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "";

        query = "SELECT M.MOV_TITLE, FORMAT(AVG(R.REV_STARS), 1) AS 'RATING'\n" +
                "FROM MOVIE M, RATING R\n" +
                "WHERE M.MOV_ID = R.MOV_ID\n" +
                "GROUP BY M.MOV_TITLE\n" +
                "ORDER BY AVG(R.REV_STARS) DESC\n" +
                "LIMIT " + count + ";";

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                String RATING = rs.getString("RATING");
                arrayList.add(new topMovie(MOV_TITLE, RATING));
            }

        } catch (SQLException e) {
            System.out.println("Error! widokTopMovie");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    // Gatunki
    public List<String> listGenres() throws SQLException {
        List<String> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "SELECT GEN_TITLE FROM GENRES";

        try {
            Connection conn = this.getDBConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String GEN_TITLE = rs.getString("GEN_TITLE");
                arrayList.add(GEN_TITLE);
            }
        } catch (SQLException e) {
            System.out.println("Error Genres");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    public List<Genres> movieGenres(String genres) throws SQLException {
        List<Genres> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        if (genres.equals("Wszystkie")) {
            query = "SELECT M.MOV_TITLE, G.GEN_TITLE\n" +
                    "FROM MOVIE M, MOVIE_GENRES MG, GENRES G\n" +
                    "WHERE M.MOV_ID = MG.MOV_ID\n" +
                    "AND MG.GEN_ID = G.GEN_ID;";
        } else {
            query = "SELECT M.MOV_TITLE, G.GEN_TITLE\n" +
                    "FROM MOVIE M, MOVIE_GENRES MG, GENRES G\n" +
                    "WHERE M.MOV_ID = MG.MOV_ID\n" +
                    "AND MG.GEN_ID = G.GEN_ID\n" +
                    "AND G.GEN_TITLE = '" + genres + "';";
        }

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                String GEN_TITLE = rs.getString("GEN_TITLE");
                arrayList.add(new Genres(MOV_TITLE, GEN_TITLE));
            }

        } catch (SQLException e) {
            System.out.println("Error! widokGatunki");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    // REZYSERZY
    public List<String> listDirector() throws SQLException {
        List<String> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "SELECT CONCAT(DIR_FNAME, ' ', DIR_LNAME) AS DIRECTOR FROM DIRECTOR ";

        try {
            Connection conn = this.getDBConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String DIRECTOR = rs.getString("DIRECTOR");
                arrayList.add(DIRECTOR);
            }
        } catch (SQLException e) {
            System.out.println("Error DIRECTOR");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

    public List<Director> movieDirector(String director) throws SQLException {
        List<Director> arrayList = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        if (director.equals("Wszystkie")) {
            query = "SELECT M.MOV_TITLE, CONCAT(D.DIR_FNAME, ' ', D.DIR_LNAME) AS DIRECTOR\n" +
                    "FROM MOVIE M, DIRECTOR D, MOVIE_DIRECTION MD\n" +
                    "WHERE M.MOV_ID = MD.MOV_ID\n" +
                    "AND MD.DIR_ID = D.DIR_ID";
        } else {
            query = "SELECT M.MOV_TITLE, CONCAT(D.DIR_FNAME, ' ', D.DIR_LNAME) AS DIRECTOR\n" +
                    "FROM MOVIE M, DIRECTOR D, MOVIE_DIRECTION MD\n" +
                    "WHERE M.MOV_ID = MD.MOV_ID\n" +
                    "AND MD.DIR_ID = D.DIR_ID\n" +
                    "AND CONCAT(D.DIR_FNAME, ' ', D.DIR_LNAME) = '" + director + "';";
        }

        try {
            Connection con = this.getDBConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                String MOV_TITLE = rs.getString("MOV_TITLE");
                String DIRECTOR = rs.getString("DIRECTOR");
                arrayList.add(new Director(MOV_TITLE, DIRECTOR));
            }

        } catch (SQLException e) {
            System.out.println("Error! widokDIRECTOR");
        } finally {
            if (stmt != null)   stmt.close();
        }
        return arrayList;
    }

}
