package com.lab8;

import com.lab8.query.MySQLQueryBuilder;
import com.lab8.query.PostgreSQLQueryBuilder;
import com.lab8.query.QueryBuilder;

public class Main {
    public static void main(String[] args) {
        QueryBuilder postgreSqlBuilder = new PostgreSQLQueryBuilder();
        String query1 = postgreSqlBuilder.setSelect("name, password")
                .setWhere("users")
                .setLimit(10)
                .getSQL();
        System.out.println(query1);
//        PostgerSQL: SELECT name, password FROM users LIMIT 10

        QueryBuilder mySqlBuilder = new MySQLQueryBuilder();
        String query2 = mySqlBuilder.setSelect("name, price")
                .setWhere("products")
                .setLimit(25)
                .getSQL();
        System.out.println(query2);
//        MySQL: SELECT name, price FROM products LIMIT 25
    }
}
