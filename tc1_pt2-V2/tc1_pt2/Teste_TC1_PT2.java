package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Teste_TC1_PT2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa4732.22796/tc1_pt2certosipa/tc1_pt2/tests/site/index.html";
		
		//O m�todo get ir� abrir a p�gina localizada em url.
		driver.get(url);
		//maximiza o chrome na p�gina aberta no �term anterior
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//clicar na url click()
		driver.findElement(By.xpath("/html/body/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		//O m�todo getTitle retorna o conte�do de <title> que � comparado com um valor esperado.
		String titulo = driver.getTitle();
		if(titulo.compareTo("Pessoas")==0) {
			System.out.println("O t�tulo da p�gina � "+titulo);
		}else {
			System.out.println("T�tulo n�o esperado");
		}
			
		//O m�todo getCurrentUrl retorna a url da p�gina atual, que � comparada com um valor esperado.
		String urlEsperada = "file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa25132.35549/tc1_pt2-V2/out/production/tc1_pt2/tests/site/pessoas.html";
		String paginaAtual = driver.getCurrentUrl();
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a p�gina correta "+urlEsperada);
			
		}else {
			System.out.println("N�o foi para a p�gina esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
				
		//ir para a p�gina anterior
		driver.navigate().back();
		Thread.sleep(3000);
		
		//ir para a p�gina posterior novamente
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//===================================Pessoas==================================
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a p�gina correta "+urlEsperada);
			//retorna o objeto DOM selecionado a partir de um elemento e atualiza seu valor
			driver.findElement(By.id("nomeCad")).sendKeys("Samuel Caminhas");
			driver.findElement(By.id("cpfCad")).sendKeys("98503459264");
			
			//dropDownPessoas
			WebElement dropDownPessoas = driver.findElement(By.xpath("//*[@id=\"horCad\"]"));
			if(dropDownPessoas.isDisplayed()) {
				System.out.println("Est� sendo mostrado dropDownPessoas");
				if(dropDownPessoas.isEnabled()) {
					System.out.println("Est� habilitado dropDownPessoas");
					//Para selecionar um elemento
					
					//Criando o objeto de seleção
					Select dd = new Select(dropDownPessoas);
					//Seleciona pelo �ndice
					dd.selectByIndex(1);
				}else {
					System.out.println("N�o est� habilitado dropDownPessoas");
				}
			}else {
				System.out.println("N�o est� sendo mostrado dropDownPessoas");
			}
			
			//checkBoxPessoas
			
			WebElement checkBoxRomance = driver.findElement(By.id("romance"));
			
			//Verificar se o checkbox � mostrado
			if(checkBoxRomance.isDisplayed()) {
				System.out.println("O checkbox romance est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxRomance.isEnabled()) {
					System.out.println("O checkbox romance est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxRomance.isSelected()) {
						System.out.println("O checkbox romance est� selecionado");
					}else {
						System.out.println("O checkbox romance n�o est� selecionado");
						checkBoxRomance.click();
					}
				}else {
					System.out.println("O checkbox romance n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox romance n�o est� sendo mostrado");
			}
			
			WebElement checkBoxFic = driver.findElement(By.id("fic��o"));

			//Verificar se o checkbox � mostrado
			if(checkBoxFic.isDisplayed()) {
				System.out.println("O checkbox fic��o est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxFic.isEnabled()) {
					System.out.println("O checkbox fic��o est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxFic.isSelected()) {
						System.out.println("O checkbox fic��o est� selecionado");
					}else {
						System.out.println("O checkbox fic��o n�o est� selecionado");
						checkBoxFic.click();
					}
				}else {
					System.out.println("O checkbox fic��o n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox fic��o n�o est� sendo mostrado");
			}
			
			WebElement checkBoxSuspense = driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/form/div[3]/div[1]/div[4]/label"));

			//Verificar se o checkbox � mostrado
			if(checkBoxSuspense.isDisplayed()) {
				System.out.println("O checkbox suspense est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxSuspense.isEnabled()) {
					System.out.println("O checkbox suspense est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxSuspense.isSelected()) {
						System.out.println("O checkbox suspense est� selecionado");
					}else {
						System.out.println("O checkbox suspense n�o est� selecionado");
						checkBoxSuspense.click();
					}
				}else {
					System.out.println("O checkbox suspense n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox suspense n�o est� sendo mostrado");
			}
			
			//Verificar se o checkbox est� selecionado
			if(checkBoxFic.isSelected()) {
				System.out.println("O checkbox fic��o est� selecionado");
			}else {
				System.out.println("O checkbox fic��o n�o est� selecionado");
			}
			
			if(checkBoxRomance.isSelected()) {
				System.out.println("O checkbox romance est� selecionado");
			}else {
				System.out.println("O checkbox romance n�o est� selecionado");
				checkBoxRomance.click();
			}
			
			if(checkBoxSuspense.isSelected()) {
				System.out.println("O checkbox suspense est� selecionado");
			}else {
				System.out.println("O checkbox suspense n�o est� selecionado");
				checkBoxSuspense.click();
			}
			WebElement radioF = driver.findElement(By.id("feminino"));
			WebElement radioM = driver.findElement(By.id("masculino"));
			WebElement radioO = driver.findElement(By.id("outro"));
			
			//Verificar se o radio button � mostrado
			if(radioF.isDisplayed()) {
				System.out.println("O radio button feminino est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radioF.isEnabled()) {
					System.out.println("O radio button feminino est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radioF.isSelected()) {
						System.out.println("O radio button feminino est� selecionado");
					}else {
						System.out.println("O radio button feminino n�o est� selecionado");
					}
				}else {
					System.out.println("O radio button feminino n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button feminino n�o est� sendo mostrado");
			}
			
			//Verificar se o radio button � mostrado
			if(radioM.isDisplayed()) {
				System.out.println("O radio button masculino est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radioM.isEnabled()) {
					System.out.println("O radio button masculino est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radioM.isSelected()) {
						System.out.println("O radio button masculino est� selecionado");
					}else {
						System.out.println("O radio button masculino n�o est� selecionado");
						radioM.click();
					}
				}else {
					System.out.println("O radio button masculino n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button masculino n�o est� sendo mostrado");
			}
			
			//Verificar se o radio button � mostrado
			if(radioO.isDisplayed()) {
				System.out.println("O radio button outro est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radioO.isEnabled()) {
					System.out.println("O radio button outro est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radioO.isSelected()) {
						System.out.println("O radio button outro est� selecionado");
					}else {
						System.out.println("O radio button outro n�o est� selecionado");
					}
				}else {
					System.out.println("O radio button outro n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button outro n�o est� sendo mostrado");
			}
			
			//Endere�o 
			
			WebElement rua = driver.findElement(By.xpath("//*[@id=\"enderecoCad\"]"));
			
			//Verificar se o rua � mostrado
			if(rua.isDisplayed()) {
				System.out.println("A rua est� sendo mostrado");
				//Verificar se o nome est� habilitado
				if(rua.isEnabled()) {
					System.out.println("A rua est� habilitado");
					//Entrar com o nome
					if(rua.isEnabled()) {
						rua.sendKeys("S�o Nicolau");
						System.out.println("A rua foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo rua");
					}
				}else {
					System.out.println("A rua n�o est� habilitado");
				}
			}else {
				System.out.println("A rua n�o est� sendo mostrado");
			}
			
			//n�mero CEP profiss�o
			
			driver.findElement(By.id("numero")).sendKeys("562");
			driver.findElement(By.id("cep")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"profissaoCad\"]")).sendKeys("Mec�nico de manuten��o");

			//data de nascimento
			WebElement data = driver.findElement(By.id("dataCad"));
			if(data.isDisplayed()) {
				System.out.println("A data est� sendo mostrado");
				//Verificar se o nome est� habilitado
				if(data.isEnabled()) {
					System.out.println("A data est� habilitado");
					//Entrar com a data
					if(data.isEnabled()) {
						data.sendKeys("12/10/1954");
						System.out.println("A data foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo data");
					}
				}else {
					System.out.println("A data n�o est� habilitado");
				}
			}else {
				System.out.println("A data n�o est� sendo mostrado");
			}
			
			//e-mail
			WebElement email = driver.findElement(By.xpath("//*[@id=\"emails\"]"));
			if(email.isDisplayed()) {
				System.out.println("O e-mail est� sendo mostrado");
				//Verificar se o email est� habilitado
				if(email.isEnabled()) {
					System.out.println("O e-mail est� habilitado");
					//Entrar com a email
					if(email.isEnabled()) {
						email.sendKeys("caminhas@caminhas.com");
						System.out.println("O e-mail preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo e-mail");
					}
				}else {
					System.out.println("O e-mail n�o est� habilitado");
				}
			}else {
				System.out.println("O e-mail est� sendo mostrado");
			}
			
			//telefones
			WebElement tel = driver.findElement(By.id("telefones"));
			if(tel.isDisplayed()) {
				System.out.println("O telefone est� sendo mostrado");
				//Verificar se o telefone est� habilitado
				if(tel.isEnabled()) {
					System.out.println("O telefone est� habilitado");
					//Entrar com a telefone
					if(tel.isEnabled()) {
						tel.sendKeys("7336645894");
						System.out.println("O telefone foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo telefone");
					}
				}else {
					System.out.println("O telefone n�o est� habilitado");
				}
			}else {
				System.out.println("O telefone est� sendo mostrado");
			}
		
			//Testar os bot�es
			
			WebElement btnEmails = driver.findElement(By.xpath("//*[@id=\"addEmail\"]"));
			WebElement btnTels = driver.findElement(By.id("addTel"));
			WebElement btnCad = driver.findElement(By.id("cadPessoa"));
			
			//Verificar se o bot�o addEmail est� sendo mostrado
			if(btnEmails.isDisplayed()) {
				System.out.println("O bot�o para adicionar e-mails est� sendo mostrado");
				//Verificar se o bot�o addEmail est� habilitado
				if(btnEmails.isEnabled()) {
					System.out.println("O bot�o para adicionar e-mails est� sendo habilitado");
					btnEmails.click();
					System.out.println("O bot�o para adicionar e-mails foi clicado");
				}else {
					System.out.println("O bot�o para adicionar e-mails n�o est� sendo habilitado");
				}
			}else {
				System.out.println("O bot�o para adicionar e-mails n�o est� sendo mostrado");
			}
			
			//Verificar se o bot�o addTel est� sendo mostrado
			if(btnTels.isDisplayed()) {
				System.out.println("O bot�o para adicionar telefones est� sendo mostrado");
				//Verificar se o bot�o addTel est� habilitado
				if(btnTels.isEnabled()) {
					System.out.println("O bot�o para adicionar telefones est� sendo habilitado");
					btnTels.click();
					System.out.println("O bot�o para adicionar telefones foi clicado");
				}else {
					System.out.println("O bot�o para adicionar telefones n�o est� sendo habilitado");
				}
			}else {
				System.out.println("O bot�o para adicionar telefones n�o est� sendo mostrado");
			}
			
			//Verificar se o bot�o cadastrar est� sendo mostrado
			if(btnCad.isDisplayed()) {
				System.out.println("O bot�o para cadastrar pessoas est� sendo mostrado");
				//Verificar se o bot�o cadastrar est� habilitado
				if(btnCad.isEnabled()) {
					System.out.println("O bot�o para cadastrar pessoas est� sendo habilitado");
					btnCad.click();
					System.out.println("O bot�o para cadastrar pessoas foi clicado");
				}else {
					System.out.println("O bot�o para cadastrar pessoas n�o est� sendo habilitado");
				}
			}else {
				System.out.println("O bot�o para cadastrar pessoas n�o est� sendo mostrado");
			}
			Thread.sleep(3000);
			Thread.sleep(3000);
		}else {
			System.out.println("N�o foi para a p�gina esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
		//atualizar a p�gina(refresh)
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//=====================================LIVROS======================
		
		//clicar na url click()
		driver.findElement(By.xpath("/html/body/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
							
		//O m�todo getCurrentUrl retorna a url da p�gina atual, que � comparada com um valor esperado.
		urlEsperada = "file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa2136.45715/tc1_pt2-V2/out/production/tc1_pt2/tests/site/livros.html";
		paginaAtual = driver.getCurrentUrl();
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a p�gina correta "+urlEsperada);
				
		}else {
			System.out.println("N�o foi para a p�gina esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
		
		//navegar para a p�gina dos Livros
		
		driver.navigate().to("file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa2136.45715/tc1_pt2-V2/out/production/tc1_pt2/tests/site/livros.html");
		paginaAtual = driver.getCurrentUrl();
		
		if(paginaAtual.compareTo(urlEsperada)==0) {
			
			//ISBN
			WebElement isbn = driver.findElement(By.id("isbnCad"));
			if(isbn.isDisplayed()) {
				System.out.println("O isbn est� sendo mostrado");
				//Verificar se o isbn est� habilitado
				if(isbn.isEnabled()) {
					System.out.println("O isbn est� habilitado");
					//Entrar com a isbn
					if(isbn.isEnabled()) {
						isbn.sendKeys("11998523354");
						System.out.println("O isbn foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo isbn");
					}
				}else {
					System.out.println("O isbn n�o est� habilitado");
				}
			}else {
				System.out.println("O isbn est� sendo mostrado");
			}
			
			
			//dropDownLivros
			WebElement dropDownLivros = driver.findElement(By.id("catCad"));
			if(dropDownLivros.isDisplayed()) {
				System.out.println("Est� sendo mostrado dropDownLivros");
				if(dropDownLivros.isEnabled()) {
					System.out.println("Est� habilitado dropDownLivros");
					//Para selecionar um elemento
					
					//Criando o objeto de seleção
					Select cc = new Select(dropDownLivros);
					//Seleciona pelo �ndice
					cc.selectByIndex(2);
				}else {
					System.out.println("N�o est� habilitado dropDownLivros");
				}
			}else {
				System.out.println("N�o est� sendo mostrado dropDownLivros");
			}
			
			//checkBoxLivros
			
			WebElement checkBoxCapa = driver.findElement(By.xpath("//*[@id=\"capa\"]"));
			
			//Verificar se o checkbox capa � mostrado
			if(checkBoxCapa.isDisplayed()) {
				System.out.println("O checkbox capa est� sendo mostrado");
				//Verificar se o checkbox capa est� habilitado
				if(checkBoxCapa.isEnabled()) {
					System.out.println("O checkbox capa est� habilitado");
					//Verificar se o checkbox capa est� selecionado
					if(checkBoxCapa.isSelected()) {
						System.out.println("O checkbox capa est� selecionado");
					}else {
						System.out.println("O checkbox capa n�o est� selecionado");
						checkBoxCapa.click();
					}
				}else {
					System.out.println("O checkbox capa n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox capa n�o est� sendo mostrado");
			}
			
			WebElement checkBoxBolso = driver.findElement(By.xpath("//*[@id=\"bolso\"]"));

			//Verificar se o checkbox bolso � mostrado
			if(checkBoxBolso.isDisplayed()) {
				System.out.println("O checkbox bolso est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxBolso.isEnabled()) {
					System.out.println("O checkbox bolso est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxBolso.isSelected()) {
						System.out.println("O checkbox bolso est� selecionado");
					}else {
						System.out.println("O checkbox bolso n�o est� selecionado");
						//checkBoxBolso.click();
					}
				}else {
					System.out.println("O checkbox bolso n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox bolso n�o est� sendo mostrado");
			}
			
			WebElement checkBoxIdioma = driver.findElement(By.id("idioma_estrangeiro"));

			//Verificar se o checkbox � mostrado
			if(checkBoxIdioma.isDisplayed()) {
				System.out.println("O checkbox idioma est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxIdioma.isEnabled()) {
					System.out.println("O checkbox idioma est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxIdioma.isSelected()) {
						System.out.println("O checkbox idioma est� selecionado");
					}else {
						System.out.println("O checkbox idioma n�o est� selecionado");
						checkBoxIdioma.click();
					}
				}else {
					System.out.println("O checkbox idioma n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox idioma n�o est� sendo mostrado");
			}
			
			WebElement checkBoxDesenhos = driver.findElement(By.id("desenhos"));

			//Verificar se o checkbox � mostrado
			if(checkBoxDesenhos.isDisplayed()) {
				System.out.println("O checkbox desenhos est� sendo mostrado");
				//Verificar se o checkbox est� habilitado
				if(checkBoxDesenhos.isEnabled()) {
					System.out.println("O checkbox desenhos est� habilitado");
					//Verificar se o checkbox est� selecionado
					if(checkBoxDesenhos.isSelected()) {
						System.out.println("O checkbox desenhos est� selecionado");
					}else {
						System.out.println("O checkbox desenhos n�o est� selecionado");
						checkBoxDesenhos.click();
					}
				}else {
					System.out.println("O checkbox desenhos n�o est� habilitado");
				}
			}else {
				System.out.println("O checkbox desenhos n�o est� sendo mostrado");
			}
			
			WebElement radio0 = driver.findElement(By.id("livre"));
			WebElement radio12 = driver.findElement(By.id("12anos"));
			WebElement radio16 = driver.findElement(By.id("16anos"));
			WebElement radio18 = driver.findElement(By.id("18anos"));
			
			//Verificar se o radio button � mostrado
			if(radio0.isDisplayed()) {
				System.out.println("O radio button livre est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radio0.isEnabled()) {
					System.out.println("O radio button livre est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radio0.isSelected()) {
						System.out.println("O radio button livre est� selecionado");
					}else {
						System.out.println("O radio button livre n�o est� selecionado");
						radio0.click();
					}
				}else {
					System.out.println("O radio button livre n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button livre n�o est� sendo mostrado");
			}
			
			//Verificar se o radio button � mostrado
			if(radio12.isDisplayed()) {
				System.out.println("O radio button 12anos est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radio12.isEnabled()) {
					System.out.println("O radio button 12anos est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radio12.isSelected()) {
						System.out.println("O radio button 12anos est� selecionado");
					}else {
						System.out.println("O radio button 12anos n�o est� selecionado");
						radio12.click();
					}
				}else {
					System.out.println("O radio button 12anos n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button 12anos n�o est� sendo mostrado");
			}
			
			//Verificar se o radio button � mostrado
			if(radio16.isDisplayed()) {
				System.out.println("O radio button 16anos est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radio16.isEnabled()) {
					System.out.println("O radio button 16anos est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radio16.isSelected()) {
						System.out.println("O radio button 16anos est� selecionado");
					}else {
						System.out.println("O radio button 16anos n�o est� selecionado");
					}
				}else {
					System.out.println("O radio button 16anos n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button 16anos n�o est� sendo mostrado");
			}
			
			//Verificar se o radio button � mostrado
			if(radio18.isDisplayed()) {
				System.out.println("O radio button 18anos est� sendo mostrado");
				//Verificar se o radio button est� habilitado
				if(radio12.isEnabled()) {
					System.out.println("O radio button 18anos est� habilitado");
					//Verificar se o radio button est� selecionado
					if(radio12.isSelected()) {
						System.out.println("O radio button 18anos est� selecionado");
					}else {
						System.out.println("O radio button 18anos n�o est� selecionado");
						//radio18.click();
					}
				}else {
					System.out.println("O radio button 18anos n�o est� habilitado");
				}
			}else {
				System.out.println("O radio button 18anos n�o est� sendo mostrado");
			}
			
			//T�ulo 
			
			WebElement tit = driver.findElement(By.id("tituloCad"));
			
			//Verificar se o t�tulo � mostrado
			if(tit.isDisplayed()) {
				System.out.println("O t�tulo est� sendo mostrado");
				//Verificar se o nome est� habilitado
				if(tit.isEnabled()) {
					System.out.println("O t�tulo est� habilitado");
					//Entrar com o nome
					if(tit.isEnabled()) {
						tit.sendKeys("Um Novo Sonho");
						System.out.println("O t�tulo foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo t�tulo");
					}
				}else {
					System.out.println("O t�tulo n�o est� habilitado");
				}
			}else {
				System.out.println("O t�tulo n�o est� sendo mostrado");
			}
			
			//numero de p�ginas
			WebElement pg = driver.findElement(By.xpath("//*[@id=\"numero\"]"));
			if(pg.isDisplayed()) {
				System.out.println("As p�ginas est�o sendo mostradas");
				//Verificar se o nome est� habilitado
				if(pg.isEnabled()) {
					System.out.println("As p�ginas est�o habilitadas");
					//Entrar com n�mero de p�ginas
					if(pg.isEnabled()) {
						pg.sendKeys("356");
						System.out.println("As p�ginas foram preenchidas");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo p�ginas");
					}
				}else {
					System.out.println("As p�ginas n�o est�o habilitado");
				}
			}else {
				System.out.println("As p�ginas n�o est�o sendo mostrado");
			}
			
			//Autores
			WebElement autor = driver.findElement(By.id("autor"));
			if(autor.isDisplayed()) {
				System.out.println("O autor est� sendo mostrado");
				//Verificar se o autor est� habilitado
				if(autor.isEnabled()) {
					System.out.println("O autor est� habilitado");
					//Entrar com a autor
					if(autor.isEnabled()) {
						autor.sendKeys("Gabriela Pereira");
						System.out.println("O autor foi preenchido");
					}else {
						System.out.println("N�o foi poss�vel preencher o campo autor");
					}
				}else {
					System.out.println("O autor n�o est� habilitado");
				}
			}else {
				System.out.println("O autor est� sendo mostrado");
			}
		
			//Testar os bot�es
			
			WebElement btnAutores = driver.findElement(By.id("addAutor"));
			WebElement btnCadL = driver.findElement(By.id("cadLivros"));
			
			//Verificar se o bot�o btnAutores est� sendo mostrado
			if(btnAutores.isDisplayed()) {
				System.out.println("O bot�o para adicionar autores est� sendo mostrado");
				//Verificar se o bot�o btnAutores est� habilitado
				if(btnAutores.isEnabled()) {
					System.out.println("O bot�o para adicionar autores est� sendo habilitado");
					btnAutores.click();
					System.out.println("O bot�o para adicionar autores foi clicado");
				}else {
					System.out.println("O bot�o para adicionar autores n�o est� sendo habilitado");
				}
			}else {
				System.out.println("O bot�o para adicionar autores n�o est� sendo mostrado");
			}
			
			
			//Verificar se o bot�o cadastrar est� sendo mostrado
			if(btnCadL.isDisplayed()) {
				System.out.println("O bot�o para cadastrar livros est� sendo mostrado");
				//Verificar se o bot�o cadastrar est� habilitado
				if(btnCadL.isEnabled()) {
					System.out.println("O bot�o para cadastrar livros est� sendo habilitado");
					btnCadL.click();
					System.out.println("O bot�o para cadastrar livros foi clicado");
				}else {
					System.out.println("O bot�o para cadastrar livros n�o est� sendo habilitado");
				}
			}else {
				System.out.println("O bot�o para cadastrar livros n�o est� sendo mostrado");
			}
			Thread.sleep(3000);
			Thread.sleep(3000);
			
		}else {
			System.out.println("N�o foi para a p�gina esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
	
	}
}