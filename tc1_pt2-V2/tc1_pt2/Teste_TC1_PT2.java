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
		
		//O método get irá abrir a página localizada em url.
		driver.get(url);
		//maximiza o chrome na página aberta no íterm anterior
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//clicar na url click()
		driver.findElement(By.xpath("/html/body/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		//O método getTitle retorna o conteúdo de <title> que é comparado com um valor esperado.
		String titulo = driver.getTitle();
		if(titulo.compareTo("Pessoas")==0) {
			System.out.println("O título da página é "+titulo);
		}else {
			System.out.println("Título não esperado");
		}
			
		//O método getCurrentUrl retorna a url da página atual, que é comparada com um valor esperado.
		String urlEsperada = "file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa25132.35549/tc1_pt2-V2/out/production/tc1_pt2/tests/site/pessoas.html";
		String paginaAtual = driver.getCurrentUrl();
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a página correta "+urlEsperada);
			
		}else {
			System.out.println("Não foi para a página esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
				
		//ir para a página anterior
		driver.navigate().back();
		Thread.sleep(3000);
		
		//ir para a página posterior novamente
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//===================================Pessoas==================================
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a página correta "+urlEsperada);
			//retorna o objeto DOM selecionado a partir de um elemento e atualiza seu valor
			driver.findElement(By.id("nomeCad")).sendKeys("Samuel Caminhas");
			driver.findElement(By.id("cpfCad")).sendKeys("98503459264");
			
			//dropDownPessoas
			WebElement dropDownPessoas = driver.findElement(By.xpath("//*[@id=\"horCad\"]"));
			if(dropDownPessoas.isDisplayed()) {
				System.out.println("Está sendo mostrado dropDownPessoas");
				if(dropDownPessoas.isEnabled()) {
					System.out.println("Está habilitado dropDownPessoas");
					//Para selecionar um elemento
					
					//Criando o objeto de seleÃ§Ã£o
					Select dd = new Select(dropDownPessoas);
					//Seleciona pelo índice
					dd.selectByIndex(1);
				}else {
					System.out.println("Não está habilitado dropDownPessoas");
				}
			}else {
				System.out.println("Não está sendo mostrado dropDownPessoas");
			}
			
			//checkBoxPessoas
			
			WebElement checkBoxRomance = driver.findElement(By.id("romance"));
			
			//Verificar se o checkbox é mostrado
			if(checkBoxRomance.isDisplayed()) {
				System.out.println("O checkbox romance está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxRomance.isEnabled()) {
					System.out.println("O checkbox romance está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxRomance.isSelected()) {
						System.out.println("O checkbox romance está selecionado");
					}else {
						System.out.println("O checkbox romance não está selecionado");
						checkBoxRomance.click();
					}
				}else {
					System.out.println("O checkbox romance não está habilitado");
				}
			}else {
				System.out.println("O checkbox romance não está sendo mostrado");
			}
			
			WebElement checkBoxFic = driver.findElement(By.id("ficção"));

			//Verificar se o checkbox é mostrado
			if(checkBoxFic.isDisplayed()) {
				System.out.println("O checkbox ficção está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxFic.isEnabled()) {
					System.out.println("O checkbox ficção está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxFic.isSelected()) {
						System.out.println("O checkbox ficção está selecionado");
					}else {
						System.out.println("O checkbox ficção não está selecionado");
						checkBoxFic.click();
					}
				}else {
					System.out.println("O checkbox ficção não está habilitado");
				}
			}else {
				System.out.println("O checkbox ficção não está sendo mostrado");
			}
			
			WebElement checkBoxSuspense = driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/form/div[3]/div[1]/div[4]/label"));

			//Verificar se o checkbox é mostrado
			if(checkBoxSuspense.isDisplayed()) {
				System.out.println("O checkbox suspense está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxSuspense.isEnabled()) {
					System.out.println("O checkbox suspense está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxSuspense.isSelected()) {
						System.out.println("O checkbox suspense está selecionado");
					}else {
						System.out.println("O checkbox suspense não está selecionado");
						checkBoxSuspense.click();
					}
				}else {
					System.out.println("O checkbox suspense não está habilitado");
				}
			}else {
				System.out.println("O checkbox suspense não está sendo mostrado");
			}
			
			//Verificar se o checkbox está selecionado
			if(checkBoxFic.isSelected()) {
				System.out.println("O checkbox ficção está selecionado");
			}else {
				System.out.println("O checkbox ficção não está selecionado");
			}
			
			if(checkBoxRomance.isSelected()) {
				System.out.println("O checkbox romance está selecionado");
			}else {
				System.out.println("O checkbox romance não está selecionado");
				checkBoxRomance.click();
			}
			
			if(checkBoxSuspense.isSelected()) {
				System.out.println("O checkbox suspense está selecionado");
			}else {
				System.out.println("O checkbox suspense não está selecionado");
				checkBoxSuspense.click();
			}
			WebElement radioF = driver.findElement(By.id("feminino"));
			WebElement radioM = driver.findElement(By.id("masculino"));
			WebElement radioO = driver.findElement(By.id("outro"));
			
			//Verificar se o radio button é mostrado
			if(radioF.isDisplayed()) {
				System.out.println("O radio button feminino está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radioF.isEnabled()) {
					System.out.println("O radio button feminino está habilitado");
					//Verificar se o radio button está selecionado
					if(radioF.isSelected()) {
						System.out.println("O radio button feminino está selecionado");
					}else {
						System.out.println("O radio button feminino não está selecionado");
					}
				}else {
					System.out.println("O radio button feminino não está habilitado");
				}
			}else {
				System.out.println("O radio button feminino não está sendo mostrado");
			}
			
			//Verificar se o radio button é mostrado
			if(radioM.isDisplayed()) {
				System.out.println("O radio button masculino está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radioM.isEnabled()) {
					System.out.println("O radio button masculino está habilitado");
					//Verificar se o radio button está selecionado
					if(radioM.isSelected()) {
						System.out.println("O radio button masculino está selecionado");
					}else {
						System.out.println("O radio button masculino não está selecionado");
						radioM.click();
					}
				}else {
					System.out.println("O radio button masculino não está habilitado");
				}
			}else {
				System.out.println("O radio button masculino não está sendo mostrado");
			}
			
			//Verificar se o radio button é mostrado
			if(radioO.isDisplayed()) {
				System.out.println("O radio button outro está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radioO.isEnabled()) {
					System.out.println("O radio button outro está habilitado");
					//Verificar se o radio button está selecionado
					if(radioO.isSelected()) {
						System.out.println("O radio button outro está selecionado");
					}else {
						System.out.println("O radio button outro não está selecionado");
					}
				}else {
					System.out.println("O radio button outro não está habilitado");
				}
			}else {
				System.out.println("O radio button outro não está sendo mostrado");
			}
			
			//Endereço 
			
			WebElement rua = driver.findElement(By.xpath("//*[@id=\"enderecoCad\"]"));
			
			//Verificar se o rua é mostrado
			if(rua.isDisplayed()) {
				System.out.println("A rua está sendo mostrado");
				//Verificar se o nome está habilitado
				if(rua.isEnabled()) {
					System.out.println("A rua está habilitado");
					//Entrar com o nome
					if(rua.isEnabled()) {
						rua.sendKeys("São Nicolau");
						System.out.println("A rua foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo rua");
					}
				}else {
					System.out.println("A rua não está habilitado");
				}
			}else {
				System.out.println("A rua não está sendo mostrado");
			}
			
			//número CEP profissão
			
			driver.findElement(By.id("numero")).sendKeys("562");
			driver.findElement(By.id("cep")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"profissaoCad\"]")).sendKeys("Mecânico de manutenção");

			//data de nascimento
			WebElement data = driver.findElement(By.id("dataCad"));
			if(data.isDisplayed()) {
				System.out.println("A data está sendo mostrado");
				//Verificar se o nome está habilitado
				if(data.isEnabled()) {
					System.out.println("A data está habilitado");
					//Entrar com a data
					if(data.isEnabled()) {
						data.sendKeys("12/10/1954");
						System.out.println("A data foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo data");
					}
				}else {
					System.out.println("A data não está habilitado");
				}
			}else {
				System.out.println("A data não está sendo mostrado");
			}
			
			//e-mail
			WebElement email = driver.findElement(By.xpath("//*[@id=\"emails\"]"));
			if(email.isDisplayed()) {
				System.out.println("O e-mail está sendo mostrado");
				//Verificar se o email está habilitado
				if(email.isEnabled()) {
					System.out.println("O e-mail está habilitado");
					//Entrar com a email
					if(email.isEnabled()) {
						email.sendKeys("caminhas@caminhas.com");
						System.out.println("O e-mail preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo e-mail");
					}
				}else {
					System.out.println("O e-mail não está habilitado");
				}
			}else {
				System.out.println("O e-mail está sendo mostrado");
			}
			
			//telefones
			WebElement tel = driver.findElement(By.id("telefones"));
			if(tel.isDisplayed()) {
				System.out.println("O telefone está sendo mostrado");
				//Verificar se o telefone está habilitado
				if(tel.isEnabled()) {
					System.out.println("O telefone está habilitado");
					//Entrar com a telefone
					if(tel.isEnabled()) {
						tel.sendKeys("7336645894");
						System.out.println("O telefone foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo telefone");
					}
				}else {
					System.out.println("O telefone não está habilitado");
				}
			}else {
				System.out.println("O telefone está sendo mostrado");
			}
		
			//Testar os botões
			
			WebElement btnEmails = driver.findElement(By.xpath("//*[@id=\"addEmail\"]"));
			WebElement btnTels = driver.findElement(By.id("addTel"));
			WebElement btnCad = driver.findElement(By.id("cadPessoa"));
			
			//Verificar se o botão addEmail está sendo mostrado
			if(btnEmails.isDisplayed()) {
				System.out.println("O botão para adicionar e-mails está sendo mostrado");
				//Verificar se o botão addEmail está habilitado
				if(btnEmails.isEnabled()) {
					System.out.println("O botão para adicionar e-mails está sendo habilitado");
					btnEmails.click();
					System.out.println("O botão para adicionar e-mails foi clicado");
				}else {
					System.out.println("O botão para adicionar e-mails não está sendo habilitado");
				}
			}else {
				System.out.println("O botão para adicionar e-mails não está sendo mostrado");
			}
			
			//Verificar se o botão addTel está sendo mostrado
			if(btnTels.isDisplayed()) {
				System.out.println("O botão para adicionar telefones está sendo mostrado");
				//Verificar se o botão addTel está habilitado
				if(btnTels.isEnabled()) {
					System.out.println("O botão para adicionar telefones está sendo habilitado");
					btnTels.click();
					System.out.println("O botão para adicionar telefones foi clicado");
				}else {
					System.out.println("O botão para adicionar telefones não está sendo habilitado");
				}
			}else {
				System.out.println("O botão para adicionar telefones não está sendo mostrado");
			}
			
			//Verificar se o botão cadastrar está sendo mostrado
			if(btnCad.isDisplayed()) {
				System.out.println("O botão para cadastrar pessoas está sendo mostrado");
				//Verificar se o botão cadastrar está habilitado
				if(btnCad.isEnabled()) {
					System.out.println("O botão para cadastrar pessoas está sendo habilitado");
					btnCad.click();
					System.out.println("O botão para cadastrar pessoas foi clicado");
				}else {
					System.out.println("O botão para cadastrar pessoas não está sendo habilitado");
				}
			}else {
				System.out.println("O botão para cadastrar pessoas não está sendo mostrado");
			}
			Thread.sleep(3000);
			Thread.sleep(3000);
		}else {
			System.out.println("Não foi para a página esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
		//atualizar a página(refresh)
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//=====================================LIVROS======================
		
		//clicar na url click()
		driver.findElement(By.xpath("/html/body/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
							
		//O método getCurrentUrl retorna a url da página atual, que é comparada com um valor esperado.
		urlEsperada = "file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa2136.45715/tc1_pt2-V2/out/production/tc1_pt2/tests/site/livros.html";
		paginaAtual = driver.getCurrentUrl();
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a página correta "+urlEsperada);
				
		}else {
			System.out.println("Não foi para a página esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
		
		//navegar para a página dos Livros
		
		driver.navigate().to("file:///C:/Users/Samuel/AppData/Local/Temp/Rar$EXa2136.45715/tc1_pt2-V2/out/production/tc1_pt2/tests/site/livros.html");
		paginaAtual = driver.getCurrentUrl();
		
		if(paginaAtual.compareTo(urlEsperada)==0) {
			
			//ISBN
			WebElement isbn = driver.findElement(By.id("isbnCad"));
			if(isbn.isDisplayed()) {
				System.out.println("O isbn está sendo mostrado");
				//Verificar se o isbn está habilitado
				if(isbn.isEnabled()) {
					System.out.println("O isbn está habilitado");
					//Entrar com a isbn
					if(isbn.isEnabled()) {
						isbn.sendKeys("11998523354");
						System.out.println("O isbn foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo isbn");
					}
				}else {
					System.out.println("O isbn não está habilitado");
				}
			}else {
				System.out.println("O isbn está sendo mostrado");
			}
			
			
			//dropDownLivros
			WebElement dropDownLivros = driver.findElement(By.id("catCad"));
			if(dropDownLivros.isDisplayed()) {
				System.out.println("Está sendo mostrado dropDownLivros");
				if(dropDownLivros.isEnabled()) {
					System.out.println("Está habilitado dropDownLivros");
					//Para selecionar um elemento
					
					//Criando o objeto de seleÃ§Ã£o
					Select cc = new Select(dropDownLivros);
					//Seleciona pelo índice
					cc.selectByIndex(2);
				}else {
					System.out.println("Não está habilitado dropDownLivros");
				}
			}else {
				System.out.println("Não está sendo mostrado dropDownLivros");
			}
			
			//checkBoxLivros
			
			WebElement checkBoxCapa = driver.findElement(By.xpath("//*[@id=\"capa\"]"));
			
			//Verificar se o checkbox capa é mostrado
			if(checkBoxCapa.isDisplayed()) {
				System.out.println("O checkbox capa está sendo mostrado");
				//Verificar se o checkbox capa está habilitado
				if(checkBoxCapa.isEnabled()) {
					System.out.println("O checkbox capa está habilitado");
					//Verificar se o checkbox capa está selecionado
					if(checkBoxCapa.isSelected()) {
						System.out.println("O checkbox capa está selecionado");
					}else {
						System.out.println("O checkbox capa não está selecionado");
						checkBoxCapa.click();
					}
				}else {
					System.out.println("O checkbox capa não está habilitado");
				}
			}else {
				System.out.println("O checkbox capa não está sendo mostrado");
			}
			
			WebElement checkBoxBolso = driver.findElement(By.xpath("//*[@id=\"bolso\"]"));

			//Verificar se o checkbox bolso é mostrado
			if(checkBoxBolso.isDisplayed()) {
				System.out.println("O checkbox bolso está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxBolso.isEnabled()) {
					System.out.println("O checkbox bolso está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxBolso.isSelected()) {
						System.out.println("O checkbox bolso está selecionado");
					}else {
						System.out.println("O checkbox bolso não está selecionado");
						//checkBoxBolso.click();
					}
				}else {
					System.out.println("O checkbox bolso não está habilitado");
				}
			}else {
				System.out.println("O checkbox bolso não está sendo mostrado");
			}
			
			WebElement checkBoxIdioma = driver.findElement(By.id("idioma_estrangeiro"));

			//Verificar se o checkbox é mostrado
			if(checkBoxIdioma.isDisplayed()) {
				System.out.println("O checkbox idioma está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxIdioma.isEnabled()) {
					System.out.println("O checkbox idioma está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxIdioma.isSelected()) {
						System.out.println("O checkbox idioma está selecionado");
					}else {
						System.out.println("O checkbox idioma não está selecionado");
						checkBoxIdioma.click();
					}
				}else {
					System.out.println("O checkbox idioma não está habilitado");
				}
			}else {
				System.out.println("O checkbox idioma não está sendo mostrado");
			}
			
			WebElement checkBoxDesenhos = driver.findElement(By.id("desenhos"));

			//Verificar se o checkbox é mostrado
			if(checkBoxDesenhos.isDisplayed()) {
				System.out.println("O checkbox desenhos está sendo mostrado");
				//Verificar se o checkbox está habilitado
				if(checkBoxDesenhos.isEnabled()) {
					System.out.println("O checkbox desenhos está habilitado");
					//Verificar se o checkbox está selecionado
					if(checkBoxDesenhos.isSelected()) {
						System.out.println("O checkbox desenhos está selecionado");
					}else {
						System.out.println("O checkbox desenhos não está selecionado");
						checkBoxDesenhos.click();
					}
				}else {
					System.out.println("O checkbox desenhos não está habilitado");
				}
			}else {
				System.out.println("O checkbox desenhos não está sendo mostrado");
			}
			
			WebElement radio0 = driver.findElement(By.id("livre"));
			WebElement radio12 = driver.findElement(By.id("12anos"));
			WebElement radio16 = driver.findElement(By.id("16anos"));
			WebElement radio18 = driver.findElement(By.id("18anos"));
			
			//Verificar se o radio button é mostrado
			if(radio0.isDisplayed()) {
				System.out.println("O radio button livre está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radio0.isEnabled()) {
					System.out.println("O radio button livre está habilitado");
					//Verificar se o radio button está selecionado
					if(radio0.isSelected()) {
						System.out.println("O radio button livre está selecionado");
					}else {
						System.out.println("O radio button livre não está selecionado");
						radio0.click();
					}
				}else {
					System.out.println("O radio button livre não está habilitado");
				}
			}else {
				System.out.println("O radio button livre não está sendo mostrado");
			}
			
			//Verificar se o radio button é mostrado
			if(radio12.isDisplayed()) {
				System.out.println("O radio button 12anos está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radio12.isEnabled()) {
					System.out.println("O radio button 12anos está habilitado");
					//Verificar se o radio button está selecionado
					if(radio12.isSelected()) {
						System.out.println("O radio button 12anos está selecionado");
					}else {
						System.out.println("O radio button 12anos não está selecionado");
						radio12.click();
					}
				}else {
					System.out.println("O radio button 12anos não está habilitado");
				}
			}else {
				System.out.println("O radio button 12anos não está sendo mostrado");
			}
			
			//Verificar se o radio button é mostrado
			if(radio16.isDisplayed()) {
				System.out.println("O radio button 16anos está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radio16.isEnabled()) {
					System.out.println("O radio button 16anos está habilitado");
					//Verificar se o radio button está selecionado
					if(radio16.isSelected()) {
						System.out.println("O radio button 16anos está selecionado");
					}else {
						System.out.println("O radio button 16anos não está selecionado");
					}
				}else {
					System.out.println("O radio button 16anos não está habilitado");
				}
			}else {
				System.out.println("O radio button 16anos não está sendo mostrado");
			}
			
			//Verificar se o radio button é mostrado
			if(radio18.isDisplayed()) {
				System.out.println("O radio button 18anos está sendo mostrado");
				//Verificar se o radio button está habilitado
				if(radio12.isEnabled()) {
					System.out.println("O radio button 18anos está habilitado");
					//Verificar se o radio button está selecionado
					if(radio12.isSelected()) {
						System.out.println("O radio button 18anos está selecionado");
					}else {
						System.out.println("O radio button 18anos não está selecionado");
						//radio18.click();
					}
				}else {
					System.out.println("O radio button 18anos não está habilitado");
				}
			}else {
				System.out.println("O radio button 18anos não está sendo mostrado");
			}
			
			//Tíulo 
			
			WebElement tit = driver.findElement(By.id("tituloCad"));
			
			//Verificar se o título é mostrado
			if(tit.isDisplayed()) {
				System.out.println("O título está sendo mostrado");
				//Verificar se o nome está habilitado
				if(tit.isEnabled()) {
					System.out.println("O título está habilitado");
					//Entrar com o nome
					if(tit.isEnabled()) {
						tit.sendKeys("Um Novo Sonho");
						System.out.println("O título foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo título");
					}
				}else {
					System.out.println("O título não está habilitado");
				}
			}else {
				System.out.println("O título não está sendo mostrado");
			}
			
			//numero de páginas
			WebElement pg = driver.findElement(By.xpath("//*[@id=\"numero\"]"));
			if(pg.isDisplayed()) {
				System.out.println("As páginas estão sendo mostradas");
				//Verificar se o nome está habilitado
				if(pg.isEnabled()) {
					System.out.println("As páginas estão habilitadas");
					//Entrar com número de páginas
					if(pg.isEnabled()) {
						pg.sendKeys("356");
						System.out.println("As páginas foram preenchidas");
					}else {
						System.out.println("Não foi possível preencher o campo páginas");
					}
				}else {
					System.out.println("As páginas não estão habilitado");
				}
			}else {
				System.out.println("As páginas não estão sendo mostrado");
			}
			
			//Autores
			WebElement autor = driver.findElement(By.id("autor"));
			if(autor.isDisplayed()) {
				System.out.println("O autor está sendo mostrado");
				//Verificar se o autor está habilitado
				if(autor.isEnabled()) {
					System.out.println("O autor está habilitado");
					//Entrar com a autor
					if(autor.isEnabled()) {
						autor.sendKeys("Gabriela Pereira");
						System.out.println("O autor foi preenchido");
					}else {
						System.out.println("Não foi possível preencher o campo autor");
					}
				}else {
					System.out.println("O autor não está habilitado");
				}
			}else {
				System.out.println("O autor está sendo mostrado");
			}
		
			//Testar os botões
			
			WebElement btnAutores = driver.findElement(By.id("addAutor"));
			WebElement btnCadL = driver.findElement(By.id("cadLivros"));
			
			//Verificar se o botão btnAutores está sendo mostrado
			if(btnAutores.isDisplayed()) {
				System.out.println("O botão para adicionar autores está sendo mostrado");
				//Verificar se o botão btnAutores está habilitado
				if(btnAutores.isEnabled()) {
					System.out.println("O botão para adicionar autores está sendo habilitado");
					btnAutores.click();
					System.out.println("O botão para adicionar autores foi clicado");
				}else {
					System.out.println("O botão para adicionar autores não está sendo habilitado");
				}
			}else {
				System.out.println("O botão para adicionar autores não está sendo mostrado");
			}
			
			
			//Verificar se o botão cadastrar está sendo mostrado
			if(btnCadL.isDisplayed()) {
				System.out.println("O botão para cadastrar livros está sendo mostrado");
				//Verificar se o botão cadastrar está habilitado
				if(btnCadL.isEnabled()) {
					System.out.println("O botão para cadastrar livros está sendo habilitado");
					btnCadL.click();
					System.out.println("O botão para cadastrar livros foi clicado");
				}else {
					System.out.println("O botão para cadastrar livros não está sendo habilitado");
				}
			}else {
				System.out.println("O botão para cadastrar livros não está sendo mostrado");
			}
			Thread.sleep(3000);
			Thread.sleep(3000);
			
		}else {
			System.out.println("Não foi para a página esperada");
			System.out.println("Deveria ter ido para "+urlEsperada);
			System.out.println("Mas foi para "+paginaAtual);
		}
	
	}
}