package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//(DAO)Interacts with the DB, JPArepo provides CRUD and easy access to RDB
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
