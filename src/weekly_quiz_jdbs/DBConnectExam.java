package weekly_quiz_jdbs;

import java.sql.*;

public class DBConnectExam {
    public static void main(String[] args) {
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/test_db";
        String user = "root";
        String pw = "admin";

        Connection dbConn = null;
        try {
            Class.forName(dbDriver);
            dbConn = DriverManager.getConnection(dbUrl,user,pw);
            System.out.println("연결 성공");
        }catch(SQLException | ClassNotFoundException e) {
            System.out.println("연결 실패");
        }


        //학생 테이블에 있는 전체 학생들 중, 30대 학생들만 출력하기 (name, age, addres)
        String sql = "select name,age,address from students where age between 20 and 39";
        try {
            assert dbConn != null;
            Statement st = dbConn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("name  age address");
            while(rs.next()) {
                System.out.println(rs.getString(1) +
                        " "+rs.getString(2) +
                        "  " + rs.getString(3));
            }
            rs.close();
            st.close();
        } catch(SQLException e) {
            System.out.println("SQLException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}
