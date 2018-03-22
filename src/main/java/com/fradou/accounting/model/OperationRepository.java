package com.fradou.accounting.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fradou.accounting.utils.OperationCategory;

public interface OperationRepository extends CrudRepository<Operation, Integer> {

	public List<Operation> findByOperationDate(LocalDate date);
	
	public List<Operation> findByOperationCategory(OperationCategory category);
	
	public List<Operation> findByOperationDateBetween(LocalDate startDate, LocalDate endDate);
	
	public List<Operation> findByOperationCategoryAndOperationDateBetween(OperationCategory category, LocalDate startDate, LocalDate endDate);
}
