# language: pt
# charset: UTF-8

  @regressivo
  Funcionalidade: Efetuar o login
    Eu como usuario
    Quero acessar a plataforma Swag Labs
    Efetuar o login com sucesso

  @wip
  Cenário: Validar login com credenciais validas
    Dado usuario acesse a plataforma
    Quando informar as credenciais validas
    Então visualizaria a home da plataforma
    E efetuara o logout com sucesso