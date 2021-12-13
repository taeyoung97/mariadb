package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//데이터베이스 선언할 때 사용
//Getter 선언하면 메소드를 자동으로 선언해줌
@Entity
@Table(name="nmas")
@Getter
//
@Setter
//선언된 모든 필드를 파라미터로 갖는 생성자를 자동으로 만들어준다
@AllArgsConstructor
@NoArgsConstructor
public class MariaDomain {
	@Id
	String id;
	String password;
}
