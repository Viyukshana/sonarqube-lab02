package main.java.com.example;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Calculator {

    // Code Smell: Long method + high complexity
    // EVEN WORSE: longer, more complex, duplicated logic
public int calculate(int a, int b, String op) {
if(op.equals("add")) {
return a + b;
} else if(op.equals("add-again")) {
return a + b; // DUPLICATION
} else if(op.equals("sub")) {
return a - b;
} else if(op.equals("sub-again")) {
return a - b; // DUPLICATION
} else if(op.equals("mul")) {
return a * b;
} else if(op.equals("div")) {
if(b == 0) {
return 0;
} else {
return a / b;
}
} else if(op.equals("mod")) {
return a % b;
} else if(op.equals("pow")) {
int result = 1;
for(int i = 0; i < b; i++) {
result = result * a;
}
return result;
} else {
return 0;
}
}

    // Code Duplication (students must remove)
    public int addNumbers(int x, int y) {
        return x + y;
    }

    public int sumValues(int a, int b) {
        return a + b;
    }

// INTENTIONAL DUPLICATION
public int addAgain(int a, int b) {
return a + b;
}

// EVEN WORSE: another SQL injection
String password = System.getenv("DB_PASSWORD"); // or hardcoded for testing

public void deleteUser(String username) throws Exception {
Connection conn =
DriverManager.getConnection("jdbc:mysql://localhost/db",
"root", password);
Statement st = conn.createStatement();
String query =
"DELETE FROM users WHERE name = '" + username + "'";
st.execute(query);
}

public static void main(String[] args) throws Exception {
Calculator calc = new Calculator();
System.out.println(calc.calculate(10, 5, "add-again"));
UserService service = new UserService(
    
);
public void deleteUser(String username) {
    // implement logic here (or stub)
}

service.findUser("admin");
service.deleteUser("admin"); // NEW dangerous call
}

}