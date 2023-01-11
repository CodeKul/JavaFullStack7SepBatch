package jdbc;

/**
 * mysql> create  procedure  get_max_age(OUT maxage int)
 *     -> begin
 *     ->     select MAX(age) into maxage from student;
 *     -> end;
 *     -> /
 *
 *     mysql> call get_max_age(@A);
 *     -> /
 * Query OK, 1 row affected (0.00 sec)
 *
 * mysql> select @A
 *     -> /
 * +------+
 * | @A   |
 * +------+
 * |   27 |
 * +------+
 * 1 row in set (0.00 sec)
 */
public class MySqlProcedureOutParam {
    public static void main(String[] args) {

    }
}
