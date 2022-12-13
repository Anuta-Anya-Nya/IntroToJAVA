public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() { //переопределение базового метода
        return String.format("id:%d, fn:%s, ln:%s, s:%d", id, firstName, lastName, salary);
    }
    @Override
    public boolean equals(Object ob) {
        Worker t = (Worker) ob;
        return id == t.id && firstName==t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}