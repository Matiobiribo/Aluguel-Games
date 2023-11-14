<h1>Aluguel Games 🎮</h1>

> 🟡 Status: Em Desenvolvimento! ⚠️


## Sobre o projeto: 📄

**Este projeto, desenvolvido como parte da disciplina de Programação Orientada a Objetos na Universidade São Francisco (USF), é uma aplicação web para uma loja de aluguel de jogos. O propósito principal é proporcionar ao proprietário da loja uma plataforma eficiente para gerenciar o catálogo de jogos, permitindo operações fundamentais como adicionar, atualizar e excluir jogos.**

### Principais Funcionalidades:

- **Listagem de Jogos: O sistema oferece a capacidade de listar todos os jogos disponíveis na loja, fornecendo informações como ID, nome, gênero e preço.**

- **Adição de Jogos: Através de um endpoint específico, o proprietário da loja pode adicionar novos jogos ao catálogo. O sistema facilita a inclusão de informações como nome, gênero e preço.**

- **Atualização Parcial de Jogos: O proprietário pode efetuar atualizações parciais em jogos existentes. Isso inclui a modificação do nome, gênero e preço de um jogo específico.**

- **Exclusão de Jogos: Para remover jogos do catálogo, o sistema oferece um endpoint dedicado que permite ao proprietário excluir jogos com base no ID.**

**Este projeto reflete a aplicação prática dos conceitos aprendidos na disciplina de Programação Orientada a Objetos, proporcionando uma implementação eficiente utilizando a linguagem de programação Java e o framework Spring Boot.**


## Construído com: ⚙️

<table>
  <tr>
    <td>Application</td>
    <td>version</td>
  </tr>
  <tr>
    <td>Java Maven</td>
    <td>11</td>
  </tr>
  <tr>
    <td>Spring tools suite 4</td>
    <td>3.1.5</td>
  </tr>
   <tr>
    <td>Postman</td>
    <td>10.20</td>
  </tr>
</table>


## Arquitetura: ✏️

#### Estrutura do Projeto:

O projeto segue uma estrutura de classes simples, contendo entidades, controladores e serviços.

- `Jogos` (Entidade):
  - Classe representando os jogos disponíveis na loja de aluguel.
  - Atributos incluem ID, nome, gênero e preço.
  - Implementação de `equals` e `hashCode` baseada no campo `id`.
  
- `LojajogosController` (Controlador):
  - Controlador REST para manipulação dos jogos na loja.
  - Define endpoints para listar, adicionar, atualizar parcialmente e excluir jogos.
  
- `LojajogosService` (Serviço):
  - Implementa a lógica de negócios para as operações CRUD dos jogos.
  - Interage com o repositório (`LojajogosRepository`) para acessar e modificar os dados.
  
#### Explicação da Arquitetura:

O projeto adota uma arquitetura MVC (Model-View-Controller), onde as classes de entidade representam o modelo, os controladores definem endpoints para operações e os serviços encapsulam a lógica de negócios.

- **`Jogos`**: Representa os dados dos jogos e define métodos de comparação e hash para identificação.
- **`LojajogosController`**: Gerencia as requisições HTTP, direcionando para os métodos apropriados no serviço.
- **`LojajogosService`**: Contém a lógica para operações de listagem, adição, atualização parcial e exclusão de jogos. Interage com o repositório para persistência.

#### Observações de Implementação:

> O sistema utiliza boas práticas de desenvolvimento, como tratamento de exceções e anotações para mapeamento de endpoints e entidades.
>
> Nota: O código fornecido é uma representação simplificada e pode conter mais elementos que não foram incluídos neste resumo.


## Instalação: 📥

**Clonar repositorio**

```
git clone https://github.com/Matiobiribo/Aluguel-Games.git
```

## Contato: 📧📞

> Nome: Matheus Luigi Carolino Franco
>
> R.A: 202107447
>
> Email: (matheusluigif@gmail.com)
>
> Github: [(link)](https://github.com/Matiobiribo)
>
> Link do projeto:  [(link)](https://github.com/Matiobiribo/Aluguel-Games.git)


## Agradecimentos: 🎓

[**Universidade São Francisco - (USF)**](https://www.usf.edu.br/)

  [(voltar ao topo)]()

