$(document).ready(function () {

    var listaLivros = [
                    {
                    	"ISBN": 1000001,
                    	"titulo": "Binding To My Wife",
                    	"genero": "Romance",
                    	"autores": ["Cláudia Isabelly"],
                    	"pags": 368
                    },
                    {
                    	"ISBN": 1000002,
                    	"titulo": "Walking The Slaves",
                    	"genero": "Suspense",
                    	"autores": ["Sophie Lorena"],
                    	"pags": 272
                    },
                    {
                    	"ISBN": 1000003,
                    	"titulo": "Adopting The Light",
                    	"genero": "Suspense",
                    	"autores": ["Alícia Rosa Carla"],
                    	"pags": 352
                    },
                	{
                    	"ISBN": 1000004,
                    	"titulo": "Shelter In The Sun",
                    	"genero": "Romance",
                    	"autores": ["Sebastião Hugo"],
                    	"pags": 424
                    },
                	{
                    	"ISBN": 1000005,
                    	"titulo": "Walking My Nightmares",
                    	"genero": "Romance",
                    	"autores": ["Renan Diogo"],
                    	"pags": 208
                    },
                	{
                    	"ISBN": 1000006,
                    	"titulo": "Visiting The King",
                    	"genero": "Suspense",
                    	"autores": ["Sophie Yasmin"],
                    	"pags": 462
                    },
                	{
                    	"ISBN": 1000007,
                    	"titulo": "Bleeding At The Mountains",
                    	"genero": "Ficção",
                    	"autores": ["Ricardo Caio"],
                    	"pags": 320
                    },
                	{
                    	"ISBN": 1000008,
                    	"titulo": "Losing The Sun",
                    	"genero": "Romance",
                    	"autores": ["Mateus Lucca"],
                    	"pags": 320
                    },
                	{
                    	"ISBN": 1000009,
                    	"titulo": "Fade Into The Ocean",
                    	"genero": "Romance",
                    	"autores": ["Marcos Vinicius"],
                    	"pags": 304
                    },
                	{
                    	"ISBN": 1000010,
                    	"titulo": "Battle Of The Maze",
                    	"genero": "Ficção",
                    	"autores": ["Sebastião Araújo"],
                    	"pags": 256
                    }
                ];


    function criarListaTabela(vetor){
        $('<ul>').appendTo($('td').last());
        for(var j = 0; j < vetor.length; j++){
            $('<li>').appendTo($('ul').last()).text(vetor[j]);
        }
    }

    //A função abaixo adiciona linhas na tabela
    function adicionarNaTabela(isbn, titulo, genero, autores, pags){
        $('<tr>').appendTo('tbody').addClass(isbn);
        $('<th>').appendTo($('tr').last()).text(isbn);
        $('<td>').appendTo($('tr').last()).text(titulo);
        $('<td>').appendTo($('tr').last()).text(genero);
        $('<td>').appendTo($('tr').last());
        criarListaTabela(autores);
        $('<td>').appendTo($('tr').last()).text(pags);
    }

    function mostrarLivros(livros){
        var isbn, paginas;
        var titulo = "";
        var genero = "";
        var autores = [];
        for (var i = 0; i < livros.length; i++) {
            isbn = livros[i].ISBN;
            titulo = livros[i].titulo;
            genero = livros[i].genero;
            autores = livros[i].autores;
            paginas = livros[i].pags;
            adicionarNaTabela(isbn, titulo, genero, autores, paginas);
        }
    }

    mostrarLivros(listaLivros);
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