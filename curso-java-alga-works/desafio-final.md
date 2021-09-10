O desafio final é abrir uma aplicação de gerenciamento de contatos com o Spring Tool Suite, utilizando HTML, CSS e o Java.
A criação do projeto no STS é feita pelo "Spring Starter Project". Por convenção temos os seguintes preenchimentos:
- Name: Nome da aplicação, em Camel Case;
- Group: nome do site ao contrário, ex.: com.algaworks;
- Artifact: Nome da aplicação em minúsculo separado por traço;
- Version: versão;
- Description: descrição da aplicação;
- Package: nome do site ao contrário, ex.: com.algaworks.
As dependências escolhidas foram:
- Spring Boot DevTools : funcionalidade para o desenvolvimento;
- Thymeleaf : para o HTML;
- Spring Web.

### OBSERVAÇÕES
- static {} : o bloco estático é rodado logo ao iniciar uma aplicação java.
- ModelAndVieiew : tipo de varíavel utilizada para renderizar páginas.
```
@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
```
- Padrão JavaBean: o padrão diz que os atributos tem que ser privados, e acessados apenas pelos métodos da própria classe, como os getters e setters. Quanto for usar o tipo de varíavel o boolean primitivo, usar `is` ao invés de `get`.
- Para gerar um identificador aleatório podemos utilizar o UUID, conforme abaixo:
```
String id = UUID.randomUUID().toString();
contato.setId(id);
```