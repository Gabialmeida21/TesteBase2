# language: pt

Funcionalidade: Realizar Login

	Como usuario 
	Eu quero logar no Mantis
	Para que eu possa ver todos os bugs

Esquema do Cenario: Logar no Mantis

	Dado que estou na pagina de login 
	Quando eu informo o "<Login>" no campo Username
	E informo a "<senha>" no campo Password
	E clico no botao Login
	Entao eu vejo a pagina inicial
	
Exemplos:
|	Login            |  Senha   |
| gabriela.penha   | 426188   |
