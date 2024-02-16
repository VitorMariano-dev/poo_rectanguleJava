Neste exercicio de fixação dou inicio a jornada de estudos de Programação Orientada a Objetos (POO) com a linguagem Java.

Comecei criando udois packages um chamado entities e o outro chamado aplication.

No package aplication é onde o arquivo é executo, neste arquivo que eu rodo o código para ver se funcionou nele recebemos as informações que os usuário preenche no console para conseguirmos tratar

No package entities defini as variaveis width e height como pública para que eu consiga utilizar ela novamente no arquivo do package aplication. Também neste package realizamos todas as somas do retangulo então criei algumas funções publicas dentro dele.

A primeira função é a area() onde rela retorna o valor do altura vezes largura (width * height)

A segunda função é a função perimeter(), onde ela calcula o perimetro total do retangulo ( 2* (width + heigth)

Ja a terceira função é a diagonal() essa função calcula o comprimento de uma ponta até a outra. foi também a função que eu mais quebrei a cabeça para retornar o valor correto pois como ela tinha que retornar a raiz quadrada eu acabei quebrando a cabeça para conseguir
colocar na sintaxe do Java. Tentei fazer o caminho mais complicado para no final ler nos foruns que na sintaxe de Java ele ja tem uma semantica para isso nesse caso é o Math.sqrt (raiz quadrada de) e tem também a semantica Math.pow (elevado a). 
Onde no código ficou da seguinte forma Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); = raiz quadrada de width² + heigth²
