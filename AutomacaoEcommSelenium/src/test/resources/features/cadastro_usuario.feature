# language: pt

@cadastro
Funcionalidade: Cadastro de Usuário

  @cadastro_sucesso
  Cenario: Registrar um novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando preencho o formulário de cadastro com dados
      E clico no botão de registrar
      Então vejo mensagem de sucesso de cadastro