# language: pt

Funcionalidade: Inserir detalhes do relatorio

	Como usuario 
	Eu quero acessar a pagina Report Issue 
	Para verificar os campos do relatorio

Esquema do Cenario: Preencher campos do relatorio

	Dado que estou na pagina Report Issue
	Quando eu informo a "<categoria>" no campo Categoria
	E preencho o "<resumo>" no campo resumo
	E preencho a "<descricao>" no campo Descricao
	E clico no botao "<Enviar Relatorio>"
	Entao o sistema exibe "<mensagem>"
	
Exemplos:
|	categoria                   |  resumo    |  descricao    | Mensagem            |
| [All Projects] 7EI2PODHPN   | Teste      |  Teste        | Operation Successful|


