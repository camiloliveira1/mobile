#language: pt
Funcionalidade: Compra de planos

  Cenario: Validar link Preciso de ajuda
    Dado que estou logado no Happy com o usuário "camilo.oliveira+t026@nextel.com.br"
    E senha "123456"
    Quando vejo a tela de home "Você não tem um plano ativo"
    E escolho `Escolher um plano`
    Entao vejo o `Carrossel de planos`
