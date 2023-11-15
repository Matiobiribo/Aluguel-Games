package com.lojajogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lojajogos.model.Jogos;
import com.lojajogos.service.LojajogosService;

@RestController
@RequestMapping("/loja-jogos")
public class LojajogosControlller {
	
	 @Autowired
	    private LojajogosService lojajogosService;

	 
	 
// Endpoint para listar jogos (GET)
	 
	    @GetMapping
	    public List<Object> listarJogos() {
	        return lojajogosService.listarJogos();
	    }

	    
	    
// Endpoint para adicionar jogo (POST)
	    
	    @PostMapping
	    public ResponseEntity<?> adicionarJogo(@RequestBody Jogos jogo) {
	        return lojajogosService.adicionarJogo(jogo);
	    }


	    
// Endpoint para atualizar parcialmente um jogo (PATCH)
	    
	    @PatchMapping("/{id}")
	    public ResponseEntity<?> atualizarParcialJogo(@PathVariable Long id, @RequestBody Jogos jogoAtualizado) {
	        return lojajogosService.atualizarParcialJogo(id, jogoAtualizado);
	    }

	    
	    
// Endpoint para excluir jogo (DELETE)
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> excluirJogo(@PathVariable Long id) {
	        return lojajogosService.excluirJogo(id);
	    }
	}