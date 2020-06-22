package S1801TO2000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1802 {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
    Map<Integer, Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            map.put(e.id,e);
        }
        return dfs(id);
    }

    public int dfs(int id)
    {
        Employee employee = map.get(id);
        int res = employee.importance;
        if (employee.subordinates.isEmpty())
            return res;
        for (int s: employee.subordinates)
            res += dfs(s);
        return res;
    }
}
