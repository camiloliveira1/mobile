#language: pt
Funcionalidade: Cadastro de usuario

  Cenario: Escolher a opção de cadastro no Happy
    Dado que não tenho cadastro no Happy
    Quando escolho a opcao Quero me cadastrar
    Entao vejo a tela de cadastro de Nome

  Cenario: Cadstro de nome inválido
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    Quando deixo o campo `Nome completo` em branco
    E escolho Continuar
    Entao vejo a mensagem de erro "Campo obrigatório"

  Cenario: Cadstro de nome valido
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    Quando preencho o campo `Nome completo` "Teste automacao"
    E escolho Continuar
    Entao vejo a tela Cadastro de CPF'

  Cenario: Cadastro de CPF com um CPF já utilizado em três linhas ativas
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Automacao Teste"
    Quando preencho o campo `CPF`"36773224802"
    E escolho Continuar
    Entao vejo o pop-up com o erro: "Oops! Limite por CPF atingido."

  Cenario: Cadastro de CPF com menos de 11 digitos
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Automacao Teste"
    Quando preencho o campo `CPF`"364163368"
    E escolho Continuar
    Entao vejo o erro: "CPF inválido"

  Cenario: Cadastro de CPF sem preencher o campo CPF
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Automacao Teste"
    Quando preencho o campo `CPF`""
    E escolho Continuar
    Entao vejo o erro: "Campo obrigatório"

  Cenario: Cadstro de CPF valido
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Automacao Teste"
    E vejo a tela Cadastro de CPF
    Quando preencho o campo `CPF`"36416336804"
    E escolho Continuar
    Entao vejo a tela Cadastro de e-mail'

  Cenario: Cadstro de E-mail com um e-mail já cadastrado
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E vejo a tela Cadastro de E-mail
    Quando preencho o campo `E-mail` com o valor "testeautomacao1@teste.com"
    E escolho Continuar
    Entao vejo o pop-up com o erro: "Ei, você não me é estranho"

  Cenario: Cadstro de E-mail com um e-mail inválido
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E vejo a tela Cadastro de E-mail
    Quando preencho o campo `E-mail` com o valor "testeautomacao@teste"
    E escolho Continuar
    Entao vejo o erro: "E-mail inválido"

  Cenario: Cadastro de e-mail com o campo e-mail vazio
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E vejo a tela Cadastro de E-mail
    Quando preencho o campo `E-mail` com o valor ""
    E escolho Continuar
    Entao vejo o erro: "Campo obrigatório"

  Cenario: Cadastro de E-mail valido
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E vejo a tela Cadastro de E-mail
    Quando preencho o campo `E-mail` com o valor "testeautomacao40@teste.com"
    E escolho Continuar
    Entao vejo a tela Cadastro de senha'

  Cenario: Cadastrar Senha com menos de 6 caracteres
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E informo o e-mail "testeautomacao18@teste.com"
    E vejo a tela Cadastro de senha
    Quando preencho o campo 'Senha' "12345"
    E escolho Continuar
    Entao vejo o erro: "Sua senha precisa ter 6 dígitos"

  Cenario: Cadastrar Senha com o campo senha vazio
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E informo o e-mail "testeautomacao19@teste.com"
    E vejo a tela Cadastro de senha
    Quando preencho o campo 'Senha' ""
    E escolho Continuar
    Entao vejo o erro: "Campo obrigatório"

  Cenario: Validar a funcionalidade do "olho de senha" para mostrar a senha digitada.
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E informo o e-mail "testeautomacao23@teste.com"
    E vejo a tela Cadastro de senha
    Quando preencho o campo 'Senha' "123456"
    E escolho o link `Olho` para ver a senha
    Entao vejo o valor "123456" no campo Digite sua senha

  Cenario: Cadastrar Senha com menos de 6 caracteres
    Dado que não tenho cadastro no Happy
    E escolho Quero me cadastrar
    E informo o Nome "Teste Automacao"
    E informo o `CPF` "36416336804"
    E informo o e-mail "testeautomacao22@teste.com"
    E vejo a tela Cadastro de senha
    Quando preencho o campo 'Senha' "123456"
    E escolho Continuar
    Entao vejo a tela 'Chip Happy'
