package com.example.demo.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MariaDomain;



//DB레이어 접근자를 의미
@Repository
@Mapper
public interface MariaRepositories extends JpaRepository<MariaDomain,String>{
	
	//NullPointException 에러를 방지하기 위해서
	@Query
	Optional<MariaDomain> findById(String id);
	
	@Query
	Optional<MariaDomain> findByPassword(String password);
	
}
