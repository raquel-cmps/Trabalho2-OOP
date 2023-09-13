# Segundo trabalho de Orientação a Objetos
### Programa simples com interações entre Classes. Na qual é possível adicionar novos objetos e interagir com eles por meio de um Menu.

# Animal - Classe Mãe 
<br>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/ClasseMae.png>
<p>Todas as outras Classe do meu programa hendam a Classe Animal, direta ou indiretamente.</p>

# Mamifero - Classe filha de Animal
<br>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/ExtensaoAnimal.png>
<p>Mamifero possui duas classes filhas: Cachorro e Gato.</p>

# Pessoa - Classe filha de Animal
<br>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/ExtensaoAnimal2.png>
<p>Aqui, a Classe Pessoa possui duas classe filha "diretas", que é a Classe Aluno e a Classe Funcionario.Na qual, a última possui três classes filhas: Professor, Diretor e Secretario.</p>
<br>

# Funcionario - Classe filha de Pessoa
<br>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/ExtensaoPessoa.png>
<br>

# Polimorfismo
<br>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/Polimorfismo1.png>
<img src = https://raw.githubusercontent.com/raquel-cmps/Trabalho2-OOP/main/Imagens/Polimorfismo2.png>
<p>Na primera imagem, a Classe Gato utiliza um método da classe mamifero, porém com um "conteúdo" diferente. A mesma coisa acontece na imagem dois, a Classe Professor "pega" um método de Funcionario e modifica as implementações lógicas. </p>
