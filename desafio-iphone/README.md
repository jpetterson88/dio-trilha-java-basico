Diagrama que representa as funcionalidades do Iphone:

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar() void 
        +pausar() void
        +selecionarMusica(musica : String) void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(numero : String) void
        +atender() : void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(url : String) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
