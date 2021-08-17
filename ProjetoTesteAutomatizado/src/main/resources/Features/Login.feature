#language: pt
@Login
  Funcionalidade: login

    Contexto:
      Dado que o usuario esteja na pagina principal do sistema

    @SmokeTest
    Esquema do Cenario: realizar login com sucesso
      Quando informar o campo Username como "<usuario>"
      E informar o Password como "<senha>"
      E clicar no botão Login
      Entao o sistema deverá autorizar o login, exibindo a página contendo a dashboard.

      Exemplos:
        | usuario | senha |
        | truehooha | sever123 |

