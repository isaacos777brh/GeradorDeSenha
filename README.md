# 🔐 Gerador de Senha em Java

Um gerador de senhas seguras para linha de comando, feito em Java puro, sem dependências externas.

O projeto usa `SecureRandom` (e não `Random`) para que as senhas sejam imprevisíveis, e garante que toda senha gerada tenha pelo menos um caractere de cada tipo.

## ✨ Funcionalidades

- Gera senhas com o tamanho escolhido pelo usuário (mínimo de 4 caracteres)
- Garante ao menos 1 letra minúscula, 1 maiúscula, 1 número e 1 símbolo
- Usa `SecureRandom`, adequado para fins de segurança
- Embaralha os caracteres para que a ordem não seja previsível
- Código simples, em um único arquivo, bom para estudo

## 🧰 Tecnologias

- Java 8 ou superior (testado com JDK 17)

## 🚀 Como executar

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/gerador-de-senha.git
cd gerador-de-senha
```

2. Compile:

```bash
javac GeradorDeSenha.java
```

3. Execute:

```bash
java GeradorDeSenha
```

## 💻 Exemplo de uso

```text
Tamanho da senha: 16
Senha gerada: k#7Qm-Zt9aP2wX!b
```

> Cada execução gera uma senha diferente. O exemplo acima é apenas ilustrativo.

## 🧠 Como funciona

1. Define quatro conjuntos de caracteres: minúsculas, maiúsculas, números e símbolos.
2. Sorteia um caractere de cada conjunto, para garantir a presença de todos os tipos.
3. Completa o restante do tamanho sorteando caracteres de todos os conjuntos juntos.
4. Embaralha a lista com `Collections.shuffle`, usando o mesmo `SecureRandom`.
5. Converte a lista em `String` e exibe a senha.

### Por que `SecureRandom`?

A classe `Random` é previsível: conhecendo alguns valores gerados, é possível descobrir os próximos. Já o `SecureRandom` foi projetado para uso criptográfico, o que o torna a escolha correta para gerar senhas.

## 📁 Estrutura do projeto

```text
gerador-de-senha/
├── GeradorDeSenha.java
└── README.md
```

## 🗺️ Próximos passos

- [ ] Permitir ao usuário escolher quais tipos de caractere usar
- [ ] Opção para excluir caracteres ambíguos (`O`, `0`, `l`, `1`, `I`)
- [ ] Gerar várias senhas de uma vez
- [ ] Indicador de força da senha (baseado em entropia)
- [ ] Interface gráfica com Swing ou JavaFX (botão "Gerar" e "Copiar")
- [ ] Testes unitários com JUnit

## 🤝 Contribuindo

Sugestões e melhorias são bem-vindas. Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b minha-melhoria`
3. Faça o commit: `git commit -m "Adiciona minha melhoria"`
4. Envie para a branch: `git push origin minha-melhoria`
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👤 Autor

Feito por **Isaac** como projeto de estudo em Java.

- GitHub: [@SEU-USUARIO](https://github.com/SEU-USUARIO)
