#language: pt
Funcionalidade: Pedido de Chip Happy

  #Cenario: Validar link Preciso de ajuda
  #Dado que estou logado no Happy com o usuário "testeautomacao1@teste.com"
  #E senha "123456"
  #E vejo a tela 'Chip Happy'
  #Quando escolho o link 'Preciso de ajuda'
  #Entao vejo a tela 'Ajuda compra de chip'
  #
  #Cenario: Validar valor do chip
  #Dado que estou logado no Happy com o usuário "testeautomacao1@teste.com"
  #E senha "123456"
  #E vejo a tela 'Chip Happy'
  #Entao vejo o valor do chip de "R$10.00"
  #
  #Cenario: Validar link Receber em casa
  #Dado que estou logado no Happy com o usuário "testeautomacao1@teste.com"
  #E senha "123456"
  #E vejo a tela 'Chip Happy'
  #Quando escolho o link 'Receber em casa'
  #Entao vejo a tela 'Ok, e qual é seu CEP?'
  
  #Cenario: Inserir CEP com menos de 8 digítos
    #Dado que estou logado no Happy com o usuário "teste.regressao@teste.com"
    #E senha "123456"
    #E escolho o link 'Receber em casa'
    #E vejo a tela 'Ok, e qual é seu CEP?'
    #Quando insiro o CEP "04458"
    #E escolho 'Continuar'
    #Entao vejo o erro "CEP inválido"
#
  #Cenario: Validar o preenchimento do campo CEP com um CEP inválido
    #Dado que estou logado no Happy com o usuário "testeautomacao1@teste.com"
    #E senha "123456"
    #E escolho o link 'Receber em casa'
    #E vejo a tela 'Ok, e qual é seu CEP?'
    #Quando insiro o CEP "09999999"
    #E escolho 'Continuar'
    #Entao vejo o pop-up com o erro: "CEP não encontrado"
    
   Cenario: Inserir um CEP válido
    Dado que estou logado no Happy com o usuário "teste.regressao@teste.com"
    E senha "123456"
    E escolho o link 'Receber em casa'
    E vejo a tela 'Ok, e qual é seu CEP?'
    Quando insiro o CEP "04458000"
    E escolho 'Continuar'
    Entao vejo a tela `Complete o endereço'
