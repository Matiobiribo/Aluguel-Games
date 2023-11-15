package com.lojajogos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojajogos.repository.LojajogosRepository;
import com.lojajogos.model.Jogos;

@Service
public class LojajogosService {

	
	
// Lista todos os jogos do banco de dados e retorna uma lista de objetos com os valores de cada jogo
	
    @Autowired
    private LojajogosRepository jogosRepository;

    public List<Object> listarJogos() {
        try {
            List<Jogos> jogos = jogosRepository.findAll();
            List<Object> result = new ArrayList<>();

            for (Jogos jogo : jogos) {
                List<Object> jogosValues = new ArrayList<>();
                jogosValues.add(jogo.getId());
                jogosValues.add(jogo.getNome());
                jogosValues.add(jogo.getGenero());
                jogosValues.add(jogo.getPreco());
                result.add(jogosValues);
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar jogos", e);
        }
    }

    
    
// Post
    // Try tenta salvar o jogo chamando jogosRepository.save(jogo). Se a operação for bem-sucedida, o jogo salvo é retornado como parte de uma resposta ResponseEntity.ok.
    // Catch se algo der errado durante a operação de salvamento no banco de dados, uma exceção será lançada e capturada pelo bloco catch e é lançada com a mensagem "Erro ao adicionar jogo"
    
    @Transactional
    public ResponseEntity<?> adicionarJogo(Jogos jogo) {
        try {
            Jogos jogoSalvo = jogosRepository.save(jogo);
            return ResponseEntity.ok(jogoSalvo);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao adicionar jogo", e);
        }
    }

    
    
// Patch
    //Dentro do bloco try, ele primeiro procura um jogo existente no banco de dados com o id fornecido usando o método jogosRepository.findById(id).Se o jogo existir (verificado por meio do Optional retornado pelo findById e verificado com isPresent()
    //Se ocorrer algum erro durante o processo de atualização, uma exceção será capturada no bloco catch e será lançada uma exceção RuntimeException com a mensagem "Erro ao atualizar parcialmente o jogo", contendo a exceção original como causa.
    
    @Transactional
    public ResponseEntity<?> atualizarParcialJogo(Long id, Jogos jogoAtualizado) {
        try {
            Optional<Jogos> jogoExistente = jogosRepository.findById(id);

            if (jogoExistente.isPresent()) {
                Jogos jogo = jogoExistente.get();

                // Verifica e atualiza os campos se não forem nulos
                if (jogoAtualizado.getNome() != null && !jogoAtualizado.getNome().isEmpty()) {
                    jogo.setNome(jogoAtualizado.getNome());
                }
                if (jogoAtualizado.getGenero() != null) {
                    jogo.setGenero(jogoAtualizado.getGenero());
                }
                if (jogoAtualizado.getPreco() != 0) {
                    jogo.setPreco(jogoAtualizado.getPreco());
                }

                Jogos jogoAtualizadoSalvo = jogosRepository.save(jogo);
                return ResponseEntity.ok(jogoAtualizadoSalvo);
            } else {
            	return ResponseEntity.notFound().build();          
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar parcialmente o jogo", e);
        }
    }


    
// Delete
    //Dentro do bloco try, ele procura um jogo existente no banco de dados com o id fornecido usando o método jogosRepository.findById(id). Se o jogo existir (verificado por meio do Optional retornado pelo findById e verificado com isPresent()
    //Se não encontrar um jogo com o id especificado, também retorna uma resposta ResponseEntity.notFound().build() para indicar explicitamente que o recurso não foi encontrado para exclusão.
    
    @Transactional
    public ResponseEntity<String> excluirJogo(Long id) {
        try {
            Optional<Jogos> jogoExistente = jogosRepository.findById(id);

            if (jogoExistente.isPresent()) {
                jogosRepository.deleteById(id);
                return ResponseEntity.ok("Jogo excluído com sucesso!");
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir jogo", e);
        }
    }

}
