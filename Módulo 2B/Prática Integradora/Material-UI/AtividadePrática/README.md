# Aplicação React de Gerenciamento de Projetos e Tarefas

Este projeto é uma extensão da atividade prática da disciplina **Prática Integradora Tecnologias Disruptivas** módulo `Material-UI`

Para atividade proposta implementei a possibilidade de mudar o tema claro para escuro através do MUI ThemeProvider e das paletas pré-definidas da biblioteca.

A mudança de tema ocorre ao clicar no ícone de sol ou lua no cabeçalho da aplicação.

O header chama o hook useContext chamado de useTheme, que por sua vez atualiza qual é o tema ativo, onde o tema ativo é passado para o `MuiThemeProvider` no App.js que faz a mudança das cores.