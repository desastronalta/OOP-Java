# OOP-Java
Studies of Object Orientetion Program in Java : )


POO (programação orientada a objetos)
apos indentificar o objeto a ser tratados vemos suas caracteristicas

	por exemplo um jogador de fultebol ele possui
		int numero 
		String posição
		String nacionalidade
		String nome
		Float tamanho
essas caracteristicas se denominam atributos do objeto
onde o objeto é determinado por objetos semelhantes que estão dentro dessa classe que se distingue por meio de seus atributos onde todos os objetos possuem os mesmos atributos porem com valores diferentes. 
	
classe e objeto


**
classes
-sao agrupamentos de objetos(intancias da classe ou seja sao sejaros pela classe) onde quanto identificamos esse agrupamento identificamos a sua classe e essa classe possui seus atributos(caracteristiscas). 
Ex:	
	Classe Jogador
			
		atributos_Ex1
		nome : Iniesta
		numero : 6
		posição : meia 
		nacionalidade : espanhola
		tamanho : 1,65 //numero ficticio
		cabelo: faltando
\\

		atributos_Ex2
		nome : pique
		numero : 3
		posição : atacante 
		nacionalidade : espanhola
		tamanho : 1,75 // tambem ficticio
		cabelo: topete

ambos são objetos que se classificam na Classe Jogador que compartilham dos mesmos atributos porém com valores diferentes

-sao a forma estrutural de etapas e comandos que serão aferidos com certas propriedades do objeto.

-propriedades
    
   as propridades de uma classe sao os dados que serão  utilizados nesta função podendo ser estatica (que nao se altera) ou versatil (pode ocorrer alterações)
um exemplo de estatic é a data de nascimento de uma pessoa ja de versatil seria seus dados bancarios

-metodos 

   os metodos sao como esses objetos serao utilizados pela clase seria mais de que forma eles seriam moldados similia ao funcionamento de uma função que realiza determinada ação com seu codigo dentro da programação estrutural.

-criar um objeto com operador
	As classes originam intâncias sob requisição, em um processo denominado instanciação.

o operador NEW permite intanciar uma classe, criando efetivamente um objeto da classe considerada

SINTAXE
classe nomeObjeto = new Classe() <-- método construtor da classe

isso cria uma estrutura na memória 

--método de overloading

A sobrecarga de métodos funciona a traves da criação de vários métodos com o mesmo nome  e funções similirares podendo ter parametros diferentes
ou funções a mais ou a menos. a distinção de um para o outro se da por meio de assinaturas quais podem ser variadas dependendo da necessidade
podendo ser a quantidade de parametros o tipo de dados usado entre outros.

SET E GET
sao utilizados para a criação de metodos para fixar e pegar informações de uma classe 
qual se encontra como private de forma de evitar o acesso a qualquer momento alem de aumentar
a robuztes do código.

UML : linguagem de Modelagem Unificada
CLASSE : define como será o objeto
OBJETO : é uma instancia (como se fosse uma copia da classe) da classe
o processo de criação de objetos se chama instanciação.
 
CLASSE Escola
-objetos 

	Aluno
		String nome
		Date data de nascimento
		String RA 
	Professor
		String nome
		String Matricula
		int Salário
		Stringformação
	Diciplina
		String nome
		int cargaHoraria 	
	Turma
		String sigla
		int ano
		
possuimos diferentes objetos logo cada um tem sua Classe ou seja sua instancia definimos a classe com a primeira letra SEMPRE maiuscula e no singular e toda classe possui atributos pois os objetos possuem caracteristicas(atributos), e esses atributos sempre começam com letras minusculas sendo separados por letras maiusculas e retirar preposições nao se usa acentos ou ç entre outros  ex:  nome do aluno = nomeAluno;
 
alem de atributos podem ter comportamentos acoes (métodos):
por exemplo o aluno pode realizarAvaliacao;

e o professor pode aplicarAvaliacao;

a Turma pode adicionarAluno;

para representar isso de forma descente apresentamos através de um diagramas de classe pela UML.

no video o orientador utiliza o Astah

Existem 2 tipos de relacionamento

TEM-UM (é uma associação)

É (herança ou nao UML, generalização)

multiplicidade : quantos objetos de um lado se associam com o objeto do outro lado.
se o aluno tem um numero definido de turmas (no caso 1) entao utilizamos apenas um numero

se o aluno PODE estar em mais de uma turma entao utillizamos dois numeros no caso minimo..maximo para definir o scopo 

se nao existir um numero ou scopo definido utilizamos unspecified

Por exemplo o aluno TEM turma ou o aluno é de uma turma?

se o aluno pode estar em muitas turmas ou em nenhuma ulizamos 0..* onde '*' representa muitas

o que seria uma associação?
r: associação se da quando um objeto esta relacionado com outro como uma correlação 

e herança?
na orientação a objetos ocorre quando herdamos caracteristicas e comportamento de outras classes qual se denomina classe mae ou super classe e as classes que herdam se denomina sub classes.
Exemplo:
Aluno não tem uma pessoa ele é uma pessoa assim como o professor nao tem uma pessoa ele é uma pessoa,  ou seja ambos herdam caracteristicas da classe pessoa. neste exemplo, o professor tem nome assim como o aluno tbm tem nome logo pessoa tem nome provando assim que é um atributo herdado de outra classe.
outra caracteristicas herdada de outra classe seria a matricula e o ra pois ambos, dentro do ambiente escola, servem para registrar pessoas.

logo se tratando de herança deixamos apenas aquilo que é exclusivo da subclasse e os atributos em comum continuam apenas na superClasse.

RELAÇÕES
quando temos 1 para 1..* se denomina 1 para n
se for 1..* para 1..* denomina n para n

DENTRO DO CODIGO
para representar herança no codigo utilizamos o termo extends após o nome da classe para referenciar a superclasse por exemplo 
a sub classe aluno vai ter a data de nascimento e todos os atributos da classe pessoa. neste caso, nome e matricula.

para assiciação nos precisamos saber quantos objetos de uma determinada classe se pode comportar em uma outra classe, por exemplo no diagrama a relação entre Aluno e turma é 1 para n onde cada aluno pode ter 1 turma e cada turma tem no minimo 1 aluno mas pode ter muitos.

no caso da turma como acopla varios alunos, uma boa forma de armazenar varios valores é através de um vetor, ou lista.(no caso do java foi utilizado uma ArrayList devido a ser genérica e relizar bem a tarefa necessaria.)

já no caso do aluno eu posso pegar apenas um objeto da classe turma.

APRENDENDO A CRIAR OBJETOS 

por exemplo para cada diciplina temos que criar um objeto com os atributos da classe Diciplina;

tipos de acesso:

PUBLIC todo mundo tem acesso ao metodo

PRIVATE apenas elementos dentro da classe tem acesso

PACKAGE como se fosse o default quando nao especificamos o acesso à classe, logo apenas o pacote tem acesso aos elementos desta classe

PROTECTED somente a própria classe e a sub classe acessam diretamente.

dentro de orientação a objteos existe o conceito de encapsulamento que seria como limitar e proteger para evitar que seja inserido valores nao condizentes com as condições especificas do atributo.

TODA classe possui um método construtor e esse método construtor inicialmente esta vazio e implicito para passar valores e ações para esse metodo criamos um metodo como public e o nome da classe depois acressenta os parenteses.

Ex: public Class(//aqui estarao os parametros utilizados pela classe){
	// aqui estarão os codigos referentes ao metodo construdor.
}
