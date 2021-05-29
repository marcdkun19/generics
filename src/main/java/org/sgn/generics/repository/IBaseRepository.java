package org.sgn.generics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<T, ID> extends JpaRepository<T, ID> {

	T findById();
}