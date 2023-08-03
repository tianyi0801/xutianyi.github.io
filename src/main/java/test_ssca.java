import java.sql.ResultSet;
import org.apache.log4j.Hierarchy;
import org.yaml.snakeyaml.DumperOptions;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;

public class test_ssca {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
    ResultSet result = statement.executeQuery(sql);

    private void createLessonsForUser(WebGoatUser webGoatUser) {
        jdbcTemplate.execute("CREATE SCHEMA \"" + webGoatUser.getUsername() + "\" authorization dba");
        flywayLessons.apply(webGoatUser.getUsername()).migrate();
    }
}
