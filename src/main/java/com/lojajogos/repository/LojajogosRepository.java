package com.lojajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojajogos.model.Jogos;

@Repository
public interface LojajogosRepository extends JpaRepository<Jogos, Long> {

}
