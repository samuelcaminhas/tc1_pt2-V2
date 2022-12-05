$(document).ready(function () {

    var listaPessoas = [
                    {
                    	"nome": "Samuel Caminhas",
                    	"cpf": "98503459264",
                    	"data_nasc": "12/10/1954",
                    	"emails": ["caminhas@caminhas.com"],
                    	"cep": "24430340",
                        "endereco": "Rua Pena Forte",
                        "numero": 562,
                    	"telefones": ["7336645894", "73984021998"],
                    	"profissao": "Mecânico de manutenção"
                    },
                    {
                    	"nome": "Giovanna Danelli Pau",
                    	"cpf": "58806097318",
                    	"data_nasc": "11/02/1981",
                    	"emails": ["danneli.pau@email.com"],
                    	"cep": "26550795",
                    	"endereco": "Rua Carlos Marques Rollo",
                    	"numero": 644,
                    	"telefones": ["2138938255", "21986761008"],
                    	"profissao": "Advogado"
                    },
                    {
                    	"nome": "Carlos Eduardo Henrique Iago Viana",
                    	"cpf": "99402812695",
                    	"data_nasc": "15/05/2000",
                    	"emails": ["carlos.eduardo.viana@esctech.com.br"],
                    	"cep": "96810380",
                    	"endereco": "Travessa Thomas",
                    	"numero": 816,
                		"telefones": ["5135396357"],
                		"profissao": "Operador de caixa"
                	},
                	{
                		"nome": "Nair Natália da Cruz",
                		"cpf": "97925493151",
                		"data_nasc": "13/03/1948",
                		"emails": ["nairnataliadacruz@artelazer.com"],
                		"senha": "3UutOHr8C4",
                		"cep": "72802620",
                		"endereco": "Quadra Quadra 7",
                		"numero": 632,
                		"telefones": ["61999324546"],
                		"profissao": "Cirurgião Plástico"
                	},
                	{
                		"nome": "Alice Stella Rita Farias",
                		"cpf": "97445308636",
                		"data_nasc": "14/01/1978",
                		"emails": ["alice_stella_farias@caporal.biz"],
                		"cep": "77080053",
                		"endereco": "Rua 6 A",
                		"numero": 178,
                		"telefones": ["6339168737", "63994028176"],
                		"profissao": "Gerente"
                	},
                	{
                		"nome": "Caroline Gabriela Fogaça",
                		"cpf": "32399811909",
                		"data_nasc": "25/01/1971",
                		"emails": ["caroline_fogaca@signa.net.br"],
                		"cep": "79904554",
                		"endereco": "Rua Antônio João",
                		"numero": 564,
                		"telefones": ["6736972607", "67982669901"],
                		"profissao": "Dentista"
                	},
                	{
                		"nome": "Letícia Natália Rosângela da Luz",
                		"cpf": "43044137403",
                		"data_nasc": "25/05/1988",
                		"emails": ["leticia.natalia.daluz@consultoriosjc.com.br"],
                		"cep": "69903020",
                		"endereco": "Rua do Coqueiro",
                		"numero": 268,
                		"telefones": ["6828002749", "68982745568", "68948445568"],
                		"profissao": "Musica"
                	},
                	{
                		"nome": "César Emanuel Rodrigues",
                		"cpf": "73530913715",
                		"data_nasc": "05/04/1965",
                		"emails": ["cesar_rodrigues@esctech.com.br"],
                		"cep": "59030480",
                		"endereco": "Rua Eduardo Medeiros",
                		"numero": 109,
                		"telefones": ["8429337576"],
                		"profissao": "Professor"
                	},
                	{
                		"nome": "Elias Ruan Antonio da Paz",
                		"cpf": "76318060987",
                		"data_nasc": "08/05/1947",
                		"emails": ["elias.ruan.dapaz@autbook.com"],
                		"cep": "25530536",
                		"endereco": "Rua João Gomes",
                		"numero": 827,
                		"telefones": ["21991493542"],
                		"profissao": "Aposentado"
                	},
                	{
                		"nome": "Tereza Bianca Kamilly Vieira",
                		"cpf": "79671054277",
                		"data_nasc": "03/04/1975",
                		"emails": ["tereza_vieira@sdrifs.com.br"],
                		"cep": "53409810",
                		"endereco": "Rua Trinta e Quatro",
                		"numero": 304,
                		"telefones": ["8127914903", "81996167884"],
                		"profissao": "Engenheira eletricista"
                	}
                ];


    function criarListaTabela(vetor){
        $('<ul>').appendTo($('td').last());
        for(var j = 0; j < vetor.length; j++){
            $('<li>').appendTo($('ul').last()).text(vetor[j]);
        }
    }

    //A função abaixo adiciona linhas na tabela
    function adicionarNaTabela(cpf, nome, endereco, emails, telefones, data_nascimento, profissao){
        $('<tr>').appendTo('tbody').addClass(cpf);
        $('<th>').appendTo($('tr').last()).text(cpf);
        $('<td>').appendTo($('tr').last()).text(nome);
        $('<td>').appendTo($('tr').last()).text(endereco);
        $('<td>').appendTo($('tr').last());
        criarListaTabela(emails);
        $('<td>').appendTo($('tr').last());
        criarListaTabela(telefones);
        $('<td>').appendTo($('tr').last()).text(data_nascimento);
        $('<td>').appendTo($('tr').last()).text(profissao);
    }

    function mostrarPessoas(pessoas){
        var cpf = "";
        var nome = "";
        var endereco = "";
        var profissao = "";
        var data_nascimento = "";
        var emails = [];
        var telefones = [];
        for (var i = 0; i < pessoas.length; i++) {
            cpf = pessoas[i].cpf;
            nome = pessoas[i].nome;
            endereco = pessoas[i].endereco + ", " + pessoas[i].numero + " - " + pessoas[i].cep;
            profissao = pessoas[i].profissao;
            data_nascimento = pessoas[i].data_nasc;
            emails = pessoas[i].emails;
            telefones = pessoas[i].telefones;
            adicionarNaTabela(cpf, nome, endereco, emails, telefones, data_nascimento, profissao);
        }
    }

    mostrarPessoas(listaPessoas);
    const body = document.querySelector("body"),
    modeToggle = body.querySelector(".mode-toggle");
    sidebar = body.querySelector("nav");
    sidebarToggle = body.querySelector(".sidebar-toggle");

    let getMode = localStorage.getItem("mode");
    if(getMode && getMode ==="dark"){
        body.classList.toggle("dark");
    }

    let getStatus = localStorage.getItem("status");
    if(getStatus && getStatus ==="close"){
        sidebar.classList.toggle("close");
    }

    modeToggle.addEventListener("click", () =>{
        body.classList.toggle("dark");
        if(body.classList.contains("dark")){
            localStorage.setItem("mode", "dark");
        }else{
            localStorage.setItem("mode", "light");
        }
    });

    sidebarToggle.addEventListener("click", () => {
        sidebar.classList.toggle("close");
        if(sidebar.classList.contains("close")){
            localStorage.setItem("status", "close");
        }else{
            localStorage.setItem("status", "open");
        }
    })

})