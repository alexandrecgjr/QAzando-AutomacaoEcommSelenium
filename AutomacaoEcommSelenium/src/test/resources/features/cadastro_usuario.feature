# language: pt

@cadastro
Funcionalidade: Cadastro de Usuário

  @chrome
  @cadastro_sucesso
  Cenario: Registrar um novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando preencho os dados de cadastro
      E clico no botão de registrar
      Então vejo mensagem de sucesso de cadastro


    @firefox
  @cadastro_sucesso2
  Cenario: Registrar um novo usuario com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando preencho os dados de cadastro
    E clico no botão de registrar
    Então vejo mensagem de sucesso de cadastro