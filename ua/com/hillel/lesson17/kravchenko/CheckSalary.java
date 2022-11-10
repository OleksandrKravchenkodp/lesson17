package ua.com.hillel.lesson17.kravchenko;

@FunctionalInterface
public interface CheckSalary <T, U, R, Q, Y> {

    //double checkSalary (double salary);
    Y checkSalary (T t, U u, R r, Q q);

}
