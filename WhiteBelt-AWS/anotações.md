# CURSO DevDojo - AWS - WHITE BELT

Instrutor: Breno

## VÍDEO 01 - O QUE É CLOUD

Uma forma de fornecer necessidades para colocar uma aplicação/negocio online. Sem despendiar um investimento inicial.

Ex: fazer pão.  
Vc precisaria comprar fornos, máquinas de bater a massa, de cortar a massa, freezers, etc.
Uma solução Cloud, seria alguma empresa fornecer a estrutura para se fazer pão pronto pra venda, e o interessado só levar os ingredientes, fazer e vender. Nesse contexto não existe necessidade de se querer saber quanto custa o gás, quanto de energia, ou IPTU do local, licença ambiental. Preocupação de apenas utilizar e produzir.

Voltado pra tecnologia, numa situação de que a empresa fosse ela mesma fosse realizar o deploy[^1] da aplicação em um servidor próprio, nesse caso a emrpesa teria que configurar rede, cabeamento, nobreak.  

[^1]: Deploy(colocar aplicação pra rodar)

**Cloud Pública**, são serviços "públicos", pois todos tem acesso. São serviços **dentro do mesmo datacenter**, porém alocados em espaços reservados.

**Cloud Privada**, UBER tem cloud privada, é uma decisão da empresa, só ela. ITAÚ também.

**Cloud Hibrida**, navega nos dois mundos, priavada(que pertence a uma empresa, por exemplo a alocação do banco de dados), e que precisa acessar a serviços na Cloud Publica,(front end na publica). Aqui o backend acessa o BD, em serviços chareados.

Serviços na Cloud, é os vários microserviços que são utilizados para rodar sua aplicação. Por exemplo, na Padaria Cloud, seria o "aluguel do serviço Forno", "aluguel da máquina de cortar massa", "aluguel da máquina de modelar pão".

**Infraestructure as a Service-IaaS**, seria utilizar a padaria cloud com eu mesmo configurando o forno, e o tempo do bolo.

**Plataform as a Service-PaaS**, seria chegar e ter o forno já pré configurado, tempo já setado no forno, forma untada. Focar só em colocar e tirar o bolo, e depois eu confeitar e preparar pra venda. No software, seria como se utilizar de um serviço já pronto de autenticação de usuários. PaaS é uma plataforma que oferece serviços já pré configurados.

**Service as a Services-SaaS**, uma maneira de vender o software pronto, seria como usar o GoogleDrive, o ChatGPT. *São softwares pronto vendidos como solução.* No exemplo da padaria, seria já pegar a receita e entregar e receber o pão e o bolo já confeitado, empacotado e pronto pra entregar pro comprador.

MultCloud, é uma maneira de usar mais de uma Cloud tipo GCP e AWS. Poderia ser um FallBack caso caia. Utilizado quando a solução precisa de alta resiliencia, disponibilidade, escala mundial, etc.

## VÍDEO 02 - BENEFÍCIOS DE USAR CLOUD

Podemos citar alguns benefícios como Flexibilidade e Escalabilidade, Otimização de Custos e Resilência e Disponibilidade.

No exemplo da padaria, num cenário on-premises[^2] que queremos vender on-line, e configuramos o servidor pra uma capacidade de  1000 clientes/dia. Se colocassemos uma campanha de markting na rede, e ela bombasse, passando pra 5000/dia. Nesse caso, o servidor anteriormente configurado não suportaria a carga/demanda. Como não estamos numa estrutura de Cloud, precisariamos alugar novo servidor e configurar. Esse tempo de sobrecarga o site trava, não funciona.

Utilizando Cloud, poderiamos ter uma infra flexível, ela possibilita uma escalabilidade de demanda tanto vertical quanto horizontal[^3] com mais agilidade.

>Em resumo um dos maiores benefícios é poder iniciar a infra de uma maneira e adaptar de acordo com o que foi necessário(Otimização de Custos).

![Elasticidade e Pague por Uso Infraestrutura](https://i.imgur.com/vFeNbYG.png)

Observado na linha azul que é o investimento da empresa, podemos perceber que em muito momentos o investimento está acima do necessário, assim como percebemos que no eixo 'x', o tempo, no início do negócio a linha azul está muito acima no eixo 'y', mostrando que há um gasto muito maior inicialmente optando pelo modelo convencional.
No grafico, outro ponto é que a linha azul vai subindo e não cai, pois a infra está comprada, é da empresa, e não há como se desfazer pois pode haver outro pico. Numa situação de normalização de demanda aquela infra se torna obsoleta.
Dá pra ver que mostra um ponto de pico que a demanda, linha veremlha, corta a azul, que é a infra tradicional. Nesse momento é criado um downtime, indisponibilidade.

### PRINCIPAIS PROVEDORES CLOUD

Mercado de Cloud atual

![Cloud](https://i.imgur.com/XZ7w4q2.png)

Procure aquilo que está sendo necessário no mercado.

Para o mercado de trabalho, não buscam só alguém que sabem de Java. É cobrada toda uma estrutura de conhecimento.

### A CLOUD DA AWS

Ela é distribuida Globalmente, mais de 31 regiões no mundo. No Brasil há uma região, em São Paulo, dentro dessa região há 3 Zonas de Disponibilidade (AZ's). Cada zona é um DataCenter, e eles ficam longe um do outro.

Nivel gratuíto, Free Tier, por um tempo.

[^2]: On-premises(é um cenário de um mundo antes da utilização da Cloud)
[^3]: Escala-Horizontal-e-Vertical(Temos um PC alugado. Aumentar na escala horizontal, seria colocar um outro computador pra rodar ao lado com mesma configuração e usar o balance entre eles. No Vertical, seria aumentar a quantidade de memória/HD/VGA da primeira máquina sem necessidade de colocar uma do lado.)

## VÍDEO 03 -
